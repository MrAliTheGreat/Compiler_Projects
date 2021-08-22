package main.visitor.codeGenerator;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.ConstructorDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.ast.nodes.declaration.variableDec.VarDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.expression.operators.UnaryOperator;
import main.ast.nodes.expression.values.ListValue;
import main.ast.nodes.expression.values.NullValue;
import main.ast.nodes.expression.values.primitive.BoolValue;
import main.ast.nodes.expression.values.primitive.IntValue;
import main.ast.nodes.expression.values.primitive.StringValue;
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
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.ClassSymbolTableItem;
import main.symbolTable.items.FieldSymbolTableItem;
import main.symbolTable.utils.graph.Graph;
import main.visitor.Visitor;
import main.visitor.typeChecker.ExpressionTypeChecker;

import javax.swing.*;
import java.io.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.PrimitiveIterator;

public class CodeGenerator extends Visitor<String> {
    ExpressionTypeChecker expressionTypeChecker;
    Graph<String> classHierarchy;
    private String outputPath;
    private FileWriter currentFile;
    private ClassDeclaration currentClass;
    private MethodDeclaration currentMethod;
    private int tempVariableStartSlot;
    private int labelNumber;
    private String ContinueLabel;
    private String BreakLabel;

    public CodeGenerator(Graph<String> classHierarchy) {
        ContinueLabel = null;
        BreakLabel = null;
        labelNumber = 1;
        this.classHierarchy = classHierarchy;
        this.expressionTypeChecker = new ExpressionTypeChecker(classHierarchy);
        this.prepareOutputFolder();
    }

    private void prepareOutputFolder() {
        this.outputPath = "output/";
        String jasminPath = "utilities/jarFiles/jasmin.jar";
        String listClassPath = "utilities/codeGenerationUtilityClasses/List.j";
        String fptrClassPath = "utilities/codeGenerationUtilityClasses/Fptr.j";
        try{
            File directory = new File(this.outputPath);
            File[] files = directory.listFiles();
            if(files != null)
                for (File file : files)
                    file.delete();
            directory.mkdir();
        }
        catch(SecurityException e) { }
        copyFile(jasminPath, this.outputPath + "jasmin.jar");
        copyFile(listClassPath, this.outputPath + "List.j");
        copyFile(fptrClassPath, this.outputPath + "Fptr.j");
    }

    private void copyFile(String toBeCopied, String toBePasted) {
        try {
            File readingFile = new File(toBeCopied);
            File writingFile = new File(toBePasted);
            InputStream readingFileStream = new FileInputStream(readingFile);
            OutputStream writingFileStream = new FileOutputStream(writingFile);
            byte[] buffer = new byte[1024];
            int readLength;
            while ((readLength = readingFileStream.read(buffer)) > 0)
                writingFileStream.write(buffer, 0, readLength);
            readingFileStream.close();
            writingFileStream.close();
        } catch (IOException e) { }
    }

    private void createFile(String name) {
        try {
            String path = this.outputPath + name + ".j";
            File file = new File(path);
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(path);
            this.currentFile = fileWriter;
        } catch (IOException e) {}
    }

    private void addCommand(String command) {
        try {
            command = String.join("\n\t\t", command.split("\n"));
            if(command.startsWith("Label_"))
                this.currentFile.write("\t" + command + "\n");
            else if(command.startsWith("."))
                this.currentFile.write(command + "\n");
            else
                this.currentFile.write("\t\t" + command + "\n");
            this.currentFile.flush();
        } catch (IOException e) {}
    }

    private void specifyLocalsAndStack(){
        addCommand(".limit stack 128");
        addCommand(".limit locals 128");
    }

    private String aloadInstruction(int slotNumber){
        if(slotNumber >= 0 && slotNumber <= 3)
            return "aload_" + slotNumber + "\n";
        else
            return "aload " + slotNumber + "\n";
    }

    private String astoreInstruction(int slotNumber){
        if(slotNumber >= 0 && slotNumber <= 3)
            return "astore_" + slotNumber + "\n";
        else
            return "astore " + slotNumber + "\n";
    }

    private String iloadInstruction(int slotNumber){
        if(slotNumber >= 0 && slotNumber <= 3)
            return "iload_" + slotNumber + "\n";
        else
            return "iload " + slotNumber + "\n";
    }

    private String istoreInstruction(int slotNumber){
        if(slotNumber >= 0 && slotNumber <= 3)
            return "istore_" + slotNumber + "\n";
        else
            return "istore " + slotNumber + "\n";
    }

    private int makeArrayList(){
        int tempSlot = slotOf("");
        addCommand(makeArrayListCommands());
        addCommand(astoreInstruction(tempSlot) );
        return tempSlot;
    }

    private String makeArrayListCommands(){
        String commands="";
        commands += "new java/util/ArrayList\n";
        commands += "dup\n";
        commands += "invokespecial java/util/ArrayList/<init>()V\n";
        return commands;
    }

    private String initList(){
        String commands="";
        commands += "new List\n";
        commands += "dup\n";
        return commands;
    }

    private String AddToArrayListCommand(){
        String commands="";
        commands += "invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z\n";
        commands += "pop\n";
        return commands;
    }

    private String setLabel(){
        String Label = "Label_"+this.labelNumber;
        this.labelNumber++;
        return Label;
    }

    private String castFromIntToInteger(){
         return "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
    }

    private String castFrombooleanToBoolean(){
        return "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
    }

    private String castFromIntegerToInt(){
        return "invokevirtual java/lang/Integer/intValue()I\n";
    }

    private String castFromBooleanToboolean(){
        return "invokevirtual java/lang/Boolean/booleanValue()Z\n";
    }

    private void handleListInitialization(ListType list){
        int arrayListSlot = makeArrayList();
        addCommand(initList() );
        for(ListNameType element : list.getElementsTypes()){
            addCommand(aloadInstruction(arrayListSlot) );
            initializeField(element.getType());
            addCommand(AddToArrayListCommand());
        }
        addCommand(aloadInstruction(arrayListSlot) );
        addCommand("invokespecial List/<init>(Ljava/util/ArrayList;)V");
    }

    private void initializeField(Type fieldType) {
        if(fieldType instanceof ListType) {
            handleListInitialization((ListType) fieldType);
        }else if (fieldType instanceof IntType) {
            addCommand("iconst_0");
            addCommand(castFromIntToInteger() );
        } else if (fieldType instanceof StringType)
            addCommand("ldc \"\"");
        else if (fieldType instanceof BoolType) {
            addCommand("iconst_0");
            addCommand(castFrombooleanToBoolean() );
        }else if (fieldType instanceof ClassType || fieldType instanceof FptrType)
            addCommand("aconst_null");

    }

    private void initializeFields(){
        for(FieldDeclaration field : currentClass.getFields()){
            addCommand("aload_0");
            initializeField(field.getVarDeclaration().getType());
            addCommand("putfield "+currentClass.getClassName().getName()+"/"+field.getVarDeclaration().getVarName().getName() + " " + makeTypeSignature(field.getVarDeclaration().getType() ) );
        }
    }

    private String makeTypeSignature(Type t) {
        if(t instanceof IntType)
            return "Ljava/lang/Integer;";
        else if(t instanceof StringType)
            return "Ljava/lang/String;";
        else if(t instanceof BoolType)
            return "Ljava/lang/Boolean;";
        else if(t instanceof ClassType)
            return ("L" + ((ClassType) t).getClassName().getName() + ";");
        else if(t instanceof ListType)
            return "LList;";
        else if(t instanceof FptrType)
            return "LFptr;";
        else if(t instanceof NullType)
            return "V";
        return null;
    }

    private String makeTypeClass(Type t){
        if(t instanceof IntType)
            return "java/lang/Integer";
        else if(t instanceof StringType)
            return "java/lang/String";
        else if(t instanceof BoolType)
            return "java/lang/Boolean";
        else if(t instanceof ClassType)
            return ((ClassType) t).getClassName().getName();
        else if(t instanceof ListType)
            return "List";
        else if(t instanceof FptrType)
            return "Fptr";
        return null;
    }

    private void callParentConstructor(){
        addCommand("aload_0");
        if(currentClass.getParentClassName() != null)
            addCommand("invokespecial "+ currentClass.getParentClassName().getName() +"/<init>()V");
        else
            addCommand("invokespecial java/lang/Object/<init>()V");
    }

    private void addDefaultConstructor() {
        // Method Header
        addCommand(".method <init>()V");
        specifyLocalsAndStack();
        // Calling parent constructor
        callParentConstructor();
        // Initialization of fields
        initializeFields();
        // Method End
        addCommand("return");
        addCommand(".end method");
    }

    private void addStaticMainMethod() {
        // Method Header
        addCommand(".method public static main([Ljava/lang/String;)V");
        specifyLocalsAndStack();
        // Method Body
            //localVars
        for(VarDeclaration localVar : currentMethod.getLocalVars())
            localVar.accept(this);
            // Statements
        for(Statement stmt : currentMethod.getBody())
            stmt.accept(this);
        // Method End
        addCommand("return");
        addCommand(".end method");
    }

    private int slotOf(String identifier) {
        int variableCount = 1;
        if(identifier.equals("")) {
            variableCount = this.tempVariableStartSlot;
            this.tempVariableStartSlot++;
            return variableCount;
        }
        for(VarDeclaration argName : currentMethod.getArgs()) {
            if (argName.getVarName().getName().equals(identifier))
                return variableCount;
            variableCount++;
        }
        for(VarDeclaration localVarName : currentMethod.getLocalVars() ){
            if(localVarName.getVarName().getName().equals(identifier) )
                return variableCount;
            variableCount++;
        }
        return variableCount;
    }

    private void setCurrentMethod(MethodDeclaration newMethod){
        this.currentMethod = newMethod;
        this.expressionTypeChecker.setCurrentMethod(newMethod);
        this.tempVariableStartSlot = 1 + currentMethod.getLocalVars().size() + currentMethod.getArgs().size();
    }

    private String getArgsInString(ArrayList<VarDeclaration> Args){
        String result="";
        for(VarDeclaration Arg : Args)
            result += makeTypeSignature(Arg.getType());
        return result;
    }

    private String getExpressionArgsInString(ArrayList<Expression> Args){
        String result="";
        for(Expression expr : Args)
            result += makeTypeSignature(expr.accept(this.expressionTypeChecker));
        return result;
    }

    private void AddLine(int lineNumber) {
        addCommand(".line " + lineNumber);
    }

    private String castPrimitiveToNonePrimitive(Type type){
        String commands = "";
        if(type instanceof IntType)
            commands += castFromIntToInteger();
        if(type instanceof BoolType)
            commands += castFrombooleanToBoolean();
        return commands;
    }

    private String castNonePrimitiveToPrimitive(Type type){
        String commands = "";
        if(type instanceof IntType)
            commands += castFromIntegerToInt();
        if(type instanceof BoolType)
            commands += castFromBooleanToboolean();
        return commands;
    }

    String calculateListIndex(ListType list, String memberName){
        int i;
        for(i = 0; i < list.getElementsTypes().size(); i++){
            if(list.getElementsTypes().get(i).getName().getName().equals(memberName) )
                return ("ldc "+ i +"\n");
        }
        return null;
    }

    @Override
    public String visit(Program program) {
        for(ClassDeclaration cls : program.getClasses()){
            this.currentClass = cls;
            this.expressionTypeChecker.setCurrentClass(cls);
            cls.accept(this);
        }
        return null;
    }

    @Override
    public String visit(ClassDeclaration classDeclaration) {
        createFile(classDeclaration.getClassName().getName());
        addCommand(".class public " + classDeclaration.getClassName().getName());
        // Parent Class
        if (classDeclaration.getParentClassName() == null)
            addCommand(".super java/lang/Object");
        else
            addCommand(".super " + classDeclaration.getParentClassName().getName());
        //Fields
        for (FieldDeclaration field : classDeclaration.getFields())
            field.accept(this);
        //Constructor
        if (classDeclaration.getConstructor() == null)
            addDefaultConstructor();
        else {
            this.setCurrentMethod(classDeclaration.getConstructor());
            classDeclaration.getConstructor().accept(this);
        }
        //Methods
        for(MethodDeclaration method : classDeclaration.getMethods()){
            this.setCurrentMethod(method);
            method.accept(this);
        }
        return null;
    }

    @Override
    public String visit(ConstructorDeclaration constructorDeclaration) {
        if (currentClass.getClassName().getName().equals("Main")) {
            addDefaultConstructor();
            addStaticMainMethod();
        }else {
            if(constructorDeclaration.getArgs().size() > 0)
                addDefaultConstructor();
            this.visit((MethodDeclaration) constructorDeclaration);
        }
        return null;
    }

    @Override
    public String visit(MethodDeclaration methodDeclaration) {
        // Method Header
        if(methodDeclaration instanceof ConstructorDeclaration)
            addCommand(".method <init>("+ getArgsInString(methodDeclaration.getArgs()) +")V");
        else
            addCommand(".method public "+methodDeclaration.getMethodName().getName()+
                    "("+getArgsInString(methodDeclaration.getArgs())+")"+makeTypeSignature(methodDeclaration.getReturnType()));
        // Specify Stack and local Variable size
        specifyLocalsAndStack();
        //
        if(methodDeclaration instanceof ConstructorDeclaration) {
            callParentConstructor();
            initializeFields();
        }
        //Local Variables
        for(VarDeclaration localVar : currentMethod.getLocalVars())
            localVar.accept(this);
        // Statements
        for(Statement stmt : currentMethod.getBody())
            stmt.accept(this);
        //End Method
        if(!currentMethod.getDoesReturn())
            addCommand("return");
        addCommand(".end method");
        return null;
    }

    @Override
    public String visit(FieldDeclaration fieldDeclaration) {
        addCommand(".field public " + fieldDeclaration.getVarDeclaration().getVarName().getName() + " " + makeTypeSignature(fieldDeclaration.getVarDeclaration().getType() ) );
        return null;
    }

    @Override
    public String visit(VarDeclaration varDeclaration) {
        AddLine(varDeclaration.getLine() );
        initializeField(varDeclaration.getType());
        addCommand(astoreInstruction(slotOf(varDeclaration.getVarName().getName() ) ) );
        return null;
    }

    @Override
    public String visit(AssignmentStmt assignmentStmt) {
        AddLine(assignmentStmt.getLine());
        BinaryExpression equalObject = new BinaryExpression(assignmentStmt.getlValue(), assignmentStmt.getrValue(), BinaryOperator.assign);
        String result = equalObject.accept(this);
        addCommand(result);
        addCommand("pop");
        return null;
    }

    @Override
    public String visit(BlockStmt blockStmt) {
        for(Statement stmt : blockStmt.getStatements())
            stmt.accept(this);
        return null;
    }

    @Override
    public String visit(ConditionalStmt conditionalStmt) {
        String ElseStart;
        String EndIf = setLabel();
        AddLine(conditionalStmt.getLine());
        if(conditionalStmt.getElseBody() == null)
            ElseStart = EndIf;
        else
            ElseStart = setLabel();
        // visit Condition
        addCommand(conditionalStmt.getCondition().accept(this));
        addCommand("ifeq " + ElseStart);
        // visit Then body
        conditionalStmt.getThenBody().accept(this);
        addCommand("goto " + EndIf);
        // visit else body if present
        if(conditionalStmt.getElseBody() != null) {
            addCommand(ElseStart+":");
            conditionalStmt.getElseBody().accept(this);
        }
        addCommand(EndIf+":");
        return null;
    }

    @Override
    public String visit(MethodCallStmt methodCallStmt) {
        AddLine(methodCallStmt.getLine());
        expressionTypeChecker.setIsInMethodCallStmt(true);
        addCommand(methodCallStmt.getMethodCall().accept(this) );
        addCommand("pop");
        expressionTypeChecker.setIsInMethodCallStmt(false);
        return null;
    }

    @Override
    public String visit(PrintStmt print) {
        AddLine(print.getLine());
        Type ArgType = print.getArg().accept(this.expressionTypeChecker);
        addCommand("getstatic java/lang/System/out Ljava/io/PrintStream;");
        // Print Argument Visit
        addCommand(print.getArg().accept(this) );
        // printing object
        if(ArgType instanceof IntType)
            addCommand("invokevirtual java/io/PrintStream/print(I)V");
        else if(ArgType instanceof BoolType)
            addCommand("invokevirtual java/io/PrintStream/print(Z)V");
        else // String
            addCommand("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");

        return null;
    }

    @Override
    public String visit(ReturnStmt returnStmt) {
        AddLine(returnStmt.getLine());
        if(returnStmt.getReturnedExpr() == null) {
            addCommand("return");
        }
        else {
            // visiting returned expression
            addCommand(returnStmt.getReturnedExpr().accept(this));
            // cast from primitive to non-primitive
            addCommand(castPrimitiveToNonePrimitive(returnStmt.getReturnedExpr().accept(expressionTypeChecker) ) );
            addCommand("areturn");
        }
        return null;
    }

    @Override
    public String visit(BreakStmt breakStmt) {
        AddLine(breakStmt.getLine());
        addCommand("goto " + this.BreakLabel);
        return null;
    }

    @Override
    public String visit(ContinueStmt continueStmt) {
        AddLine(continueStmt.getLine());
        addCommand("goto " + this.ContinueLabel);
        return null;
    }

    @Override
    public String visit(ForeachStmt foreachStmt) {
        String prevContinueLabel,prevBreakLabel;
        String StartLoopLabel = setLabel();
        String EndLoopLabel = setLabel();
        String LoopContinueLabel = setLabel();
        int IteratorVariableSlot = slotOf(foreachStmt.getVariable().getName() );
        AddLine(foreachStmt.getLine());
        // Initialization code
        // TempInt Initialization
        int tempIntVariable = slotOf("");
        addCommand("iconst_0");
        addCommand(istoreInstruction(tempIntVariable) );
        // Iterator Initialization
        addCommand(foreachStmt.getList().accept(this));
        addCommand(iloadInstruction(tempIntVariable) );
        addCommand("invokevirtual List/getElement(I)Ljava/lang/Object;");
        addCommand("checkcast "+makeTypeClass(foreachStmt.getVariable().accept(this.expressionTypeChecker) ) );
        addCommand(astoreInstruction(IteratorVariableSlot) );
        // Start_Label
        addCommand(StartLoopLabel+":");
        // Label save
        prevBreakLabel = this.BreakLabel;
        prevContinueLabel = this.ContinueLabel;
        // Label Set
        this.BreakLabel = EndLoopLabel;
        this.ContinueLabel = LoopContinueLabel;
        // For Body Code
        foreachStmt.getBody().accept(this);
        // Update code
        addCommand(LoopContinueLabel+":");
        // TempInt Variable Increment
        addCommand(iloadInstruction(tempIntVariable) );
        addCommand("iconst_1");
        addCommand("iadd");
        addCommand(istoreInstruction(tempIntVariable) );
        // Condition Code
        addCommand(iloadInstruction(tempIntVariable) );
        addCommand("ldc "+ ((ListType) foreachStmt.getList().accept(this.expressionTypeChecker)).getElementsTypes().size() );
        addCommand("if_icmpeq "+EndLoopLabel);
        // Iterator Increment
        addCommand(foreachStmt.getList().accept(this));
        addCommand(iloadInstruction(tempIntVariable) );
        addCommand("invokevirtual List/getElement(I)Ljava/lang/Object;");
        addCommand("checkcast "+makeTypeClass(foreachStmt.getVariable().accept(this.expressionTypeChecker) ) );
        addCommand(astoreInstruction(IteratorVariableSlot) );
        // Goto_Start
        addCommand("goto " + StartLoopLabel);
        // label Reset
        this.BreakLabel = prevBreakLabel;
        this.ContinueLabel = prevContinueLabel;
        // End Label
        addCommand(EndLoopLabel+":");
        return null;
    }

    @Override
    public String visit(ForStmt forStmt) {
        String prevContinueLabel,prevBreakLabel;
        String StartLoopLabel = setLabel();
        String EndLoopLabel = setLabel();
        String LoopContinueLabel = setLabel();
        AddLine(forStmt.getLine());
        // Initialization code
        if(forStmt.getInitialize() != null)
            forStmt.getInitialize().accept(this);
        // Condition code
        addCommand(StartLoopLabel+":");
        if(forStmt.getCondition() != null){
            addCommand(forStmt.getCondition().accept(this));
            addCommand("ifeq " + EndLoopLabel);
        }
        // Label save
        prevBreakLabel = this.BreakLabel;
        prevContinueLabel = this.ContinueLabel;
        // Label Set
        this.BreakLabel = EndLoopLabel;
        this.ContinueLabel = LoopContinueLabel;
        // For Body Code
        forStmt.getBody().accept(this);
        // Update code
        addCommand(LoopContinueLabel+":");
        if(forStmt.getUpdate() != null)
            forStmt.getUpdate().accept(this);
        addCommand("goto " + StartLoopLabel);
        // label Reset
        this.BreakLabel = prevBreakLabel;
        this.ContinueLabel = prevContinueLabel;
        // End Label
        addCommand(EndLoopLabel+":");
        return null;
    }

    @Override
    public String visit(BinaryExpression binaryExpression) {
        BinaryOperator operator = binaryExpression.getBinaryOperator();
        String commands = "";
        if (operator == BinaryOperator.add) {
            commands += binaryExpression.getFirstOperand().accept(this);
            commands += binaryExpression.getSecondOperand().accept(this);
            commands += "iadd\n";
        }
        else if (operator == BinaryOperator.sub) {
            commands += binaryExpression.getFirstOperand().accept(this);
            commands += binaryExpression.getSecondOperand().accept(this);
            commands += "isub\n";
        }
        else if (operator == BinaryOperator.mult) {
            commands += binaryExpression.getFirstOperand().accept(this);
            commands += binaryExpression.getSecondOperand().accept(this);
            commands += "imul\n";
        }
        else if (operator == BinaryOperator.div) {
            commands += binaryExpression.getFirstOperand().accept(this);
            commands += binaryExpression.getSecondOperand().accept(this);
            commands += "idiv\n";
        }
        else if (operator == BinaryOperator.mod) {
            commands += binaryExpression.getFirstOperand().accept(this);
            commands += binaryExpression.getSecondOperand().accept(this);
            commands += "irem\n";
        }
        // gt > & lt <
        else if((operator == BinaryOperator.gt) || (operator == BinaryOperator.lt)) {
            String Lafter = setLabel();
            String LTrue = setLabel();
            commands += binaryExpression.getFirstOperand().accept(this);
            commands += binaryExpression.getSecondOperand().accept(this);
            // greater Than
            if(operator == BinaryOperator.gt)
                commands += ("if_icmpgt "+LTrue+"\n");
            // Less Than
            if(operator == BinaryOperator.lt)
                commands += ("if_icmplt "+LTrue+"\n");
            // Uniform Structure
            commands += "iconst_0\n";
            commands += ("goto "+Lafter+"\n");
            commands += (LTrue + ":\n");
            commands += "iconst_1\n";
            commands += (Lafter + ":\n");
        }
        else if((operator == BinaryOperator.eq) || (operator == BinaryOperator.neq)) {
            boolean isPrimitive = false;
            String Lafter = setLabel();
            String LTrue = setLabel();
            commands += binaryExpression.getFirstOperand().accept(this);
            commands += binaryExpression.getSecondOperand().accept(this);
            // CheckType
            if((binaryExpression.getFirstOperand().accept(this.expressionTypeChecker) instanceof IntType) || (binaryExpression.getFirstOperand().accept(this.expressionTypeChecker) instanceof BoolType))
                isPrimitive = true;
            // Check Scenarios
            if(isPrimitive){
                if(operator == BinaryOperator.eq)
                    commands += "if_icmpeq "+LTrue+"\n";
                else
                    commands += "if_icmpne "+LTrue+"\n";
            }else{
                if(operator == BinaryOperator.eq)
                    commands += "if_acmpeq "+LTrue+"\n";
                else
                    commands += "if_acmpne "+LTrue+"\n";
            }
            // Uniform Structure
            commands += "iconst_0\n";
            commands += ("goto "+Lafter+"\n");
            commands += (LTrue + ":\n");
            commands += "iconst_1\n";
            commands += (Lafter + ":\n");
        }
        else if(operator == BinaryOperator.and) {
            String Lafter = setLabel();
            String LFalse = setLabel();
            //first Expression Check
            commands += binaryExpression.getFirstOperand().accept(this);
            commands += ("ifeq "+LFalse+"\n");
            //second Expression Check
            commands += binaryExpression.getSecondOperand().accept(this);
            commands += ("ifeq "+LFalse+"\n");
            //Condition True
            commands += "iconst_1\n";
            commands += ("goto "+Lafter+"\n");
            //ConditionFalse
            commands += (LFalse + ":\n");
            commands += "iconst_0\n";
            commands += (Lafter + ":\n");
        }
        else if(operator == BinaryOperator.or) {
            String Lafter = setLabel();
            String LTrue = setLabel();
            //first Expression Check
            commands += binaryExpression.getFirstOperand().accept(this);
            commands += ("ifne "+LTrue+"\n");
            //second Expression Check
            commands += binaryExpression.getSecondOperand().accept(this);
            commands += ("ifne "+LTrue+"\n");
            //Condition True
            commands += "iconst_0\n";
            commands += ("goto "+Lafter+"\n");
            //ConditionFalse
            commands += (LTrue + ":\n");
            commands += "iconst_1\n";
            commands += (Lafter + ":\n");
        }
        else if(operator == BinaryOperator.assign) {
            int dummySpaceSlot;
            Type firstType = binaryExpression.getFirstOperand().accept(expressionTypeChecker);
            String secondOperandCommands = binaryExpression.getSecondOperand().accept(this);
            if(firstType instanceof ListType) {
                secondOperandCommands = initList() + secondOperandCommands + "invokespecial List/<init>(LList;)V\n";
            }
            commands += secondOperandCommands;
            commands += "dup\n";
            commands += castPrimitiveToNonePrimitive(firstType);
            if(binaryExpression.getFirstOperand() instanceof Identifier)
                commands += astoreInstruction(slotOf(((Identifier) binaryExpression.getFirstOperand()).getName()) );
            else if(binaryExpression.getFirstOperand() instanceof ListAccessByIndex) {
                dummySpaceSlot = slotOf("");
                commands += astoreInstruction(dummySpaceSlot);
                commands += ((ListAccessByIndex) binaryExpression.getFirstOperand()).getInstance().accept(this);
                commands += ((ListAccessByIndex) binaryExpression.getFirstOperand()).getIndex().accept(this);
                commands += aloadInstruction(dummySpaceSlot);
                commands += "invokevirtual List/setElement(ILjava/lang/Object;)V\n";
            }
            else if(binaryExpression.getFirstOperand() instanceof ObjectOrListMemberAccess) {
                Expression instance = ((ObjectOrListMemberAccess) binaryExpression.getFirstOperand()).getInstance();
                String memberName = ((ObjectOrListMemberAccess) binaryExpression.getFirstOperand()).getMemberName().getName();
                Type memberType = binaryExpression.getFirstOperand().accept(expressionTypeChecker);
                Type instanceType = instance.accept(expressionTypeChecker);
                if(instanceType instanceof ListType) {
                    dummySpaceSlot = slotOf("");
                    commands += astoreInstruction(dummySpaceSlot);
                    commands += instance.accept(this);
                    commands += calculateListIndex((ListType) instanceType, memberName);
                    commands += aloadInstruction(dummySpaceSlot);
                    commands += "invokevirtual List/setElement(ILjava/lang/Object;)V\n";
                }
                else if(instanceType instanceof ClassType) {
                    dummySpaceSlot = slotOf("");
                    commands += astoreInstruction(dummySpaceSlot);
                    commands += instance.accept(this);
                    commands += aloadInstruction(dummySpaceSlot);
                    commands += ("putfield "+(((ClassType) instanceType).getClassName().getName())+"/"+memberName+" "+makeTypeSignature(memberType)+"\n");
                }
            }
        }
        return commands;
    }

    @Override
    public String visit(UnaryExpression unaryExpression) {
        UnaryOperator operator = unaryExpression.getOperator();
        String commands = "";
        if(operator == UnaryOperator.minus) {
            commands += unaryExpression.getOperand().accept(this);
            commands += "ineg\n";
        }
        else if(operator == UnaryOperator.not) {
            String Lafter = setLabel();
            String LTrue = setLabel();
            commands += unaryExpression.getOperand().accept(this);
            //checkFalse
            commands += ("ifeq "+LTrue+"\n");
            // Uniform Structure
            commands += "iconst_0\n";
            commands += ("goto "+Lafter+"\n");
            commands += (LTrue + ":\n");
            commands += "iconst_1\n";
            commands += (Lafter + ":\n");

        }
        else if((operator == UnaryOperator.predec) || (operator == UnaryOperator.preinc)) {
            String newCommand = "";
            newCommand += unaryExpression.getOperand().accept(this);
            newCommand += "iconst_1\n";
            if(operator == UnaryOperator.predec)
                newCommand += "isub\n";
            else
                newCommand += "iadd\n";
            commands += newCommand; //Difference with last Code
            if(unaryExpression.getOperand() instanceof Identifier) {
                commands += newCommand;
                commands += castFromIntToInteger();
                commands += astoreInstruction(slotOf(((Identifier) unaryExpression.getOperand()).getName()) );
            }
            else if(unaryExpression.getOperand() instanceof ListAccessByIndex) {
                commands += ((ListAccessByIndex) unaryExpression.getOperand()).getInstance().accept(this);
                commands += ((ListAccessByIndex) unaryExpression.getOperand()).getIndex().accept(this);
                commands += newCommand;
                commands += castFromIntToInteger();
                commands += "invokevirtual List/setElement(ILjava/lang/Object;)V\n";
            }
            else if(unaryExpression.getOperand() instanceof ObjectOrListMemberAccess) {
                Expression instance = ((ObjectOrListMemberAccess) unaryExpression.getOperand()).getInstance();
                String memberName = ((ObjectOrListMemberAccess) unaryExpression.getOperand()).getMemberName().getName();
                Type memberType = unaryExpression.getOperand().accept(expressionTypeChecker);
                Type instanceType = instance.accept(expressionTypeChecker);
                if(instanceType instanceof ListType) {
                    commands += instance.accept(this);
                    commands += calculateListIndex((ListType) instanceType, memberName);
                    commands += newCommand;
                    commands += castFromIntToInteger();
                    commands += "invokevirtual List/setElement(ILjava/lang/Object;)V\n";
                }
                else if(instanceType instanceof ClassType) {
                    commands += instance.accept(this);
                    commands += newCommand;
                    commands += castFromIntToInteger();
                    commands += ("putfield "+(((ClassType) instanceType).getClassName().getName())+"/"+memberName+" "+makeTypeSignature(memberType)+"\n");
                }
            }
        }
        else if((operator == UnaryOperator.postdec) || (operator == UnaryOperator.postinc)) {
            String newCommand = "";
            newCommand += unaryExpression.getOperand().accept(this);
            newCommand += "iconst_1\n";
            if(operator == UnaryOperator.postdec)
                newCommand += "isub\n";
            else
                newCommand += "iadd\n";
            commands += unaryExpression.getOperand().accept(this); //Difference with last Code
            if(unaryExpression.getOperand() instanceof Identifier) {
                commands += newCommand;
                commands += castFromIntToInteger();
                commands += astoreInstruction(slotOf(((Identifier) unaryExpression.getOperand()).getName()) );
            }
            else if(unaryExpression.getOperand() instanceof ListAccessByIndex) {
                commands += ((ListAccessByIndex) unaryExpression.getOperand()).getInstance().accept(this);
                commands += ((ListAccessByIndex) unaryExpression.getOperand()).getIndex().accept(this);
                commands += newCommand;
                commands += castFromIntToInteger();
                commands += "invokevirtual List/setElement(ILjava/lang/Object;)V\n";
            }
            else if(unaryExpression.getOperand() instanceof ObjectOrListMemberAccess) {
                Expression instance = ((ObjectOrListMemberAccess) unaryExpression.getOperand()).getInstance();
                String memberName = ((ObjectOrListMemberAccess) unaryExpression.getOperand()).getMemberName().getName();
                Type memberType = unaryExpression.getOperand().accept(expressionTypeChecker);
                Type instanceType = instance.accept(expressionTypeChecker);
                if(instanceType instanceof ListType) {
                    commands += instance.accept(this);
                    commands += calculateListIndex((ListType) instanceType, memberName);
                    commands += newCommand;
                    commands += castFromIntToInteger();
                    commands += "invokevirtual List/setElement(ILjava/lang/Object;)V\n";
                }
                else if(instanceType instanceof ClassType) {
                    commands += instance.accept(this);
                    commands += newCommand;
                    commands += castFromIntToInteger();
                    commands += ("putfield "+(((ClassType) instanceType).getClassName().getName())+"/"+memberName+" "+makeTypeSignature(memberType)+"\n");
                }
            }
        }
        return commands;
    }

    @Override
    public String visit(ObjectOrListMemberAccess objectOrListMemberAccess) {
        Type memberType = objectOrListMemberAccess.accept(expressionTypeChecker);
        Type instanceType = objectOrListMemberAccess.getInstance().accept(expressionTypeChecker);
        String memberName = objectOrListMemberAccess.getMemberName().getName();
        String commands = "";
        if(instanceType instanceof ClassType) {
            String className = ((ClassType) instanceType).getClassName().getName();
            try {
                SymbolTable classSymbolTable = ((ClassSymbolTableItem) SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + className, true)).getClassSymbolTable();
                try {
                    classSymbolTable.getItem(FieldSymbolTableItem.START_KEY + memberName, true);
                    commands += objectOrListMemberAccess.getInstance().accept(this);
                    commands += ("getfield "+className+"/"+memberName+" "+makeTypeSignature(memberType)+"\n");
                    commands += castNonePrimitiveToPrimitive(memberType);
                } catch (ItemNotFoundException memberIsMethod) {
                    commands += "new Fptr\n";
                    commands += "dup\n";
                    commands += objectOrListMemberAccess.getInstance().accept(this);
                    commands += ("ldc "+"\""+memberName+"\""+"\n");
                    commands += ("invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V\n");
                }
            } catch (ItemNotFoundException classNotFound) {
                // Do Nothing
            }
        }
        else if(instanceType instanceof ListType) {
            commands += objectOrListMemberAccess.getInstance().accept(this);
            commands += calculateListIndex((ListType) instanceType, memberName);
            commands += "invokevirtual List/getElement(I)Ljava/lang/Object;\n";
            // Casting
            commands += "checkcast "+makeTypeClass(memberType)+"\n";
            commands += castNonePrimitiveToPrimitive(memberType);
        }
        return commands;
    }

    @Override
    public String visit(Identifier identifier) {
        String commands = "";
        commands += aloadInstruction(slotOf(identifier.getName()));
        commands += castNonePrimitiveToPrimitive(identifier.accept(this.expressionTypeChecker));
        return commands;
    }

    @Override
    public String visit(ListAccessByIndex listAccessByIndex) {
        String commands = "";
        Type ElementType = listAccessByIndex.accept(this.expressionTypeChecker);
        // visit instance code
        commands += listAccessByIndex.getInstance().accept(this);
        // visit index
        commands += listAccessByIndex.getIndex().accept(this);
        // get Element
        commands += "invokevirtual List/getElement(I)Ljava/lang/Object;\n";
        // Casting
        commands += "checkcast "+makeTypeClass(ElementType)+"\n";
        commands += castNonePrimitiveToPrimitive(ElementType);
        return commands;
    }

    @Override
    public String visit(MethodCall methodCall) {
        String commands = "";
        commands += methodCall.getInstance().accept(this);
        // initialize ArrayList
        int ArrayListSlot = slotOf("");
        // Make Array List
        commands += makeArrayListCommands();
        commands += astoreInstruction(ArrayListSlot);
        //visit args
        for(Expression expr : methodCall.getArgs() ){
            commands += aloadInstruction(ArrayListSlot);
            commands += expr.accept(this);
            commands += castPrimitiveToNonePrimitive(expr.accept(this.expressionTypeChecker) );
            commands += AddToArrayListCommand();
        }
        // Call invoke fuction in Fptr
        commands += aloadInstruction(ArrayListSlot);
        commands += "invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;\n";
        // Cast the return value
        Type returnType = methodCall.accept(this.expressionTypeChecker);
        commands += "checkcast "+makeTypeClass(returnType)+"\n";
        commands += castNonePrimitiveToPrimitive(returnType);
        return commands;
    }

    @Override
    public String visit(NewClassInstance newClassInstance) {
        String commands = "";
        // initialize refrence
        commands += "new "+newClassInstance.getClassType().getClassName().getName()+"\n";
        commands += "dup\n";
        //visit args
        for(Expression argExpr : newClassInstance.getArgs()){
            commands += argExpr.accept(this);
            commands += castPrimitiveToNonePrimitive(argExpr.accept(this.expressionTypeChecker) );
        }
        //Call Constructor
        commands += ("invokespecial "+newClassInstance.getClassType().getClassName().getName()+"/<init>("+getExpressionArgsInString(newClassInstance.getArgs())+")V\n");
        return commands;
    }

    @Override
    public String visit(ThisClass thisClass) {
        String commands = "";
        commands += "aload_0\n";
        return commands;
    }

    @Override
    public String visit(ListValue listValue) {
        String commands = "";
        int ArrayListSlot = slotOf("");
        // Make Array List
        commands += makeArrayListCommands();
        commands += astoreInstruction(ArrayListSlot);
        // Init List
        commands += initList();
        // visit elements
        for(Expression expr : listValue.getElements() ){
            commands += aloadInstruction(ArrayListSlot);
            commands += expr.accept(this);
            commands += castPrimitiveToNonePrimitive(expr.accept(this.expressionTypeChecker) );
            commands += AddToArrayListCommand();
        }
        // now initialize List
        commands += aloadInstruction(ArrayListSlot);
        commands += "invokespecial List/<init>(Ljava/util/ArrayList;)V\n";
        return commands;
    }

    @Override
    public String visit(NullValue nullValue) {
        String commands = "aconst_null";
        commands += "\n";
        return commands;
    }

    @Override
    public String visit(IntValue intValue) {
        String commands = "ldc ";
        commands += intValue.getConstant();
        commands += "\n";
        return commands;
    }

    @Override
    public String visit(BoolValue boolValue) {
        String commands = "ldc ";
        if(boolValue.getConstant())
            commands += "1";
        else
            commands += "0";
        commands += "\n";
        return commands;
    }

    @Override
    public String visit(StringValue stringValue) {
        String commands = "ldc ";
        commands += ("\"" + stringValue.getConstant() + "\"");
        commands += "\n";
        return commands;
    }

}