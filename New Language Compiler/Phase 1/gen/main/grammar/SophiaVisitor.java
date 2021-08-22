// Generated from C:/Users/rasou/Desktop/Compiler/Project/Phase 1/src/main/grammar\Sophia.g4 by ANTLR 4.8
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SophiaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SophiaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SophiaParser#sophia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSophia(SophiaParser.SophiaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#main_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_class(SophiaParser.Main_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#classes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasses(SophiaParser.ClassesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(SophiaParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#main_constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_constructor(SophiaParser.Main_constructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#main_class_scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_class_scope(SophiaParser.Main_class_scopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#class_scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_scope(SophiaParser.Class_scopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(SophiaParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#func_declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_declare(SophiaParser.Func_declareContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#func_input_vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_input_vars(SophiaParser.Func_input_varsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#func_ret_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_ret_type(SophiaParser.Func_ret_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#func_scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_scope(SophiaParser.Func_scopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#simple_scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_scope(SophiaParser.Simple_scopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#some_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSome_declarations(SophiaParser.Some_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#some_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSome_statements(SophiaParser.Some_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SophiaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#single_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_statement(SophiaParser.Single_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(SophiaParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#func_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_args(SophiaParser.Func_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#assign_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_statement(SophiaParser.Assign_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#multiple_assign_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_assign_statement(SophiaParser.Multiple_assign_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#foreachStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeachStatement(SophiaParser.ForeachStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(SophiaParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#oneLine_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneLine_statement(SophiaParser.OneLine_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(SophiaParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#open_if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_if_statement(SophiaParser.Open_if_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#close_if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_if_statement(SophiaParser.Close_if_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#non_if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_if_statement(SophiaParser.Non_if_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SophiaParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr(SophiaParser.Bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#and_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expr(SophiaParser.And_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#unary_rel_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_rel_expr(SophiaParser.Unary_rel_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#rel_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_expr(SophiaParser.Rel_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#sum_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum_expr(SophiaParser.Sum_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#mul_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_expr(SophiaParser.Mul_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#unary_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expr(SophiaParser.Unary_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#single_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_unit(SophiaParser.Single_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#var_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_types(SophiaParser.Var_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#list_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_type(SophiaParser.List_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#some_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSome_types(SophiaParser.Some_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#var_declare_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_declare_statement(SophiaParser.Var_declare_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#var_declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_declare(SophiaParser.Var_declareContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(SophiaParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SophiaParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(SophiaParser.VariableContext ctx);
}