// Generated from C:/Users/rasou/Desktop/Compiler/Project/Phase 1/src/main/grammar\Sophia.g4 by ANTLR 4.8
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SophiaParser}.
 */
public interface SophiaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SophiaParser#sophia}.
	 * @param ctx the parse tree
	 */
	void enterSophia(SophiaParser.SophiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#sophia}.
	 * @param ctx the parse tree
	 */
	void exitSophia(SophiaParser.SophiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#main_class}.
	 * @param ctx the parse tree
	 */
	void enterMain_class(SophiaParser.Main_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#main_class}.
	 * @param ctx the parse tree
	 */
	void exitMain_class(SophiaParser.Main_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#classes}.
	 * @param ctx the parse tree
	 */
	void enterClasses(SophiaParser.ClassesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#classes}.
	 * @param ctx the parse tree
	 */
	void exitClasses(SophiaParser.ClassesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(SophiaParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(SophiaParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#main_constructor}.
	 * @param ctx the parse tree
	 */
	void enterMain_constructor(SophiaParser.Main_constructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#main_constructor}.
	 * @param ctx the parse tree
	 */
	void exitMain_constructor(SophiaParser.Main_constructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#main_class_scope}.
	 * @param ctx the parse tree
	 */
	void enterMain_class_scope(SophiaParser.Main_class_scopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#main_class_scope}.
	 * @param ctx the parse tree
	 */
	void exitMain_class_scope(SophiaParser.Main_class_scopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#class_scope}.
	 * @param ctx the parse tree
	 */
	void enterClass_scope(SophiaParser.Class_scopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#class_scope}.
	 * @param ctx the parse tree
	 */
	void exitClass_scope(SophiaParser.Class_scopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(SophiaParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(SophiaParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#func_declare}.
	 * @param ctx the parse tree
	 */
	void enterFunc_declare(SophiaParser.Func_declareContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#func_declare}.
	 * @param ctx the parse tree
	 */
	void exitFunc_declare(SophiaParser.Func_declareContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#func_input_vars}.
	 * @param ctx the parse tree
	 */
	void enterFunc_input_vars(SophiaParser.Func_input_varsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#func_input_vars}.
	 * @param ctx the parse tree
	 */
	void exitFunc_input_vars(SophiaParser.Func_input_varsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#func_ret_type}.
	 * @param ctx the parse tree
	 */
	void enterFunc_ret_type(SophiaParser.Func_ret_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#func_ret_type}.
	 * @param ctx the parse tree
	 */
	void exitFunc_ret_type(SophiaParser.Func_ret_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#func_scope}.
	 * @param ctx the parse tree
	 */
	void enterFunc_scope(SophiaParser.Func_scopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#func_scope}.
	 * @param ctx the parse tree
	 */
	void exitFunc_scope(SophiaParser.Func_scopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#simple_scope}.
	 * @param ctx the parse tree
	 */
	void enterSimple_scope(SophiaParser.Simple_scopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#simple_scope}.
	 * @param ctx the parse tree
	 */
	void exitSimple_scope(SophiaParser.Simple_scopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#some_declarations}.
	 * @param ctx the parse tree
	 */
	void enterSome_declarations(SophiaParser.Some_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#some_declarations}.
	 * @param ctx the parse tree
	 */
	void exitSome_declarations(SophiaParser.Some_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#some_statements}.
	 * @param ctx the parse tree
	 */
	void enterSome_statements(SophiaParser.Some_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#some_statements}.
	 * @param ctx the parse tree
	 */
	void exitSome_statements(SophiaParser.Some_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SophiaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SophiaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#single_statement}.
	 * @param ctx the parse tree
	 */
	void enterSingle_statement(SophiaParser.Single_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#single_statement}.
	 * @param ctx the parse tree
	 */
	void exitSingle_statement(SophiaParser.Single_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(SophiaParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(SophiaParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#func_args}.
	 * @param ctx the parse tree
	 */
	void enterFunc_args(SophiaParser.Func_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#func_args}.
	 * @param ctx the parse tree
	 */
	void exitFunc_args(SophiaParser.Func_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign_statement(SophiaParser.Assign_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign_statement(SophiaParser.Assign_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#multiple_assign_statement}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_assign_statement(SophiaParser.Multiple_assign_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#multiple_assign_statement}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_assign_statement(SophiaParser.Multiple_assign_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#foreachStatement}.
	 * @param ctx the parse tree
	 */
	void enterForeachStatement(SophiaParser.ForeachStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#foreachStatement}.
	 * @param ctx the parse tree
	 */
	void exitForeachStatement(SophiaParser.ForeachStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(SophiaParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(SophiaParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#oneLine_statement}.
	 * @param ctx the parse tree
	 */
	void enterOneLine_statement(SophiaParser.OneLine_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#oneLine_statement}.
	 * @param ctx the parse tree
	 */
	void exitOneLine_statement(SophiaParser.OneLine_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(SophiaParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(SophiaParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#open_if_statement}.
	 * @param ctx the parse tree
	 */
	void enterOpen_if_statement(SophiaParser.Open_if_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#open_if_statement}.
	 * @param ctx the parse tree
	 */
	void exitOpen_if_statement(SophiaParser.Open_if_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#close_if_statement}.
	 * @param ctx the parse tree
	 */
	void enterClose_if_statement(SophiaParser.Close_if_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#close_if_statement}.
	 * @param ctx the parse tree
	 */
	void exitClose_if_statement(SophiaParser.Close_if_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#non_if_statement}.
	 * @param ctx the parse tree
	 */
	void enterNon_if_statement(SophiaParser.Non_if_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#non_if_statement}.
	 * @param ctx the parse tree
	 */
	void exitNon_if_statement(SophiaParser.Non_if_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SophiaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SophiaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(SophiaParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(SophiaParser.Bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expr(SophiaParser.And_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expr(SophiaParser.And_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#unary_rel_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary_rel_expr(SophiaParser.Unary_rel_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#unary_rel_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary_rel_expr(SophiaParser.Unary_rel_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#rel_expr}.
	 * @param ctx the parse tree
	 */
	void enterRel_expr(SophiaParser.Rel_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#rel_expr}.
	 * @param ctx the parse tree
	 */
	void exitRel_expr(SophiaParser.Rel_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#sum_expr}.
	 * @param ctx the parse tree
	 */
	void enterSum_expr(SophiaParser.Sum_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#sum_expr}.
	 * @param ctx the parse tree
	 */
	void exitSum_expr(SophiaParser.Sum_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#mul_expr}.
	 * @param ctx the parse tree
	 */
	void enterMul_expr(SophiaParser.Mul_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#mul_expr}.
	 * @param ctx the parse tree
	 */
	void exitMul_expr(SophiaParser.Mul_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expr(SophiaParser.Unary_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expr(SophiaParser.Unary_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#single_unit}.
	 * @param ctx the parse tree
	 */
	void enterSingle_unit(SophiaParser.Single_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#single_unit}.
	 * @param ctx the parse tree
	 */
	void exitSingle_unit(SophiaParser.Single_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#var_types}.
	 * @param ctx the parse tree
	 */
	void enterVar_types(SophiaParser.Var_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#var_types}.
	 * @param ctx the parse tree
	 */
	void exitVar_types(SophiaParser.Var_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#list_type}.
	 * @param ctx the parse tree
	 */
	void enterList_type(SophiaParser.List_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#list_type}.
	 * @param ctx the parse tree
	 */
	void exitList_type(SophiaParser.List_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#some_types}.
	 * @param ctx the parse tree
	 */
	void enterSome_types(SophiaParser.Some_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#some_types}.
	 * @param ctx the parse tree
	 */
	void exitSome_types(SophiaParser.Some_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#var_declare_statement}.
	 * @param ctx the parse tree
	 */
	void enterVar_declare_statement(SophiaParser.Var_declare_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#var_declare_statement}.
	 * @param ctx the parse tree
	 */
	void exitVar_declare_statement(SophiaParser.Var_declare_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#var_declare}.
	 * @param ctx the parse tree
	 */
	void enterVar_declare(SophiaParser.Var_declareContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#var_declare}.
	 * @param ctx the parse tree
	 */
	void exitVar_declare(SophiaParser.Var_declareContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(SophiaParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(SophiaParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SophiaParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(SophiaParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SophiaParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(SophiaParser.VariableContext ctx);
}