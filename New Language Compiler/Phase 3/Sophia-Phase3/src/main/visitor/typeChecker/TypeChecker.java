package main.visitor.typeChecker;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.Declaration;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.ConstructorDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.ast.nodes.declaration.variableDec.VarDeclaration;
import main.ast.nodes.expression.BinaryExpression;
import main.ast.nodes.expression.Identifier;
import main.ast.nodes.expression.ThisClass;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.statement.*;
import main.ast.nodes.statement.loop.BreakStmt;
import main.ast.nodes.statement.loop.ContinueStmt;
import main.ast.nodes.statement.loop.ForStmt;
import main.ast.nodes.statement.loop.ForeachStmt;
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

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.HashMap;

public class TypeChecker extends Visitor<Void> {
    private final Graph<String> classHierarchy;
    private final ExpressionTypeChecker expressionTypeChecker;
    private int numInLoops;
    private boolean currentMethodReturned;
    private Type currentMethodReturnType;

    public TypeChecker(Graph<String> classHierarchy) {
        this.classHierarchy = classHierarchy;
        this.expressionTypeChecker = new ExpressionTypeChecker(classHierarchy , null);
        this.numInLoops = 0;
        this.currentMethodReturnType = null;
        this.currentMethodReturned = false;
    }

    private Void checkParentName(ClassDeclaration cls){
        if(cls.getParentClassName() != null){
            // Parent Class must be declared
            try {
                SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + cls.getParentClassName().getName(), true);
            }catch(ItemNotFoundException exp){
                cls.addError(new ClassNotDeclared(cls.getLine() , cls.getParentClassName().getName()));
            }
            // Should not extend main
            if(cls.getParentClassName().getName().equals("Main"))
                cls.addError(new CannotExtendFromMainClass(cls.getLine()));
        }
        return null;
    }

    private Void checkMain(ClassDeclaration mainClass){
        if(mainClass.getParentClassName() != null)
            mainClass.addError(new MainClassCantExtend(mainClass.getLine()));
        if(mainClass.getConstructor() != null){
            if (!mainClass.getConstructor().getArgs().isEmpty())
                mainClass.getConstructor().addError(new MainConstructorCantHaveArgs(mainClass.getConstructor().getLine()));
        }else
            mainClass.addError(new NoConstructorInMainClass(mainClass));
        return null;
    }

    private Void checkConstructorName(ClassDeclaration cls){
        if(cls.getConstructor() != null){
            if(!cls.getConstructor().getMethodName().getName().equals(cls.getClassName().getName()))
                cls.getConstructor().addError(new ConstructorNotSameNameAsClass(cls.getConstructor().getLine()));
        }
        return null;
    }

    @Override
    public Void visit(Program program) {
        ClassDeclaration mainClass = null;
        ClassSymbolTableItem item = null;
        for(ClassDeclaration cls : program.getClasses()){
            if(cls.getClassName().getName().equals("Main") )
                mainClass = cls;
            try {
                item = (ClassSymbolTableItem) SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + cls.getClassName().getName() , true);
            }catch(ItemNotFoundException exp){
                // do nothing
            }
            SymbolTable.push(item.getClassSymbolTable());
            cls.accept(this);
            SymbolTable.pop();
        }
        if(mainClass == null)
            program.addError(new NoMainClass());
        else
            checkMain(mainClass);
        return null;
    }

    @Override
    public Void visit(ClassDeclaration classDeclaration) {
        MethodSymbolTableItem item = null;
        this.expressionTypeChecker.currentClassName = classDeclaration.getClassName();
        checkParentName(classDeclaration);
        checkConstructorName(classDeclaration);
        for(FieldDeclaration field : classDeclaration.getFields())
            field.accept(this);
        if(classDeclaration.getConstructor() != null) {
            try{
                item = (MethodSymbolTableItem) SymbolTable.top.getItem(MethodSymbolTableItem.START_KEY + classDeclaration.getConstructor().getMethodName().getName() , true);
            }catch(ItemNotFoundException exp){
                //Do nothing
            }
            SymbolTable.push(item.getMethodSymbolTable());
            classDeclaration.getConstructor().accept(this);
            SymbolTable.pop();
        }
        for(MethodDeclaration method : classDeclaration.getMethods()){
            try{
                item = (MethodSymbolTableItem) SymbolTable.top.getItem(MethodSymbolTableItem.START_KEY + method.getMethodName().getName() , true);
            }catch(ItemNotFoundException exp){
                //Do nothing
            }
            SymbolTable.push(item.getMethodSymbolTable());
            method.accept(this);
            SymbolTable.pop();
        }
        this.expressionTypeChecker.currentClassName = null;
        return null;
    }

    @Override
    public Void visit(ConstructorDeclaration constructorDeclaration) {
        this.visit((MethodDeclaration) constructorDeclaration);
        return null;
    }

    @Override
    public Void visit(MethodDeclaration methodDeclaration) {
        this.currentMethodReturned = false;
        checkTypeValidation(methodDeclaration.getReturnType() ,  methodDeclaration);
        this.currentMethodReturnType = methodDeclaration.getReturnType();
        for(VarDeclaration var : methodDeclaration.getArgs())
            var.accept(this);
        for(VarDeclaration var : methodDeclaration.getLocalVars())
            var.accept(this);
        for(Statement stmt : methodDeclaration.getBody())
            stmt.accept(this);

        if(!(currentMethodReturnType instanceof NullType) & !this.currentMethodReturned)
            methodDeclaration.addError(new MissingReturnStatement(methodDeclaration) );

        this.currentMethodReturnType = null;
        return null;
    }

    @Override
    public Void visit(FieldDeclaration fieldDeclaration) {
        fieldDeclaration.getVarDeclaration().accept(this);
        return null;
    }

    private boolean checkTypesValidation(ArrayList<Type> types , Declaration varDeclaration){
        boolean noError = true;
        for(Type type : types)
            noError = noError & checkTypeValidation(type, varDeclaration);

        return noError;
    }

    private boolean checkListTypeSameId(ArrayList<ListNameType> Elements , Declaration varDeclaration){
        for(int i = 0 ; i < (Elements.size() - 1) ; i++){
            for(int j = i + 1 ; j < Elements.size() ; j++){
                if(Elements.get(i).getName().getName().equals("") || Elements.get(j).getName().getName().equals(""))
                    continue;
                if(Elements.get(i).getName().getName().equals(Elements.get(j).getName().getName() ) ) {
                    varDeclaration.addError(new DuplicateListId(varDeclaration.getLine() ) );
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkListTypeValidation(ListType type , Declaration varDeclaration){
        boolean check = true;
        if(type.getElementsTypes().size() <= 0) {
            varDeclaration.addError(new CannotHaveEmptyList(varDeclaration.getLine()));
            return false;
        }else {
            check = check & checkListTypeSameId(type.getElementsTypes(), varDeclaration);
            check = check & checkTypesValidation(expressionTypeChecker.getListTypeTypes(type), varDeclaration);
        }
        return check;
    }

    private boolean checkTypeValidation(Type type , Declaration varDeclaration){
        if(type instanceof ClassType){
            try {
                SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + ((ClassType) type).getClassName().getName(), true);
                return true;
            }catch(ItemNotFoundException exp){
                varDeclaration.addError(new ClassNotDeclared(varDeclaration.getLine() , ((ClassType) type).getClassName().getName() ) );
                return false;
            }
        }else if(type instanceof ListType)
            return checkListTypeValidation((ListType) type , varDeclaration);
        else if(type instanceof FptrType) {
            return (checkTypeValidation(((FptrType) type).getReturnType(), varDeclaration)
                    && checkTypesValidation(((FptrType) type).getArgumentsTypes(), varDeclaration));
        }
        return true;
    }

    @Override
    public Void visit(VarDeclaration varDeclaration) {
        FieldSymbolTableItem fieldItem;
        LocalVariableSymbolTableItem localVar;
        if(checkTypeValidation(varDeclaration.getType() , varDeclaration) )
            return null;
        if(currentMethodReturnType == null) { //Field Declaration
            try{
                fieldItem = (FieldSymbolTableItem) SymbolTable.top.getItem(FieldSymbolTableItem.START_KEY + varDeclaration.getVarName().getName() , true);
                fieldItem.setType(new NoType());
            }catch(ItemNotFoundException exp) {/*Do nothing*/}
        }else{ // Local Variable and Arguments Declaration
            try{
                localVar = (LocalVariableSymbolTableItem) SymbolTable.top.getItem(LocalVariableSymbolTableItem.START_KEY + varDeclaration.getVarName().getName() , true);
                localVar.setType(new NoType());
            }catch(ItemNotFoundException exp) {/*Do nothing*/}
        }
        return null;
    }

    private Void checkAssignOperator(boolean leftValueCheck , Type leftValue , Type rightValue , AssignmentStmt assignmentStmt){
        boolean properAssignment;
        if(!leftValueCheck)
            assignmentStmt.addError(new LeftSideNotLvalue(assignmentStmt.getLine()));

        if(rightValue instanceof NoType)
            return null;

        properAssignment = this.expressionTypeChecker.isSubType(rightValue , leftValue);
        if(!properAssignment)
            assignmentStmt.addError(new UnsupportedOperandType(assignmentStmt.getLine(), BinaryOperator.assign.name() ));
        return null;
    }

    @Override
    public Void visit(AssignmentStmt assignmentStmt) {
        Type rightType = assignmentStmt.getrValue().accept(expressionTypeChecker);
        expressionTypeChecker.isCurrentLValue = true;
        Type leftType = assignmentStmt.getlValue().accept(expressionTypeChecker);
        // Important
        if(assignmentStmt.getlValue() instanceof ThisClass)
            expressionTypeChecker.isCurrentLValue = false;
        //
        checkAssignOperator(expressionTypeChecker.isCurrentLValue, leftType , rightType , assignmentStmt);
        return null;
    }

    @Override
    public Void visit(BlockStmt blockStmt) {
        for(Statement stmt : blockStmt.getStatements())
            stmt.accept(this);
        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        Type typeCheck = conditionalStmt.getCondition().accept(expressionTypeChecker);
        if(!(typeCheck instanceof BoolType) && !(typeCheck instanceof NoType))
            conditionalStmt.addError(new ConditionNotBool(conditionalStmt.getLine() ) );
        conditionalStmt.getThenBody().accept(this);
        if(conditionalStmt.getElseBody() != null)
            conditionalStmt.getElseBody().accept(this);
        return null;
    }

    @Override
    public Void visit(MethodCallStmt methodCallStmt) {
        expressionTypeChecker.isExpressionOutputUsable = false;
        methodCallStmt.getMethodCall().accept(this.expressionTypeChecker);
        expressionTypeChecker.isExpressionOutputUsable = true;
        return null;
    }

    @Override
    public Void visit(PrintStmt print) {
        Type argType = print.getArg().accept(expressionTypeChecker);
        if(argType instanceof NoType)
            return null;
        if(!(argType instanceof IntType) && !(argType instanceof BoolType) && !(argType instanceof StringType))
            print.addError(new UnsupportedTypeForPrint(print.getLine()) );
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        Type assertedReturnType;
        this.currentMethodReturned = true;
        if(returnStmt.getReturnedExpr() == null)
            assertedReturnType = new NullType();
        else
            assertedReturnType = returnStmt.getReturnedExpr().accept(expressionTypeChecker);

        if(!expressionTypeChecker.isSubType(assertedReturnType , currentMethodReturnType) )
            returnStmt.addError(new ReturnValueNotMatchMethodReturnType(returnStmt) );
        return null;
    }

    @Override
    public Void visit(BreakStmt breakStmt) {
        if(this.numInLoops <= 0)
            breakStmt.addError(new ContinueBreakNotInLoop(breakStmt.getLine() , 0));
        return null;
    }

    @Override
    public Void visit(ContinueStmt continueStmt) {
        if(this.numInLoops <= 0)
            continueStmt.addError(new ContinueBreakNotInLoop(continueStmt.getLine() , 1));
        return null;
    }

    private Void checkForeachScenario(ListType listType , ForeachStmt foreachStmt){
        if(expressionTypeChecker.checkMultiTypeList(listType) )
            foreachStmt.addError(new ForeachListElementsNotSameType(foreachStmt.getLine()) );
        if(!expressionTypeChecker.checkEqualityType(listType.getElementsTypes().get(0).getType() , foreachStmt.getVariable().accept(expressionTypeChecker) ) )
            foreachStmt.addError(new ForeachVarNotMatchList(foreachStmt) );
        return null;
    }

    @Override
    public Void visit(ForeachStmt foreachStmt) {
        Type listType = foreachStmt.getList().accept(expressionTypeChecker);
        if(!(listType instanceof ListType) && !(listType instanceof NoType))
            foreachStmt.addError(new ForeachCantIterateNoneList(foreachStmt.getLine() ));
        else if (listType instanceof ListType)
            checkForeachScenario((ListType) listType , foreachStmt);
        this.numInLoops++;
        foreachStmt.getBody().accept(this);
        this.numInLoops--;
        return null;
    }

    @Override
    public Void visit(ForStmt forStmt) {
        Type forConditionType;
        if(forStmt.getInitialize() != null)
            forStmt.getInitialize().accept(this);
        if(forStmt.getUpdate() != null)
            forStmt.getUpdate().accept(this);
        if(forStmt.getCondition() != null){
            forConditionType = forStmt.getCondition().accept(expressionTypeChecker);
            if(!(forConditionType instanceof BoolType) && !(forConditionType instanceof NoType))
                forStmt.addError(new ConditionNotBool(forStmt.getLine() ) );
        }
        this.numInLoops++;
        forStmt.getBody().accept(this);
        this.numInLoops--;
        return null;
    }

}
