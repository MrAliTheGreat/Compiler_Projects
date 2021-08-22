package main.visitor.typeChecker;

import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.expression.operators.UnaryOperator;
import main.ast.nodes.expression.values.ListValue;
import main.ast.nodes.expression.values.NullValue;
import main.ast.nodes.expression.values.primitive.BoolValue;
import main.ast.nodes.expression.values.primitive.IntValue;
import main.ast.nodes.expression.values.primitive.StringValue;
import main.ast.types.NoType;
import main.ast.types.NullType;
import main.ast.types.Type;
import main.ast.types.functionPointer.FptrType;
import main.ast.types.list.ListNameType;
import main.ast.types.list.ListType;
import main.ast.types.single.BoolType;
import main.ast.types.single.ClassType;
import main.ast.types.single.IntType;
import main.ast.types.single.StringType;
import main.compileErrorException.typeErrors.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.ClassSymbolTableItem;
import main.symbolTable.items.FieldSymbolTableItem;
import main.symbolTable.items.LocalVariableSymbolTableItem;
import main.symbolTable.items.MethodSymbolTableItem;
import main.symbolTable.utils.graph.Graph;
import main.visitor.Visitor;

import java.lang.reflect.Method;
import java.util.ArrayList;


public class ExpressionTypeChecker extends Visitor<Type> {
    public Identifier currentClassName;
    public boolean isExpressionOutputUsable;
    public boolean isCurrentLValue;

    private final Graph<String> classHierarchy;

    public ExpressionTypeChecker(Graph<String> classHierarchy , Identifier currentClassName) {
        this.classHierarchy = classHierarchy;
        this.currentClassName = currentClassName;
        this.isExpressionOutputUsable = true;
        this.isCurrentLValue = true;
    }

    private boolean isSubTypeAll(ArrayList<Type> slaveTypes , ArrayList<Type> masterTypes){
        if(slaveTypes.size() != masterTypes.size() )
            return false;
        for(int i = 0 ; i < slaveTypes.size() ; i++){
            if(!isSubType(slaveTypes.get(i) , masterTypes.get(i)) )
                return false;
        }
        return true;
    }

    public boolean isSubType(Type slaveType , Type masterType){
        if((slaveType instanceof NoType) || (masterType instanceof NoType) )
            return true;
        else if((slaveType instanceof NullType) && ((masterType instanceof ClassType) || (masterType instanceof FptrType)) )
            return true;
        else if(!slaveType.getClass().equals(masterType.getClass()) )
            return false;
        else if((slaveType instanceof ClassType) && (masterType instanceof ClassType) )
            return ( (((ClassType) slaveType).getClassName().getName().equals(((ClassType) masterType).getClassName().getName() ))
                    || classHierarchy.isSecondNodeAncestorOf(((ClassType) slaveType).getClassName().getName() , ((ClassType) masterType).getClassName().getName() ) );
        else if((slaveType instanceof ListType) && (masterType instanceof ListType) )
            return isSubTypeAll(getListTypeTypes((ListType) slaveType) , getListTypeTypes((ListType) masterType));
        else if((slaveType instanceof FptrType) && (masterType instanceof FptrType) )
            return (isSubType(((FptrType) slaveType).getReturnType() , ((FptrType) masterType).getReturnType())
                    && isSubTypeAll(((FptrType) masterType).getArgumentsTypes() , ((FptrType) slaveType).getArgumentsTypes()) );
        return true;
    }

    public ArrayList<Type> getListTypeTypes(ListType listType){
        ArrayList<Type> typesList = new ArrayList<>();
        for(ListNameType element : listType.getElementsTypes())
            typesList.add(element.getType());
        return typesList;
    }

    public boolean checkEqualityType(Type type1 , Type type2){
        return (isSubType(type1 , type2) && isSubType(type2 , type1));
    }

    private boolean checkArguments(ArrayList<Type> list1 , ArrayList<Type> list2){
        if(list1.size() != list2.size())
            return false;
        for(int i = 0 ; i < list1.size() ; i++) {
            if(!checkEqualityType(list1.get(i) , list2.get(i) ) )
                return false;
        }
        return true;
    }

    private Type checkBinaryLogicalOperators(Type firstType , Type secondType , BinaryExpression binaryExpression){
        if(!(firstType instanceof BoolType) && !(firstType instanceof NoType)) {
            binaryExpression.addError(new UnsupportedOperandType(binaryExpression.getLine() , binaryExpression.getBinaryOperator().name()));
            return new NoType();
        }
        if(!(secondType instanceof BoolType) && !(secondType instanceof NoType)){
            binaryExpression.addError(new UnsupportedOperandType(binaryExpression.getLine() , binaryExpression.getBinaryOperator().name()));
            return new NoType();
        }
        if((firstType instanceof BoolType) && (secondType instanceof BoolType))
            return new BoolType();

        return new NoType();
    }

    private Type checkBinaryMathOperators(Type firstType , Type secondType , BinaryExpression binaryExpression){
        if(!(firstType instanceof IntType) && !(firstType instanceof NoType)) {
            binaryExpression.addError(new UnsupportedOperandType(binaryExpression.getLine() , binaryExpression.getBinaryOperator().name()));
            return new NoType();
        }
        if(!(secondType instanceof IntType) && !(secondType instanceof NoType)){
            binaryExpression.addError(new UnsupportedOperandType(binaryExpression.getLine() , binaryExpression.getBinaryOperator().name()));
            return new NoType();
        }
        if((firstType instanceof IntType) && (secondType instanceof IntType)) {
            if(binaryExpression.getBinaryOperator() == BinaryOperator.gt || binaryExpression.getBinaryOperator() == BinaryOperator.lt)
                return new BoolType();
            else
                return new IntType();
        }
        return new NoType();
    }

    private Type checkClassScenarios(Type firstType , Type secondType , BinaryExpression binaryExpression){
        if((firstType instanceof NullType) || (secondType instanceof NullType))
            return new BoolType();
        if((firstType instanceof ClassType) && (secondType instanceof ClassType)){
            if(((ClassType) firstType).getClassName().getName().equals(((ClassType) secondType).getClassName().getName() ) )
                return new BoolType();
            else
                binaryExpression.addError(new UnsupportedOperandType(binaryExpression.getLine() , binaryExpression.getBinaryOperator().name()));
        }else
            binaryExpression.addError(new UnsupportedOperandType(binaryExpression.getLine() , binaryExpression.getBinaryOperator().name()));
        return new NoType();
    }

    private Type checkFunctionPointerScenarios(Type firstType , Type secondType , BinaryExpression binaryExpression){
        if((firstType instanceof NullType) || (secondType instanceof NullType))
            return new BoolType();
        if((firstType instanceof FptrType) && (secondType instanceof FptrType)){
            if( checkEqualityType(((FptrType) firstType).getReturnType() , ((FptrType) secondType).getReturnType() )
                && checkArguments(((FptrType) firstType).getArgumentsTypes() , ((FptrType) secondType).getArgumentsTypes()) )
                return new BoolType();
            else
                binaryExpression.addError(new UnsupportedOperandType(binaryExpression.getLine() , binaryExpression.getBinaryOperator().name()));
        }else
            binaryExpression.addError(new UnsupportedOperandType(binaryExpression.getLine() , binaryExpression.getBinaryOperator().name()));
        return new NoType();
    }

    private Type checkEqualityOperator(Type firstType , Type secondType , BinaryExpression binaryExpression){
        if(firstType instanceof ListType || secondType instanceof ListType) {
            binaryExpression.addError(new UnsupportedOperandType(binaryExpression.getLine() , binaryExpression.getBinaryOperator().name()));
            return new NoType();
        }
        if(firstType instanceof NoType || secondType instanceof NoType)
            return new NoType();
        if((firstType instanceof ClassType) || (secondType instanceof ClassType))
            return checkClassScenarios(firstType , secondType , binaryExpression);
        else if((firstType instanceof FptrType) || (secondType instanceof FptrType))
            return checkFunctionPointerScenarios(firstType , secondType , binaryExpression);
        else if(firstType.getClass().equals(secondType.getClass() ))
            return new BoolType();
        else
            binaryExpression.addError(new UnsupportedOperandType(binaryExpression.getLine() , binaryExpression.getBinaryOperator().name()));
        return new NoType();
    }

    private Type checkAssignOperator(boolean leftValueCheck , Type leftValue , Type rightValue , BinaryExpression binaryExpression){
        boolean properAssignment;
        if(!leftValueCheck)
            binaryExpression.addError(new LeftSideNotLvalue(binaryExpression.getLine()));

        if(rightValue instanceof NoType)
            return new NoType();
        properAssignment = isSubType(rightValue , leftValue);
        if(!properAssignment)
            binaryExpression.addError(new UnsupportedOperandType(binaryExpression.getLine(), binaryExpression.getBinaryOperator().name() ));
        if(properAssignment && leftValueCheck)
            return rightValue;
        return new NoType();
    }

    @Override
    public Type visit(BinaryExpression binaryExpression) {
        boolean leftValueCheck;
        this.isCurrentLValue = true;
        Type firstType = binaryExpression.getFirstOperand().accept(this);
        leftValueCheck = this.isCurrentLValue;
        // Important
        if(binaryExpression.getFirstOperand() instanceof ThisClass)
            leftValueCheck = false;
        //
        Type secondType = binaryExpression.getSecondOperand().accept(this);
        this.isCurrentLValue = false;
        if((binaryExpression.getBinaryOperator() == BinaryOperator.and) || (binaryExpression.getBinaryOperator() == BinaryOperator.or) )
            return checkBinaryLogicalOperators(firstType , secondType , binaryExpression);// Logical Operators
        else if( (binaryExpression.getBinaryOperator() == BinaryOperator.eq) || (binaryExpression.getBinaryOperator() == BinaryOperator.neq) )
            return checkEqualityOperator(firstType , secondType , binaryExpression);// Equality Operators
        else if(binaryExpression.getBinaryOperator() == BinaryOperator.assign)
            return checkAssignOperator(leftValueCheck , firstType , secondType , binaryExpression);
        else
            return checkBinaryMathOperators(firstType , secondType , binaryExpression); // Binary Mathematical Operators
    }

    private Type checkNot(Type operandType , UnaryExpression unaryExpression){
        if(operandType instanceof NoType)
            return new NoType();
        else if(operandType instanceof BoolType)
            return new BoolType();
        else
            unaryExpression.addError(new UnsupportedOperandType(unaryExpression.getLine() , unaryExpression.getOperator().name()));
        return new NoType();
    }

    private Type checkMinus(Type operandType , UnaryExpression unaryExpression){
        if(operandType instanceof NoType)
            return new NoType();
        else if(operandType instanceof IntType)
            return new IntType();
        else
            unaryExpression.addError(new UnsupportedOperandType(unaryExpression.getLine() , unaryExpression.getOperator().name()));
        return new NoType();
    }

    private Type checkIncDecOperators(boolean isOperandLValue, Type operandType , UnaryExpression unaryExpression){
        if(!isOperandLValue)
            unaryExpression.addError(new IncDecOperandNotLvalue(unaryExpression.getLine() , unaryExpression.getOperator().name() ));
        if(!(operandType instanceof IntType) && !(operandType instanceof NoType))
            unaryExpression.addError(new UnsupportedOperandType(unaryExpression.getLine() , unaryExpression.getOperator().name() ));
        if(isOperandLValue && (operandType instanceof IntType))
            return operandType;
        return new NoType();
    }

    @Override
    public Type visit(UnaryExpression unaryExpression) {
        boolean isOperandLValue;
        this.isCurrentLValue = true;
        Type operandType = unaryExpression.getOperand().accept(this);
        isOperandLValue = this.isCurrentLValue;
        // Important
        if(unaryExpression.getOperand() instanceof ThisClass)
            isOperandLValue = false;
        //
        this.isCurrentLValue = false;
        if(unaryExpression.getOperator() == UnaryOperator.not)
            return checkNot(operandType , unaryExpression);
        else if(unaryExpression.getOperator() == UnaryOperator.minus)
            return checkMinus(operandType , unaryExpression);
        else
            return checkIncDecOperators(isOperandLValue , operandType , unaryExpression);
    }


    private Type checkClassTypeValidity(ClassType exprType , Identifier memberName , ObjectOrListMemberAccess objectOrListMemberAccess){
        ClassSymbolTableItem classItem;
        FieldSymbolTableItem fieldItem;
        MethodSymbolTableItem methodItem;
        try{
            classItem = (ClassSymbolTableItem) SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + exprType.getClassName().getName(), true);
            try{
                fieldItem = (FieldSymbolTableItem) classItem.getClassSymbolTable().getItem(FieldSymbolTableItem.START_KEY + memberName.getName() , true);
                return fieldItem.getType();
            }catch(ItemNotFoundException exp){ // find method
                try{
                    methodItem = (MethodSymbolTableItem) classItem.getClassSymbolTable().getItem(MethodSymbolTableItem.START_KEY + memberName.getName() , true);
                    this.isCurrentLValue= false;
                    return new FptrType(methodItem.getArgTypes() , methodItem.getReturnType());
                }catch (ItemNotFoundException ex){
                    if(classItem.getName().equals(memberName.getName() ) & (classItem.getClassDeclaration().getConstructor() == null) )
                        return new FptrType(new ArrayList<>() , new NullType() );
                    objectOrListMemberAccess.addError(new MemberNotAvailableInClass(objectOrListMemberAccess.getLine(), memberName.getName() , exprType.getClassName().getName()));
                    return new NoType();
                }
            }
        }catch (ItemNotFoundException exp){ return new NoType(); }
    }
    private Type checkListTypeValidity(ListType exprType , Identifier memberName , ObjectOrListMemberAccess objectOrListMemberAccess) {
        for(ListNameType element : exprType.getElementsTypes()){
            if(element.getName().getName().equals(memberName.getName()))
                return element.getType();
        }
        objectOrListMemberAccess.addError(new ListMemberNotFound(objectOrListMemberAccess.getLine() , memberName.getName() ));
        return new NoType();
    }

    @Override
    public Type visit(ObjectOrListMemberAccess objectOrListMemberAccess) {
        Type exprType = objectOrListMemberAccess.getInstance().accept(this);
        if(exprType instanceof NoType)
            return new NoType();
        if(!(exprType instanceof ClassType) && !(exprType instanceof ListType)) {
            objectOrListMemberAccess.addError(new MemberAccessOnNoneObjOrListType(objectOrListMemberAccess.getLine()));
            return new NoType();
        }
        if(exprType instanceof ClassType)
            return checkClassTypeValidity((ClassType) exprType , objectOrListMemberAccess.getMemberName() , objectOrListMemberAccess);
        else// ListType
            return checkListTypeValidity((ListType) exprType , objectOrListMemberAccess.getMemberName() , objectOrListMemberAccess);
    }

    @Override
    public Type visit(Identifier identifier) {
        LocalVariableSymbolTableItem item;
        try{
            item = (LocalVariableSymbolTableItem) SymbolTable.top.getItem(LocalVariableSymbolTableItem.START_KEY + identifier.getName() , true);
            return item.getType();
        }catch(ItemNotFoundException exp){
            identifier.addError(new VarNotDeclared(identifier.getLine() , identifier.getName()));
            return new NoType();
        }
    }

    public boolean checkMultiTypeList(ListType listType){
        Type firstElementType = listType.getElementsTypes().get(0).getType();
        for(ListNameType element : listType.getElementsTypes()){
            if(!checkEqualityType(element.getType() , firstElementType) )
                return true;
        }
        return false;
    }

    private Type checkListIndexValidity(ListType listType , Type indexType , ListAccessByIndex listAccessByIndex){
        if(checkMultiTypeList(listType) ){
            if(listAccessByIndex.getIndex() instanceof IntValue)
                return listType.getElementsTypes().get( ((IntValue) listAccessByIndex.getIndex()).getConstant() ).getType();
            else
                listAccessByIndex.addError(new CantUseExprAsIndexOfMultiTypeList(listAccessByIndex.getLine()));
        }else{
            if(indexType instanceof NoType)
                return new NoType();
            return listType.getElementsTypes().get(0).getType();
        }
        return new NoType();
    }


    @Override
    public Type visit(ListAccessByIndex listAccessByIndex) {
        boolean prevIsCurrentLValue;
        Type exprType = listAccessByIndex.getInstance().accept(this);
        prevIsCurrentLValue = this.isCurrentLValue;
        Type indexType = listAccessByIndex.getIndex().accept(this);
        this.isCurrentLValue = prevIsCurrentLValue;
        if(!(indexType instanceof IntType) && !(indexType instanceof NoType) )
            listAccessByIndex.addError(new ListIndexNotInt(listAccessByIndex.getLine()));
        if(!(exprType instanceof ListType) && !(exprType instanceof NoType) )
            listAccessByIndex.addError(new ListAccessByIndexOnNoneList(listAccessByIndex.getLine() ) );
        if(exprType instanceof NoType)
            return new NoType();
        if((indexType instanceof IntType || indexType instanceof NoType) && (exprType instanceof ListType)  )
            return checkListIndexValidity((ListType) exprType , indexType , listAccessByIndex);
        return new NoType();
    }

    private boolean checkFunctionValidity(FptrType exprType , MethodCall methodCall) {
        ArrayList<Type> typeExpressions = checkExpressionArray(methodCall.getArgs() );
        if(isSubTypeAll(typeExpressions , exprType.getArgumentsTypes()) )
            return true;

        return false;
    }

    @Override
    public Type visit(MethodCall methodCall) {
        boolean functionArgsValidity;
        boolean isMethodCallOutputUsable;
        Type exprType = methodCall.getInstance().accept(this);
        if(exprType instanceof NoType){
            this.isCurrentLValue= false;
            return new NoType();
        }
        else if(exprType instanceof FptrType){
            isMethodCallOutputUsable = ( ((FptrType) exprType).getReturnType() instanceof NullType) & isExpressionOutputUsable;
            functionArgsValidity = checkFunctionValidity((FptrType) exprType, methodCall);
            if(isMethodCallOutputUsable)
                 methodCall.addError(new CantUseValueOfVoidMethod(methodCall.getLine()));
            if(!functionArgsValidity)
                methodCall.addError(new MethodCallNotMatchDefinition(methodCall.getLine()) );
            if(functionArgsValidity && !isMethodCallOutputUsable){
                this.isCurrentLValue= false;
                return ((FptrType) exprType).getReturnType();
            }
        }else
            methodCall.addError(new CallOnNoneFptrType(methodCall.getLine()) );
        this.isCurrentLValue= false;
        return new NoType();
    }

    private ArrayList<Type> checkExpressionArray(ArrayList<Expression> expressions){
        ArrayList<Type> typeExpressions = new ArrayList<>();
        for(Expression expression : expressions)
            typeExpressions.add(expression.accept(this) );

        return typeExpressions;
    }

    private boolean checkConstructor(ClassSymbolTableItem classItem , NewClassInstance newClassInstance){
        MethodSymbolTableItem methodItem;
        ArrayList<Type> typeExpressions;
        if(classItem.getClassDeclaration().getConstructor() == null) {
            if(newClassInstance.getArgs().isEmpty() )
                return true;
            else{
                newClassInstance.addError(new ConstructorArgsNotMatchDefinition(newClassInstance) );
                return false;
            }
        }
        try{
            methodItem = (MethodSymbolTableItem) classItem.getClassSymbolTable().getItem(MethodSymbolTableItem.START_KEY + newClassInstance.getClassType().getClassName().getName() , true);
            typeExpressions = checkExpressionArray(newClassInstance.getArgs());
            if(isSubTypeAll(typeExpressions , methodItem.getArgTypes()) )
                return true;
            else
                newClassInstance.addError(new ConstructorArgsNotMatchDefinition(newClassInstance) );
        }catch(ItemNotFoundException exp){ /*Already Checked*/}
        return false;
    }

    @Override
    public Type visit(NewClassInstance newClassInstance) {
        ClassSymbolTableItem classItem;
        try{
            classItem = (ClassSymbolTableItem) SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + newClassInstance.getClassType().getClassName().getName() , true);
            if(checkConstructor(classItem , newClassInstance) ){
                this.isCurrentLValue= false;
                return newClassInstance.getClassType();
            }
        }catch(ItemNotFoundException exp){
            newClassInstance.addError(new ClassNotDeclared(newClassInstance.getLine(), newClassInstance.getClassType().getClassName().getName()));
        }
        this.isCurrentLValue= false;
        return new NoType();
    }

    @Override
    public Type visit(ThisClass thisClass) {
        return new ClassType(currentClassName);
    }

    @Override
    public Type visit(ListValue listValue) {
        ListType listType = new ListType();
        for(Expression exp : listValue.getElements())
            listType.addElementType(new ListNameType(exp.accept(this)));
        this.isCurrentLValue= false;
        return listType;
    }

    @Override
    public Type visit(NullValue nullValue) {
        this.isCurrentLValue= false;
        return new NullType();
    }

    @Override
    public Type visit(IntValue intValue) {
        this.isCurrentLValue= false;
        return new IntType();
    }

    @Override
    public Type visit(BoolValue boolValue) {
        this.isCurrentLValue= false;
        return new BoolType();
    }

    @Override
    public Type visit(StringValue stringValue) {
        this.isCurrentLValue= false;
        return new StringType();
    }
}
