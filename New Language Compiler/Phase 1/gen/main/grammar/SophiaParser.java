// Generated from C:/Users/rasou/Desktop/Compiler/Project/Phase 1/src/main/grammar\Sophia.g4 by ANTLR 4.8
package main.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SophiaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAIN=1, MINMIN=2, PLUSPLUS=3, OROP=4, ANDOP=5, UNARYLOGIC=6, SUMOP=7, 
		COMPOP=8, MULTOP=9, CLS=10, IF=11, FALSE=12, LIST=13, EXT=14, ELSE=15, 
		TRUE=16, IN=17, THIS=18, FOR=19, INT=20, NULL=21, DEF=22, FORE=23, BOOL=24, 
		NEW=25, FUNC=26, CONT=27, STR=28, PRI=29, RET=30, BRK=31, VOID=32, ENDOFLINE=33, 
		DEFINIT=34, COMM=35, ASSIGN=36, DOT=37, LBRC=38, RBRC=39, LBRA=40, RBRA=41, 
		LPAR=42, RPAR=43, COUPLE=44, FUNCSIG=45, LST=46, GT=47, ID=48, NUM=49, 
		POSNUM=50, STRING=51, DIGIT=52, NOZERODIGIT=53, COMMENT=54, UPLETTER=55, 
		LOWLETTER=56, UNDERSCORE=57, ZERO=58, NXTLINE=59, WS=60;
	public static final int
		RULE_sophia = 0, RULE_main_class = 1, RULE_classes = 2, RULE_constructor = 3, 
		RULE_main_constructor = 4, RULE_main_class_scope = 5, RULE_class_scope = 6, 
		RULE_declarations = 7, RULE_func_declare = 8, RULE_func_input_vars = 9, 
		RULE_func_ret_type = 10, RULE_func_scope = 11, RULE_simple_scope = 12, 
		RULE_some_declarations = 13, RULE_some_statements = 14, RULE_statement = 15, 
		RULE_single_statement = 16, RULE_func_call = 17, RULE_func_args = 18, 
		RULE_assign_statement = 19, RULE_multiple_assign_statement = 20, RULE_foreachStatement = 21, 
		RULE_for_statement = 22, RULE_oneLine_statement = 23, RULE_if_statement = 24, 
		RULE_open_if_statement = 25, RULE_close_if_statement = 26, RULE_non_if_statement = 27, 
		RULE_expr = 28, RULE_bool_expr = 29, RULE_and_expr = 30, RULE_unary_rel_expr = 31, 
		RULE_rel_expr = 32, RULE_sum_expr = 33, RULE_mul_expr = 34, RULE_unary_expr = 35, 
		RULE_single_unit = 36, RULE_var_types = 37, RULE_list_type = 38, RULE_some_types = 39, 
		RULE_var_declare_statement = 40, RULE_var_declare = 41, RULE_var = 42, 
		RULE_variable = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"sophia", "main_class", "classes", "constructor", "main_constructor", 
			"main_class_scope", "class_scope", "declarations", "func_declare", "func_input_vars", 
			"func_ret_type", "func_scope", "simple_scope", "some_declarations", "some_statements", 
			"statement", "single_statement", "func_call", "func_args", "assign_statement", 
			"multiple_assign_statement", "foreachStatement", "for_statement", "oneLine_statement", 
			"if_statement", "open_if_statement", "close_if_statement", "non_if_statement", 
			"expr", "bool_expr", "and_expr", "unary_rel_expr", "rel_expr", "sum_expr", 
			"mul_expr", "unary_expr", "single_unit", "var_types", "list_type", "some_types", 
			"var_declare_statement", "var_declare", "var", "variable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Main'", "'--'", "'++'", "'||'", "'&&'", "'!'", null, null, null, 
			"'class'", "'if'", "'false'", "'list'", "'extends'", "'else'", "'true'", 
			"'in'", "'this'", "'for'", "'int'", "'null'", "'def'", "'foreach'", "'bool'", 
			"'new'", "'func'", "'continue'", "'string'", "'print'", "'return'", "'break'", 
			"'void'", "';'", "':'", "','", "'='", "'.'", "'{'", "'}'", "'['", "']'", 
			"'('", "')'", "'#'", "'->'", "'>'", "'<'", null, null, null, null, null, 
			null, null, null, null, "'_'", "'0'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAIN", "MINMIN", "PLUSPLUS", "OROP", "ANDOP", "UNARYLOGIC", "SUMOP", 
			"COMPOP", "MULTOP", "CLS", "IF", "FALSE", "LIST", "EXT", "ELSE", "TRUE", 
			"IN", "THIS", "FOR", "INT", "NULL", "DEF", "FORE", "BOOL", "NEW", "FUNC", 
			"CONT", "STR", "PRI", "RET", "BRK", "VOID", "ENDOFLINE", "DEFINIT", "COMM", 
			"ASSIGN", "DOT", "LBRC", "RBRC", "LBRA", "RBRA", "LPAR", "RPAR", "COUPLE", 
			"FUNCSIG", "LST", "GT", "ID", "NUM", "POSNUM", "STRING", "DIGIT", "NOZERODIGIT", 
			"COMMENT", "UPLETTER", "LOWLETTER", "UNDERSCORE", "ZERO", "NXTLINE", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Sophia.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SophiaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SophiaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SophiaParser.EOF, 0); }
		public List<ClassesContext> classes() {
			return getRuleContexts(ClassesContext.class);
		}
		public ClassesContext classes(int i) {
			return getRuleContext(ClassesContext.class,i);
		}
		public Main_classContext main_class() {
			return getRuleContext(Main_classContext.class,0);
		}
		public SophiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sophia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterSophia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitSophia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitSophia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SophiaContext sophia() throws RecognitionException {
		SophiaContext _localctx = new SophiaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sophia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(88);
			classes();
			}
			{
			setState(89);
			main_class();
			}
			{
			setState(90);
			classes();
			}
			setState(91);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Main_classContext extends ParserRuleContext {
		public TerminalNode CLS() { return getToken(SophiaParser.CLS, 0); }
		public TerminalNode MAIN() { return getToken(SophiaParser.MAIN, 0); }
		public Main_class_scopeContext main_class_scope() {
			return getRuleContext(Main_class_scopeContext.class,0);
		}
		public Main_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMain_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMain_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMain_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_classContext main_class() throws RecognitionException {
		Main_classContext _localctx = new Main_classContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(CLS);
			setState(94);
			match(MAIN);
			System.out.println("ClassDec:Main"); 
			setState(96);
			main_class_scope();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassesContext extends ParserRuleContext {
		public TerminalNode CLS() { return getToken(SophiaParser.CLS, 0); }
		public List<TerminalNode> ID() { return getTokens(SophiaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SophiaParser.ID, i);
		}
		public Class_scopeContext class_scope() {
			return getRuleContext(Class_scopeContext.class,0);
		}
		public ClassesContext classes() {
			return getRuleContext(ClassesContext.class,0);
		}
		public TerminalNode EXT() { return getToken(SophiaParser.EXT, 0); }
		public ClassesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterClasses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitClasses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitClasses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassesContext classes() throws RecognitionException {
		ClassesContext _localctx = new ClassesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classes);
		int _la;
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(98);
				match(CLS);
				System.out.print("ClassDec:"+getCurrentToken().getText()); 
				setState(100);
				match(ID);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXT) {
					{
					setState(101);
					match(EXT);
					System.out.print("," + getCurrentToken().getText());
					setState(103);
					match(ID);
					}
				}

				System.out.println();
				setState(107);
				class_scope();
				}
				{
				setState(109);
				classes();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(SophiaParser.DEF, 0); }
		public TerminalNode ID() { return getToken(SophiaParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public Func_input_varsContext func_input_vars() {
			return getRuleContext(Func_input_varsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public Func_scopeContext func_scope() {
			return getRuleContext(Func_scopeContext.class,0);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constructor);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(DEF);
				System.out.println("ConstructorDec:"+getCurrentToken().getText());
				setState(116);
				match(ID);
				setState(117);
				match(LPAR);
				setState(118);
				func_input_vars();
				setState(119);
				match(RPAR);
				setState(120);
				func_scope();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Main_constructorContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(SophiaParser.DEF, 0); }
		public TerminalNode MAIN() { return getToken(SophiaParser.MAIN, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public Func_scopeContext func_scope() {
			return getRuleContext(Func_scopeContext.class,0);
		}
		public Main_constructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMain_constructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMain_constructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMain_constructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_constructorContext main_constructor() throws RecognitionException {
		Main_constructorContext _localctx = new Main_constructorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_main_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(DEF);
			setState(126);
			match(MAIN);
			System.out.println("ConstructorDec:Main");
			setState(128);
			match(LPAR);
			setState(129);
			match(RPAR);
			setState(130);
			func_scope();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Main_class_scopeContext extends ParserRuleContext {
		public TerminalNode LBRC() { return getToken(SophiaParser.LBRC, 0); }
		public TerminalNode RBRC() { return getToken(SophiaParser.RBRC, 0); }
		public List<DeclarationsContext> declarations() {
			return getRuleContexts(DeclarationsContext.class);
		}
		public DeclarationsContext declarations(int i) {
			return getRuleContext(DeclarationsContext.class,i);
		}
		public Main_constructorContext main_constructor() {
			return getRuleContext(Main_constructorContext.class,0);
		}
		public Main_class_scopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_class_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMain_class_scope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMain_class_scope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMain_class_scope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_class_scopeContext main_class_scope() throws RecognitionException {
		Main_class_scopeContext _localctx = new Main_class_scopeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_main_class_scope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(LBRC);
			{
			setState(133);
			declarations();
			}
			{
			setState(134);
			main_constructor();
			}
			{
			setState(135);
			declarations();
			}
			setState(136);
			match(RBRC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_scopeContext extends ParserRuleContext {
		public TerminalNode LBRC() { return getToken(SophiaParser.LBRC, 0); }
		public TerminalNode RBRC() { return getToken(SophiaParser.RBRC, 0); }
		public List<DeclarationsContext> declarations() {
			return getRuleContexts(DeclarationsContext.class);
		}
		public DeclarationsContext declarations(int i) {
			return getRuleContext(DeclarationsContext.class,i);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public Class_scopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterClass_scope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitClass_scope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitClass_scope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_scopeContext class_scope() throws RecognitionException {
		Class_scopeContext _localctx = new Class_scopeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_class_scope);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(LBRC);
				{
				setState(139);
				declarations();
				}
				{
				setState(140);
				constructor();
				}
				{
				setState(141);
				declarations();
				}
				setState(142);
				match(RBRC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(LBRC);
				{
				setState(145);
				declarations();
				}
				setState(146);
				match(RBRC);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public Func_declareContext func_declare() {
			return getRuleContext(Func_declareContext.class,0);
		}
		public Var_declare_statementContext var_declare_statement() {
			return getRuleContext(Var_declare_statementContext.class,0);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declarations);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DEF:
					{
					setState(150);
					func_declare();
					}
					break;
				case ID:
					{
					setState(151);
					var_declare_statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				{
				setState(154);
				declarations();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_declareContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(SophiaParser.DEF, 0); }
		public Func_ret_typeContext func_ret_type() {
			return getRuleContext(Func_ret_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SophiaParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public Func_input_varsContext func_input_vars() {
			return getRuleContext(Func_input_varsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public Func_scopeContext func_scope() {
			return getRuleContext(Func_scopeContext.class,0);
		}
		public Func_declareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterFunc_declare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitFunc_declare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitFunc_declare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_declareContext func_declare() throws RecognitionException {
		Func_declareContext _localctx = new Func_declareContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_func_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(DEF);
			setState(160);
			func_ret_type();
			System.out.println("MethodDec:"+getCurrentToken().getText());
			setState(162);
			match(ID);
			setState(163);
			match(LPAR);
			setState(164);
			func_input_vars();
			setState(165);
			match(RPAR);
			setState(166);
			func_scope();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_input_varsContext extends ParserRuleContext {
		public Var_declareContext var_declare() {
			return getRuleContext(Var_declareContext.class,0);
		}
		public TerminalNode COMM() { return getToken(SophiaParser.COMM, 0); }
		public Func_input_varsContext func_input_vars() {
			return getRuleContext(Func_input_varsContext.class,0);
		}
		public Func_input_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_input_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterFunc_input_vars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitFunc_input_vars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitFunc_input_vars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_input_varsContext func_input_vars() throws RecognitionException {
		Func_input_varsContext _localctx = new Func_input_varsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_func_input_vars);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				var_declare();
				{
				setState(169);
				match(COMM);
				setState(170);
				func_input_vars();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				var_declare();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_ret_typeContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(SophiaParser.VOID, 0); }
		public Var_typesContext var_types() {
			return getRuleContext(Var_typesContext.class,0);
		}
		public Func_ret_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_ret_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterFunc_ret_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitFunc_ret_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitFunc_ret_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_ret_typeContext func_ret_type() throws RecognitionException {
		Func_ret_typeContext _localctx = new Func_ret_typeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_func_ret_type);
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(VOID);
				}
				break;
			case LIST:
			case INT:
			case BOOL:
			case FUNC:
			case STR:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				var_types();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_scopeContext extends ParserRuleContext {
		public TerminalNode LBRC() { return getToken(SophiaParser.LBRC, 0); }
		public TerminalNode RBRC() { return getToken(SophiaParser.RBRC, 0); }
		public Some_declarationsContext some_declarations() {
			return getRuleContext(Some_declarationsContext.class,0);
		}
		public Some_statementsContext some_statements() {
			return getRuleContext(Some_statementsContext.class,0);
		}
		public Func_scopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterFunc_scope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitFunc_scope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitFunc_scope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_scopeContext func_scope() throws RecognitionException {
		Func_scopeContext _localctx = new Func_scopeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_func_scope);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(LBRC);
				{
				setState(181);
				some_declarations();
				}
				{
				setState(182);
				some_statements();
				}
				setState(183);
				match(RBRC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(LBRC);
				setState(186);
				match(RBRC);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_scopeContext extends ParserRuleContext {
		public TerminalNode LBRC() { return getToken(SophiaParser.LBRC, 0); }
		public Some_statementsContext some_statements() {
			return getRuleContext(Some_statementsContext.class,0);
		}
		public TerminalNode RBRC() { return getToken(SophiaParser.RBRC, 0); }
		public Simple_scopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterSimple_scope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitSimple_scope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitSimple_scope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_scopeContext simple_scope() throws RecognitionException {
		Simple_scopeContext _localctx = new Simple_scopeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_simple_scope);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(LBRC);
				setState(190);
				some_statements();
				setState(191);
				match(RBRC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(LBRC);
				setState(194);
				match(RBRC);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Some_declarationsContext extends ParserRuleContext {
		public Var_declare_statementContext var_declare_statement() {
			return getRuleContext(Var_declare_statementContext.class,0);
		}
		public Some_declarationsContext some_declarations() {
			return getRuleContext(Some_declarationsContext.class,0);
		}
		public Some_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_some_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterSome_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitSome_declarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitSome_declarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Some_declarationsContext some_declarations() throws RecognitionException {
		Some_declarationsContext _localctx = new Some_declarationsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_some_declarations);
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(197);
				var_declare_statement();
				}
				{
				setState(198);
				some_declarations();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Some_statementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Some_statementsContext some_statements() {
			return getRuleContext(Some_statementsContext.class,0);
		}
		public Some_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_some_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterSome_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitSome_statements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitSome_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Some_statementsContext some_statements() throws RecognitionException {
		Some_statementsContext _localctx = new Some_statementsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_some_statements);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(203);
				statement();
				}
				{
				setState(204);
				some_statements();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Single_statementContext single_statement() {
			return getRuleContext(Single_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public ForeachStatementContext foreachStatement() {
			return getRuleContext(ForeachStatementContext.class,0);
		}
		public Simple_scopeContext simple_scope() {
			return getRuleContext(Simple_scopeContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				single_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				if_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				for_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				foreachStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(213);
				simple_scope();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_statementContext extends ParserRuleContext {
		public TerminalNode ENDOFLINE() { return getToken(SophiaParser.ENDOFLINE, 0); }
		public OneLine_statementContext oneLine_statement() {
			return getRuleContext(OneLine_statementContext.class,0);
		}
		public Assign_statementContext assign_statement() {
			return getRuleContext(Assign_statementContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Single_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterSingle_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitSingle_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitSingle_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_statementContext single_statement() throws RecognitionException {
		Single_statementContext _localctx = new Single_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_single_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(216);
				oneLine_statement();
				}
				break;
			case 2:
				{
				setState(217);
				assign_statement();
				}
				break;
			case 3:
				{
				setState(218);
				func_call();
				System.out.println("MethodCall");
				}
				break;
			}
			setState(223);
			match(ENDOFLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_callContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public Func_argsContext func_args() {
			return getRuleContext(Func_argsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitFunc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_func_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			var();
			setState(226);
			match(LPAR);
			setState(227);
			func_args();
			setState(228);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_argsContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COMM() { return getToken(SophiaParser.COMM, 0); }
		public Func_argsContext func_args() {
			return getRuleContext(Func_argsContext.class,0);
		}
		public Func_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterFunc_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitFunc_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitFunc_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_argsContext func_args() throws RecognitionException {
		Func_argsContext _localctx = new Func_argsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_func_args);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				expr();
				{
				setState(231);
				match(COMM);
				setState(232);
				func_args();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_statementContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SophiaParser.ASSIGN, 0); }
		public Multiple_assign_statementContext multiple_assign_statement() {
			return getRuleContext(Multiple_assign_statementContext.class,0);
		}
		public Assign_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterAssign_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitAssign_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitAssign_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_statementContext assign_statement() throws RecognitionException {
		Assign_statementContext _localctx = new Assign_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assign_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			var();
			setState(239);
			match(ASSIGN);
			setState(240);
			multiple_assign_statement();
			System.out.println("Operator:=");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiple_assign_statementContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SophiaParser.ASSIGN, 0); }
		public Multiple_assign_statementContext multiple_assign_statement() {
			return getRuleContext(Multiple_assign_statementContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Multiple_assign_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_assign_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMultiple_assign_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMultiple_assign_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMultiple_assign_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiple_assign_statementContext multiple_assign_statement() throws RecognitionException {
		Multiple_assign_statementContext _localctx = new Multiple_assign_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_multiple_assign_statement);
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				var();
				setState(244);
				match(ASSIGN);
				setState(245);
				multiple_assign_statement();
				System.out.println("Operator:=");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeachStatementContext extends ParserRuleContext {
		public TerminalNode FORE() { return getToken(SophiaParser.FORE, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode IN() { return getToken(SophiaParser.IN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Single_statementContext single_statement() {
			return getRuleContext(Single_statementContext.class,0);
		}
		public Simple_scopeContext simple_scope() {
			return getRuleContext(Simple_scopeContext.class,0);
		}
		public ForeachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterForeachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitForeachStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitForeachStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachStatementContext foreachStatement() throws RecognitionException {
		ForeachStatementContext _localctx = new ForeachStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_foreachStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(FORE);
			System.out.println("Loop:foreach");
			setState(253);
			match(LPAR);
			{
			setState(254);
			var();
			setState(255);
			match(IN);
			setState(256);
			expr();
			}
			setState(258);
			match(RPAR);
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
			case CONT:
			case PRI:
			case RET:
			case BRK:
			case ID:
				{
				setState(259);
				single_statement();
				}
				break;
			case LBRC:
				{
				setState(260);
				simple_scope();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(SophiaParser.FOR, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public List<TerminalNode> ENDOFLINE() { return getTokens(SophiaParser.ENDOFLINE); }
		public TerminalNode ENDOFLINE(int i) {
			return getToken(SophiaParser.ENDOFLINE, i);
		}
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public List<Assign_statementContext> assign_statement() {
			return getRuleContexts(Assign_statementContext.class);
		}
		public Assign_statementContext assign_statement(int i) {
			return getRuleContext(Assign_statementContext.class,i);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Single_statementContext single_statement() {
			return getRuleContext(Single_statementContext.class,0);
		}
		public Simple_scopeContext simple_scope() {
			return getRuleContext(Simple_scopeContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(FOR);
			System.out.println("Loop:for");
			setState(265);
			match(LPAR);
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
			case ID:
				{
				setState(266);
				assign_statement();
				}
				break;
			case ENDOFLINE:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(270);
			match(ENDOFLINE);
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNARYLOGIC:
			case SUMOP:
			case FALSE:
			case TRUE:
			case THIS:
			case NULL:
			case NEW:
			case LBRA:
			case LPAR:
			case ID:
			case NUM:
			case STRING:
				{
				setState(271);
				bool_expr();
				}
				break;
			case ENDOFLINE:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(275);
			match(ENDOFLINE);
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
			case ID:
				{
				setState(276);
				assign_statement();
				}
				break;
			case RPAR:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(280);
			match(RPAR);
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
			case CONT:
			case PRI:
			case RET:
			case BRK:
			case ID:
				{
				setState(281);
				single_statement();
				}
				break;
			case LBRC:
				{
				setState(282);
				simple_scope();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OneLine_statementContext extends ParserRuleContext {
		public TerminalNode BRK() { return getToken(SophiaParser.BRK, 0); }
		public TerminalNode CONT() { return getToken(SophiaParser.CONT, 0); }
		public TerminalNode RET() { return getToken(SophiaParser.RET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PRI() { return getToken(SophiaParser.PRI, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public OneLine_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneLine_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterOneLine_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitOneLine_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitOneLine_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OneLine_statementContext oneLine_statement() throws RecognitionException {
		OneLine_statementContext _localctx = new OneLine_statementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_oneLine_statement);
		try {
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BRK:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				match(BRK);
				System.out.println("Control:break");
				}
				break;
			case CONT:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				match(CONT);
				System.out.println("Control:continue");
				}
				break;
			case RET:
				enterOuterAlt(_localctx, 3);
				{
				System.out.println("Return");
				setState(290);
				match(RET);
				setState(291);
				expr();
				}
				break;
			case PRI:
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
				match(PRI);
				System.out.println("Built-in:print");
				setState(294);
				match(LPAR);
				setState(295);
				expr();
				setState(296);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public Open_if_statementContext open_if_statement() {
			return getRuleContext(Open_if_statementContext.class,0);
		}
		public Close_if_statementContext close_if_statement() {
			return getRuleContext(Close_if_statementContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_if_statement);
		try {
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				open_if_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				close_if_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Open_if_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SophiaParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Close_if_statementContext close_if_statement() {
			return getRuleContext(Close_if_statementContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(SophiaParser.ELSE, 0); }
		public Open_if_statementContext open_if_statement() {
			return getRuleContext(Open_if_statementContext.class,0);
		}
		public Open_if_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterOpen_if_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitOpen_if_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitOpen_if_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Open_if_statementContext open_if_statement() throws RecognitionException {
		Open_if_statementContext _localctx = new Open_if_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_open_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(IF);
			System.out.println("Conditional:if");
			setState(306);
			match(LPAR);
			{
			setState(307);
			bool_expr();
			}
			setState(308);
			match(RPAR);
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(309);
				if_statement();
				}
				break;
			case 2:
				{
				setState(310);
				close_if_statement();
				setState(311);
				match(ELSE);
				System.out.println("Conditional:else");
				setState(313);
				open_if_statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Close_if_statementContext extends ParserRuleContext {
		public Non_if_statementContext non_if_statement() {
			return getRuleContext(Non_if_statementContext.class,0);
		}
		public TerminalNode IF() { return getToken(SophiaParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public List<Close_if_statementContext> close_if_statement() {
			return getRuleContexts(Close_if_statementContext.class);
		}
		public Close_if_statementContext close_if_statement(int i) {
			return getRuleContext(Close_if_statementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SophiaParser.ELSE, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Close_if_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterClose_if_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitClose_if_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitClose_if_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Close_if_statementContext close_if_statement() throws RecognitionException {
		Close_if_statementContext _localctx = new Close_if_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_close_if_statement);
		try {
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
			case CONT:
			case PRI:
			case RET:
			case BRK:
			case LBRC:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				non_if_statement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				match(IF);
				System.out.println("Conditional:if");
				setState(320);
				match(LPAR);
				{
				setState(321);
				bool_expr();
				}
				setState(322);
				match(RPAR);
				setState(323);
				close_if_statement();
				setState(324);
				match(ELSE);
				System.out.println("Conditional:else");
				setState(326);
				close_if_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_if_statementContext extends ParserRuleContext {
		public Single_statementContext single_statement() {
			return getRuleContext(Single_statementContext.class,0);
		}
		public Simple_scopeContext simple_scope() {
			return getRuleContext(Simple_scopeContext.class,0);
		}
		public Non_if_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterNon_if_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitNon_if_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitNon_if_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_if_statementContext non_if_statement() throws RecognitionException {
		Non_if_statementContext _localctx = new Non_if_statementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_non_if_statement);
		try {
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
			case CONT:
			case PRI:
			case RET:
			case BRK:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				single_statement();
				}
				break;
			case LBRC:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				simple_scope();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode PLUSPLUS() { return getToken(SophiaParser.PLUSPLUS, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode MINMIN() { return getToken(SophiaParser.MINMIN, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expr);
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				match(PLUSPLUS);
				setState(335);
				var();
				System.out.println("Operator:++");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				match(MINMIN);
				setState(339);
				var();
				System.out.println("Operator:--");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(342);
				var();
				setState(343);
				match(PLUSPLUS);
				System.out.println("Operator:++");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(346);
				var();
				setState(347);
				match(MINMIN);
				System.out.println("Operator:--");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(350);
				bool_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_exprContext extends ParserRuleContext {
		public And_exprContext and_expr() {
			return getRuleContext(And_exprContext.class,0);
		}
		public TerminalNode OROP() { return getToken(SophiaParser.OROP, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitBool_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitBool_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_bool_expr);
		try {
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				and_expr();
				setState(354);
				match(OROP);
				setState(355);
				bool_expr();
				System.out.println("Operator:||");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				and_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class And_exprContext extends ParserRuleContext {
		public Unary_rel_exprContext unary_rel_expr() {
			return getRuleContext(Unary_rel_exprContext.class,0);
		}
		public TerminalNode ANDOP() { return getToken(SophiaParser.ANDOP, 0); }
		public And_exprContext and_expr() {
			return getRuleContext(And_exprContext.class,0);
		}
		public And_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterAnd_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitAnd_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitAnd_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_exprContext and_expr() throws RecognitionException {
		And_exprContext _localctx = new And_exprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_and_expr);
		try {
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				unary_rel_expr();
				setState(362);
				match(ANDOP);
				setState(363);
				and_expr();
				System.out.println("Operator:&&");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				unary_rel_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_rel_exprContext extends ParserRuleContext {
		public TerminalNode UNARYLOGIC() { return getToken(SophiaParser.UNARYLOGIC, 0); }
		public Unary_rel_exprContext unary_rel_expr() {
			return getRuleContext(Unary_rel_exprContext.class,0);
		}
		public Rel_exprContext rel_expr() {
			return getRuleContext(Rel_exprContext.class,0);
		}
		public Unary_rel_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_rel_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterUnary_rel_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitUnary_rel_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitUnary_rel_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_rel_exprContext unary_rel_expr() throws RecognitionException {
		Unary_rel_exprContext _localctx = new Unary_rel_exprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_unary_rel_expr);
		try {
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNARYLOGIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				match(UNARYLOGIC);
				setState(370);
				unary_rel_expr();
				System.out.println("Operator:!");
				}
				break;
			case SUMOP:
			case FALSE:
			case TRUE:
			case THIS:
			case NULL:
			case NEW:
			case LBRA:
			case LPAR:
			case ID:
			case NUM:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				rel_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rel_exprContext extends ParserRuleContext {
		public Token COMPOP;
		public Token GT;
		public Token LST;
		public List<Sum_exprContext> sum_expr() {
			return getRuleContexts(Sum_exprContext.class);
		}
		public Sum_exprContext sum_expr(int i) {
			return getRuleContext(Sum_exprContext.class,i);
		}
		public TerminalNode COMPOP() { return getToken(SophiaParser.COMPOP, 0); }
		public TerminalNode GT() { return getToken(SophiaParser.GT, 0); }
		public TerminalNode LST() { return getToken(SophiaParser.LST, 0); }
		public Rel_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterRel_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitRel_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitRel_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rel_exprContext rel_expr() throws RecognitionException {
		Rel_exprContext _localctx = new Rel_exprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_rel_expr);
		try {
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				sum_expr();
				setState(377);
				((Rel_exprContext)_localctx).COMPOP = match(COMPOP);
				setState(378);
				sum_expr();
				System.out.println("Operator:"+(((Rel_exprContext)_localctx).COMPOP!=null?((Rel_exprContext)_localctx).COMPOP.getText():null)+"");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
				sum_expr();
				setState(382);
				((Rel_exprContext)_localctx).GT = match(GT);
				setState(383);
				sum_expr();
				System.out.println("Operator:"+(((Rel_exprContext)_localctx).GT!=null?((Rel_exprContext)_localctx).GT.getText():null)+"");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(386);
				sum_expr();
				setState(387);
				((Rel_exprContext)_localctx).LST = match(LST);
				setState(388);
				sum_expr();
				System.out.println("Operator:"+(((Rel_exprContext)_localctx).LST!=null?((Rel_exprContext)_localctx).LST.getText():null)+"");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(391);
				sum_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sum_exprContext extends ParserRuleContext {
		public Token SUMOP;
		public List<Mul_exprContext> mul_expr() {
			return getRuleContexts(Mul_exprContext.class);
		}
		public Mul_exprContext mul_expr(int i) {
			return getRuleContext(Mul_exprContext.class,i);
		}
		public List<TerminalNode> SUMOP() { return getTokens(SophiaParser.SUMOP); }
		public TerminalNode SUMOP(int i) {
			return getToken(SophiaParser.SUMOP, i);
		}
		public Sum_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterSum_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitSum_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitSum_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sum_exprContext sum_expr() throws RecognitionException {
		Sum_exprContext _localctx = new Sum_exprContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_sum_expr);
		int _la;
		try {
			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				mul_expr();
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SUMOP) {
					{
					{
					setState(395);
					((Sum_exprContext)_localctx).SUMOP = match(SUMOP);
					setState(396);
					mul_expr();
					System.out.println("Operator:"+(((Sum_exprContext)_localctx).SUMOP!=null?((Sum_exprContext)_localctx).SUMOP.getText():null)+"");
					}
					}
					setState(403);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				mul_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mul_exprContext extends ParserRuleContext {
		public Token MULTOP;
		public List<Unary_exprContext> unary_expr() {
			return getRuleContexts(Unary_exprContext.class);
		}
		public Unary_exprContext unary_expr(int i) {
			return getRuleContext(Unary_exprContext.class,i);
		}
		public List<TerminalNode> MULTOP() { return getTokens(SophiaParser.MULTOP); }
		public TerminalNode MULTOP(int i) {
			return getToken(SophiaParser.MULTOP, i);
		}
		public Mul_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterMul_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitMul_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitMul_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mul_exprContext mul_expr() throws RecognitionException {
		Mul_exprContext _localctx = new Mul_exprContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_mul_expr);
		int _la;
		try {
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				unary_expr();
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MULTOP) {
					{
					{
					setState(408);
					((Mul_exprContext)_localctx).MULTOP = match(MULTOP);
					setState(409);
					unary_expr();
					System.out.println("Operator:"+(((Mul_exprContext)_localctx).MULTOP!=null?((Mul_exprContext)_localctx).MULTOP.getText():null)+"");
					}
					}
					setState(416);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
				unary_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_exprContext extends ParserRuleContext {
		public TerminalNode SUMOP() { return getToken(SophiaParser.SUMOP, 0); }
		public Unary_exprContext unary_expr() {
			return getRuleContext(Unary_exprContext.class,0);
		}
		public Single_unitContext single_unit() {
			return getRuleContext(Single_unitContext.class,0);
		}
		public Unary_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterUnary_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitUnary_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitUnary_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_exprContext unary_expr() throws RecognitionException {
		Unary_exprContext _localctx = new Unary_exprContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_unary_expr);
		try {
			setState(425);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				match(SUMOP);
				setState(421);
				unary_expr();
				System.out.println("Operator:-");
				}
				break;
			case FALSE:
			case TRUE:
			case THIS:
			case NULL:
			case NEW:
			case LBRA:
			case LPAR:
			case ID:
			case NUM:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				single_unit();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_unitContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(SophiaParser.TRUE, 0); }
		public TerminalNode NULL() { return getToken(SophiaParser.NULL, 0); }
		public TerminalNode FALSE() { return getToken(SophiaParser.FALSE, 0); }
		public TerminalNode STRING() { return getToken(SophiaParser.STRING, 0); }
		public TerminalNode NUM() { return getToken(SophiaParser.NUM, 0); }
		public TerminalNode LBRA() { return getToken(SophiaParser.LBRA, 0); }
		public Func_argsContext func_args() {
			return getRuleContext(Func_argsContext.class,0);
		}
		public TerminalNode RBRA() { return getToken(SophiaParser.RBRA, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public TerminalNode NEW() { return getToken(SophiaParser.NEW, 0); }
		public TerminalNode ID() { return getToken(SophiaParser.ID, 0); }
		public Single_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterSingle_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitSingle_unit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitSingle_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_unitContext single_unit() throws RecognitionException {
		Single_unitContext _localctx = new Single_unitContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_single_unit);
		try {
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				func_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(429);
				match(TRUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(430);
				match(NULL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(431);
				match(FALSE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(432);
				match(STRING);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(433);
				match(NUM);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(434);
				match(LBRA);
				setState(435);
				func_args();
				setState(436);
				match(RBRA);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(438);
				match(LPAR);
				setState(439);
				expr();
				setState(440);
				match(RPAR);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(442);
				match(NEW);
				setState(443);
				match(ID);
				setState(444);
				match(LPAR);
				setState(445);
				func_args();
				setState(446);
				match(RPAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_typesContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SophiaParser.INT, 0); }
		public TerminalNode STR() { return getToken(SophiaParser.STR, 0); }
		public TerminalNode BOOL() { return getToken(SophiaParser.BOOL, 0); }
		public TerminalNode ID() { return getToken(SophiaParser.ID, 0); }
		public TerminalNode FUNC() { return getToken(SophiaParser.FUNC, 0); }
		public TerminalNode GT() { return getToken(SophiaParser.GT, 0); }
		public TerminalNode FUNCSIG() { return getToken(SophiaParser.FUNCSIG, 0); }
		public TerminalNode LST() { return getToken(SophiaParser.LST, 0); }
		public TerminalNode VOID() { return getToken(SophiaParser.VOID, 0); }
		public Some_typesContext some_types() {
			return getRuleContext(Some_typesContext.class,0);
		}
		public Func_ret_typeContext func_ret_type() {
			return getRuleContext(Func_ret_typeContext.class,0);
		}
		public List_typeContext list_type() {
			return getRuleContext(List_typeContext.class,0);
		}
		public Var_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterVar_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitVar_types(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitVar_types(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_typesContext var_types() throws RecognitionException {
		Var_typesContext _localctx = new Var_typesContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_var_types);
		try {
			setState(465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				match(INT);
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				match(STR);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(452);
				match(BOOL);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(453);
				match(ID);
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 5);
				{
				setState(454);
				match(FUNC);
				setState(455);
				match(GT);
				setState(458);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VOID:
					{
					setState(456);
					match(VOID);
					}
					break;
				case LIST:
				case INT:
				case BOOL:
				case FUNC:
				case STR:
				case FUNCSIG:
				case ID:
					{
					setState(457);
					some_types();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(460);
				match(FUNCSIG);
				{
				setState(461);
				func_ret_type();
				}
				setState(462);
				match(LST);
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 6);
				{
				setState(464);
				list_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_typeContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(SophiaParser.LIST, 0); }
		public TerminalNode LPAR() { return getToken(SophiaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SophiaParser.RPAR, 0); }
		public Some_typesContext some_types() {
			return getRuleContext(Some_typesContext.class,0);
		}
		public Func_input_varsContext func_input_vars() {
			return getRuleContext(Func_input_varsContext.class,0);
		}
		public TerminalNode NUM() { return getToken(SophiaParser.NUM, 0); }
		public TerminalNode COUPLE() { return getToken(SophiaParser.COUPLE, 0); }
		public Var_typesContext var_types() {
			return getRuleContext(Var_typesContext.class,0);
		}
		public List_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterList_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitList_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitList_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_typeContext list_type() throws RecognitionException {
		List_typeContext _localctx = new List_typeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_list_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(LIST);
			setState(468);
			match(LPAR);
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				{
				setState(469);
				match(NUM);
				setState(470);
				match(COUPLE);
				setState(471);
				var_types();
				}
				}
				break;
			case 2:
				{
				setState(472);
				some_types();
				}
				break;
			case 3:
				{
				setState(473);
				func_input_vars();
				}
				break;
			}
			setState(476);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Some_typesContext extends ParserRuleContext {
		public Var_typesContext var_types() {
			return getRuleContext(Var_typesContext.class,0);
		}
		public TerminalNode COMM() { return getToken(SophiaParser.COMM, 0); }
		public Some_typesContext some_types() {
			return getRuleContext(Some_typesContext.class,0);
		}
		public Some_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_some_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterSome_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitSome_types(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitSome_types(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Some_typesContext some_types() throws RecognitionException {
		Some_typesContext _localctx = new Some_typesContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_some_types);
		try {
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(478);
				var_types();
				setState(479);
				match(COMM);
				setState(480);
				some_types();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				var_types();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declare_statementContext extends ParserRuleContext {
		public Var_declareContext var_declare() {
			return getRuleContext(Var_declareContext.class,0);
		}
		public TerminalNode ENDOFLINE() { return getToken(SophiaParser.ENDOFLINE, 0); }
		public Var_declare_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declare_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterVar_declare_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitVar_declare_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitVar_declare_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declare_statementContext var_declare_statement() throws RecognitionException {
		Var_declare_statementContext _localctx = new Var_declare_statementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_var_declare_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("VarDec:"+getCurrentToken().getText());
			setState(487);
			var_declare();
			setState(488);
			match(ENDOFLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declareContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SophiaParser.ID, 0); }
		public TerminalNode DEFINIT() { return getToken(SophiaParser.DEFINIT, 0); }
		public Var_typesContext var_types() {
			return getRuleContext(Var_typesContext.class,0);
		}
		public Var_declareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterVar_declare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitVar_declare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitVar_declare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declareContext var_declare() throws RecognitionException {
		Var_declareContext _localctx = new Var_declareContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_var_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(ID);
			setState(491);
			match(DEFINIT);
			setState(492);
			var_types();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode THIS() { return getToken(SophiaParser.THIS, 0); }
		public TerminalNode DOT() { return getToken(SophiaParser.DOT, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS) {
				{
				setState(494);
				match(THIS);
				setState(495);
				match(DOT);
				}
			}

			setState(498);
			variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SophiaParser.ID, 0); }
		public TerminalNode DOT() { return getToken(SophiaParser.DOT, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<TerminalNode> LBRA() { return getTokens(SophiaParser.LBRA); }
		public TerminalNode LBRA(int i) {
			return getToken(SophiaParser.LBRA, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> RBRA() { return getTokens(SophiaParser.RBRA); }
		public TerminalNode RBRA(int i) {
			return getToken(SophiaParser.RBRA, i);
		}
		public List<TerminalNode> LPAR() { return getTokens(SophiaParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(SophiaParser.LPAR, i);
		}
		public List<Func_argsContext> func_args() {
			return getRuleContexts(Func_argsContext.class);
		}
		public Func_argsContext func_args(int i) {
			return getRuleContext(Func_argsContext.class,i);
		}
		public List<TerminalNode> RPAR() { return getTokens(SophiaParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(SophiaParser.RPAR, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SophiaListener ) ((SophiaListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SophiaVisitor ) return ((SophiaVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_variable);
		int _la;
		try {
			int _alt;
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(500);
				match(ID);
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRA || _la==LPAR) {
					{
					setState(509);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LBRA:
						{
						setState(501);
						match(LBRA);
						setState(502);
						expr();
						setState(503);
						match(RBRA);
						}
						break;
					case LPAR:
						{
						setState(505);
						match(LPAR);
						setState(506);
						func_args();
						setState(507);
						match(RPAR);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(513);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(514);
				match(DOT);
				setState(515);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				match(ID);
				setState(527);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(525);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LBRA:
							{
							setState(517);
							match(LBRA);
							setState(518);
							expr();
							setState(519);
							match(RBRA);
							}
							break;
						case LPAR:
							{
							setState(521);
							match(LPAR);
							setState(522);
							func_args();
							setState(523);
							match(RPAR);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(529);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3>\u0217\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4k\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4s\n\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5~\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0097\n\b\3\t\3\t\5\t"+
		"\u009b\n\t\3\t\3\t\3\t\5\t\u00a0\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b1\n\13\3\f\3\f\5\f\u00b5\n\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00be\n\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u00c6\n\16\3\17\3\17\3\17\3\17\5\17\u00cc\n\17\3\20\3\20\3\20"+
		"\3\20\5\20\u00d2\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u00d9\n\21\3\22\3"+
		"\22\3\22\3\22\3\22\5\22\u00e0\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00ef\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00fc\n\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u0108\n\27\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u010f\n\30\3\30\3\30\3\30\5\30\u0114\n\30\3\30\3\30\3\30\5\30\u0119\n"+
		"\30\3\30\3\30\3\30\5\30\u011e\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u012d\n\31\3\32\3\32\5\32\u0131\n"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u013e"+
		"\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u014b"+
		"\n\34\3\35\3\35\5\35\u014f\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0162\n\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u016a\n\37\3 \3 \3 \3 \3 \3 \5 \u0172\n \3!"+
		"\3!\3!\3!\3!\5!\u0179\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\5\"\u018b\n\"\3#\3#\3#\3#\3#\7#\u0192\n#\f#\16#\u0195"+
		"\13#\3#\5#\u0198\n#\3$\3$\3$\3$\3$\7$\u019f\n$\f$\16$\u01a2\13$\3$\5$"+
		"\u01a5\n$\3%\3%\3%\3%\3%\5%\u01ac\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u01c3\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\5\'\u01cd\n\'\3\'\3\'\3\'\3\'\3\'\5\'\u01d4\n\'\3(\3(\3(\3(\3(\3"+
		"(\3(\5(\u01dd\n(\3(\3(\3)\3)\3)\3)\3)\3)\5)\u01e7\n)\3*\3*\3*\3*\3+\3"+
		"+\3+\3+\3,\3,\5,\u01f3\n,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u0200\n"+
		"-\f-\16-\u0203\13-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u0210\n-\f-\16"+
		"-\u0213\13-\5-\u0215\n-\3-\2\2.\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX\2\2\2\u0234\2Z\3\2\2\2\4_\3\2\2"+
		"\2\6r\3\2\2\2\b}\3\2\2\2\n\177\3\2\2\2\f\u0086\3\2\2\2\16\u0096\3\2\2"+
		"\2\20\u009f\3\2\2\2\22\u00a1\3\2\2\2\24\u00b0\3\2\2\2\26\u00b4\3\2\2\2"+
		"\30\u00bd\3\2\2\2\32\u00c5\3\2\2\2\34\u00cb\3\2\2\2\36\u00d1\3\2\2\2 "+
		"\u00d8\3\2\2\2\"\u00df\3\2\2\2$\u00e3\3\2\2\2&\u00ee\3\2\2\2(\u00f0\3"+
		"\2\2\2*\u00fb\3\2\2\2,\u00fd\3\2\2\2.\u0109\3\2\2\2\60\u012c\3\2\2\2\62"+
		"\u0130\3\2\2\2\64\u0132\3\2\2\2\66\u014a\3\2\2\28\u014e\3\2\2\2:\u0161"+
		"\3\2\2\2<\u0169\3\2\2\2>\u0171\3\2\2\2@\u0178\3\2\2\2B\u018a\3\2\2\2D"+
		"\u0197\3\2\2\2F\u01a4\3\2\2\2H\u01ab\3\2\2\2J\u01c2\3\2\2\2L\u01d3\3\2"+
		"\2\2N\u01d5\3\2\2\2P\u01e6\3\2\2\2R\u01e8\3\2\2\2T\u01ec\3\2\2\2V\u01f2"+
		"\3\2\2\2X\u0214\3\2\2\2Z[\5\6\4\2[\\\5\4\3\2\\]\5\6\4\2]^\7\2\2\3^\3\3"+
		"\2\2\2_`\7\f\2\2`a\7\3\2\2ab\b\3\1\2bc\5\f\7\2c\5\3\2\2\2de\7\f\2\2ef"+
		"\b\4\1\2fj\7\62\2\2gh\7\20\2\2hi\b\4\1\2ik\7\62\2\2jg\3\2\2\2jk\3\2\2"+
		"\2kl\3\2\2\2lm\b\4\1\2mn\5\16\b\2no\3\2\2\2op\5\6\4\2ps\3\2\2\2qs\3\2"+
		"\2\2rd\3\2\2\2rq\3\2\2\2s\7\3\2\2\2tu\7\30\2\2uv\b\5\1\2vw\7\62\2\2wx"+
		"\7,\2\2xy\5\24\13\2yz\7-\2\2z{\5\30\r\2{~\3\2\2\2|~\3\2\2\2}t\3\2\2\2"+
		"}|\3\2\2\2~\t\3\2\2\2\177\u0080\7\30\2\2\u0080\u0081\7\3\2\2\u0081\u0082"+
		"\b\6\1\2\u0082\u0083\7,\2\2\u0083\u0084\7-\2\2\u0084\u0085\5\30\r\2\u0085"+
		"\13\3\2\2\2\u0086\u0087\7(\2\2\u0087\u0088\5\20\t\2\u0088\u0089\5\n\6"+
		"\2\u0089\u008a\5\20\t\2\u008a\u008b\7)\2\2\u008b\r\3\2\2\2\u008c\u008d"+
		"\7(\2\2\u008d\u008e\5\20\t\2\u008e\u008f\5\b\5\2\u008f\u0090\5\20\t\2"+
		"\u0090\u0091\7)\2\2\u0091\u0097\3\2\2\2\u0092\u0093\7(\2\2\u0093\u0094"+
		"\5\20\t\2\u0094\u0095\7)\2\2\u0095\u0097\3\2\2\2\u0096\u008c\3\2\2\2\u0096"+
		"\u0092\3\2\2\2\u0097\17\3\2\2\2\u0098\u009b\5\22\n\2\u0099\u009b\5R*\2"+
		"\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d"+
		"\5\20\t\2\u009d\u00a0\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009a\3\2\2\2"+
		"\u009f\u009e\3\2\2\2\u00a0\21\3\2\2\2\u00a1\u00a2\7\30\2\2\u00a2\u00a3"+
		"\5\26\f\2\u00a3\u00a4\b\n\1\2\u00a4\u00a5\7\62\2\2\u00a5\u00a6\7,\2\2"+
		"\u00a6\u00a7\5\24\13\2\u00a7\u00a8\7-\2\2\u00a8\u00a9\5\30\r\2\u00a9\23"+
		"\3\2\2\2\u00aa\u00ab\5T+\2\u00ab\u00ac\7%\2\2\u00ac\u00ad\5\24\13\2\u00ad"+
		"\u00b1\3\2\2\2\u00ae\u00b1\5T+\2\u00af\u00b1\3\2\2\2\u00b0\u00aa\3\2\2"+
		"\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\25\3\2\2\2\u00b2\u00b5"+
		"\7\"\2\2\u00b3\u00b5\5L\'\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5"+
		"\27\3\2\2\2\u00b6\u00b7\7(\2\2\u00b7\u00b8\5\34\17\2\u00b8\u00b9\5\36"+
		"\20\2\u00b9\u00ba\7)\2\2\u00ba\u00be\3\2\2\2\u00bb\u00bc\7(\2\2\u00bc"+
		"\u00be\7)\2\2\u00bd\u00b6\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\31\3\2\2\2"+
		"\u00bf\u00c0\7(\2\2\u00c0\u00c1\5\36\20\2\u00c1\u00c2\7)\2\2\u00c2\u00c6"+
		"\3\2\2\2\u00c3\u00c4\7(\2\2\u00c4\u00c6\7)\2\2\u00c5\u00bf\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c6\33\3\2\2\2\u00c7\u00c8\5R*\2\u00c8\u00c9\5\34\17"+
		"\2\u00c9\u00cc\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cb\u00ca"+
		"\3\2\2\2\u00cc\35\3\2\2\2\u00cd\u00ce\5 \21\2\u00ce\u00cf\5\36\20\2\u00cf"+
		"\u00d2\3\2\2\2\u00d0\u00d2\5 \21\2\u00d1\u00cd\3\2\2\2\u00d1\u00d0\3\2"+
		"\2\2\u00d2\37\3\2\2\2\u00d3\u00d9\5\"\22\2\u00d4\u00d9\5\62\32\2\u00d5"+
		"\u00d9\5.\30\2\u00d6\u00d9\5,\27\2\u00d7\u00d9\5\32\16\2\u00d8\u00d3\3"+
		"\2\2\2\u00d8\u00d4\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8"+
		"\u00d7\3\2\2\2\u00d9!\3\2\2\2\u00da\u00e0\5\60\31\2\u00db\u00e0\5(\25"+
		"\2\u00dc\u00dd\5$\23\2\u00dd\u00de\b\22\1\2\u00de\u00e0\3\2\2\2\u00df"+
		"\u00da\3\2\2\2\u00df\u00db\3\2\2\2\u00df\u00dc\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\u00e2\7#\2\2\u00e2#\3\2\2\2\u00e3\u00e4\5V,\2\u00e4\u00e5\7"+
		",\2\2\u00e5\u00e6\5&\24\2\u00e6\u00e7\7-\2\2\u00e7%\3\2\2\2\u00e8\u00e9"+
		"\5:\36\2\u00e9\u00ea\7%\2\2\u00ea\u00eb\5&\24\2\u00eb\u00ef\3\2\2\2\u00ec"+
		"\u00ef\5:\36\2\u00ed\u00ef\3\2\2\2\u00ee\u00e8\3\2\2\2\u00ee\u00ec\3\2"+
		"\2\2\u00ee\u00ed\3\2\2\2\u00ef\'\3\2\2\2\u00f0\u00f1\5V,\2\u00f1\u00f2"+
		"\7&\2\2\u00f2\u00f3\5*\26\2\u00f3\u00f4\b\25\1\2\u00f4)\3\2\2\2\u00f5"+
		"\u00f6\5V,\2\u00f6\u00f7\7&\2\2\u00f7\u00f8\5*\26\2\u00f8\u00f9\b\26\1"+
		"\2\u00f9\u00fc\3\2\2\2\u00fa\u00fc\5:\36\2\u00fb\u00f5\3\2\2\2\u00fb\u00fa"+
		"\3\2\2\2\u00fc+\3\2\2\2\u00fd\u00fe\7\31\2\2\u00fe\u00ff\b\27\1\2\u00ff"+
		"\u0100\7,\2\2\u0100\u0101\5V,\2\u0101\u0102\7\23\2\2\u0102\u0103\5:\36"+
		"\2\u0103\u0104\3\2\2\2\u0104\u0107\7-\2\2\u0105\u0108\5\"\22\2\u0106\u0108"+
		"\5\32\16\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108-\3\2\2\2\u0109"+
		"\u010a\7\25\2\2\u010a\u010b\b\30\1\2\u010b\u010e\7,\2\2\u010c\u010f\5"+
		"(\25\2\u010d\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0113\7#\2\2\u0111\u0114\5<\37\2\u0112\u0114\3\2"+
		"\2\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0118\7#\2\2\u0116\u0119\5(\25\2\u0117\u0119\3\2\2\2\u0118\u0116\3\2"+
		"\2\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011d\7-\2\2\u011b"+
		"\u011e\5\"\22\2\u011c\u011e\5\32\16\2\u011d\u011b\3\2\2\2\u011d\u011c"+
		"\3\2\2\2\u011e/\3\2\2\2\u011f\u0120\7!\2\2\u0120\u012d\b\31\1\2\u0121"+
		"\u0122\7\35\2\2\u0122\u012d\b\31\1\2\u0123\u0124\b\31\1\2\u0124\u0125"+
		"\7 \2\2\u0125\u012d\5:\36\2\u0126\u0127\7\37\2\2\u0127\u0128\b\31\1\2"+
		"\u0128\u0129\7,\2\2\u0129\u012a\5:\36\2\u012a\u012b\7-\2\2\u012b\u012d"+
		"\3\2\2\2\u012c\u011f\3\2\2\2\u012c\u0121\3\2\2\2\u012c\u0123\3\2\2\2\u012c"+
		"\u0126\3\2\2\2\u012d\61\3\2\2\2\u012e\u0131\5\64\33\2\u012f\u0131\5\66"+
		"\34\2\u0130\u012e\3\2\2\2\u0130\u012f\3\2\2\2\u0131\63\3\2\2\2\u0132\u0133"+
		"\7\r\2\2\u0133\u0134\b\33\1\2\u0134\u0135\7,\2\2\u0135\u0136\5<\37\2\u0136"+
		"\u013d\7-\2\2\u0137\u013e\5\62\32\2\u0138\u0139\5\66\34\2\u0139\u013a"+
		"\7\21\2\2\u013a\u013b\b\33\1\2\u013b\u013c\5\64\33\2\u013c\u013e\3\2\2"+
		"\2\u013d\u0137\3\2\2\2\u013d\u0138\3\2\2\2\u013e\65\3\2\2\2\u013f\u014b"+
		"\58\35\2\u0140\u0141\7\r\2\2\u0141\u0142\b\34\1\2\u0142\u0143\7,\2\2\u0143"+
		"\u0144\5<\37\2\u0144\u0145\7-\2\2\u0145\u0146\5\66\34\2\u0146\u0147\7"+
		"\21\2\2\u0147\u0148\b\34\1\2\u0148\u0149\5\66\34\2\u0149\u014b\3\2\2\2"+
		"\u014a\u013f\3\2\2\2\u014a\u0140\3\2\2\2\u014b\67\3\2\2\2\u014c\u014f"+
		"\5\"\22\2\u014d\u014f\5\32\16\2\u014e\u014c\3\2\2\2\u014e\u014d\3\2\2"+
		"\2\u014f9\3\2\2\2\u0150\u0151\7\5\2\2\u0151\u0152\5V,\2\u0152\u0153\b"+
		"\36\1\2\u0153\u0162\3\2\2\2\u0154\u0155\7\4\2\2\u0155\u0156\5V,\2\u0156"+
		"\u0157\b\36\1\2\u0157\u0162\3\2\2\2\u0158\u0159\5V,\2\u0159\u015a\7\5"+
		"\2\2\u015a\u015b\b\36\1\2\u015b\u0162\3\2\2\2\u015c\u015d\5V,\2\u015d"+
		"\u015e\7\4\2\2\u015e\u015f\b\36\1\2\u015f\u0162\3\2\2\2\u0160\u0162\5"+
		"<\37\2\u0161\u0150\3\2\2\2\u0161\u0154\3\2\2\2\u0161\u0158\3\2\2\2\u0161"+
		"\u015c\3\2\2\2\u0161\u0160\3\2\2\2\u0162;\3\2\2\2\u0163\u0164\5> \2\u0164"+
		"\u0165\7\6\2\2\u0165\u0166\5<\37\2\u0166\u0167\b\37\1\2\u0167\u016a\3"+
		"\2\2\2\u0168\u016a\5> \2\u0169\u0163\3\2\2\2\u0169\u0168\3\2\2\2\u016a"+
		"=\3\2\2\2\u016b\u016c\5@!\2\u016c\u016d\7\7\2\2\u016d\u016e\5> \2\u016e"+
		"\u016f\b \1\2\u016f\u0172\3\2\2\2\u0170\u0172\5@!\2\u0171\u016b\3\2\2"+
		"\2\u0171\u0170\3\2\2\2\u0172?\3\2\2\2\u0173\u0174\7\b\2\2\u0174\u0175"+
		"\5@!\2\u0175\u0176\b!\1\2\u0176\u0179\3\2\2\2\u0177\u0179\5B\"\2\u0178"+
		"\u0173\3\2\2\2\u0178\u0177\3\2\2\2\u0179A\3\2\2\2\u017a\u017b\5D#\2\u017b"+
		"\u017c\7\n\2\2\u017c\u017d\5D#\2\u017d\u017e\b\"\1\2\u017e\u018b\3\2\2"+
		"\2\u017f\u0180\5D#\2\u0180\u0181\7\61\2\2\u0181\u0182\5D#\2\u0182\u0183"+
		"\b\"\1\2\u0183\u018b\3\2\2\2\u0184\u0185\5D#\2\u0185\u0186\7\60\2\2\u0186"+
		"\u0187\5D#\2\u0187\u0188\b\"\1\2\u0188\u018b\3\2\2\2\u0189\u018b\5D#\2"+
		"\u018a\u017a\3\2\2\2\u018a\u017f\3\2\2\2\u018a\u0184\3\2\2\2\u018a\u0189"+
		"\3\2\2\2\u018bC\3\2\2\2\u018c\u0193\5F$\2\u018d\u018e\7\t\2\2\u018e\u018f"+
		"\5F$\2\u018f\u0190\b#\1\2\u0190\u0192\3\2\2\2\u0191\u018d\3\2\2\2\u0192"+
		"\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0198\3\2"+
		"\2\2\u0195\u0193\3\2\2\2\u0196\u0198\5F$\2\u0197\u018c\3\2\2\2\u0197\u0196"+
		"\3\2\2\2\u0198E\3\2\2\2\u0199\u01a0\5H%\2\u019a\u019b\7\13\2\2\u019b\u019c"+
		"\5H%\2\u019c\u019d\b$\1\2\u019d\u019f\3\2\2\2\u019e\u019a\3\2\2\2\u019f"+
		"\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a5\3\2"+
		"\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a5\5H%\2\u01a4\u0199\3\2\2\2\u01a4\u01a3"+
		"\3\2\2\2\u01a5G\3\2\2\2\u01a6\u01a7\7\t\2\2\u01a7\u01a8\5H%\2\u01a8\u01a9"+
		"\b%\1\2\u01a9\u01ac\3\2\2\2\u01aa\u01ac\5J&\2\u01ab\u01a6\3\2\2\2\u01ab"+
		"\u01aa\3\2\2\2\u01acI\3\2\2\2\u01ad\u01c3\5V,\2\u01ae\u01c3\5$\23\2\u01af"+
		"\u01c3\7\22\2\2\u01b0\u01c3\7\27\2\2\u01b1\u01c3\7\16\2\2\u01b2\u01c3"+
		"\7\65\2\2\u01b3\u01c3\7\63\2\2\u01b4\u01b5\7*\2\2\u01b5\u01b6\5&\24\2"+
		"\u01b6\u01b7\7+\2\2\u01b7\u01c3\3\2\2\2\u01b8\u01b9\7,\2\2\u01b9\u01ba"+
		"\5:\36\2\u01ba\u01bb\7-\2\2\u01bb\u01c3\3\2\2\2\u01bc\u01bd\7\33\2\2\u01bd"+
		"\u01be\7\62\2\2\u01be\u01bf\7,\2\2\u01bf\u01c0\5&\24\2\u01c0\u01c1\7-"+
		"\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01ad\3\2\2\2\u01c2\u01ae\3\2\2\2\u01c2"+
		"\u01af\3\2\2\2\u01c2\u01b0\3\2\2\2\u01c2\u01b1\3\2\2\2\u01c2\u01b2\3\2"+
		"\2\2\u01c2\u01b3\3\2\2\2\u01c2\u01b4\3\2\2\2\u01c2\u01b8\3\2\2\2\u01c2"+
		"\u01bc\3\2\2\2\u01c3K\3\2\2\2\u01c4\u01d4\7\26\2\2\u01c5\u01d4\7\36\2"+
		"\2\u01c6\u01d4\7\32\2\2\u01c7\u01d4\7\62\2\2\u01c8\u01c9\7\34\2\2\u01c9"+
		"\u01cc\7\61\2\2\u01ca\u01cd\7\"\2\2\u01cb\u01cd\5P)\2\u01cc\u01ca\3\2"+
		"\2\2\u01cc\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\7/\2\2\u01cf"+
		"\u01d0\5\26\f\2\u01d0\u01d1\7\60\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d4\5"+
		"N(\2\u01d3\u01c4\3\2\2\2\u01d3\u01c5\3\2\2\2\u01d3\u01c6\3\2\2\2\u01d3"+
		"\u01c7\3\2\2\2\u01d3\u01c8\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4M\3\2\2\2"+
		"\u01d5\u01d6\7\17\2\2\u01d6\u01dc\7,\2\2\u01d7\u01d8\7\63\2\2\u01d8\u01d9"+
		"\7.\2\2\u01d9\u01dd\5L\'\2\u01da\u01dd\5P)\2\u01db\u01dd\5\24\13\2\u01dc"+
		"\u01d7\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01db\3\2\2\2\u01dd\u01de\3\2"+
		"\2\2\u01de\u01df\7-\2\2\u01dfO\3\2\2\2\u01e0\u01e1\5L\'\2\u01e1\u01e2"+
		"\7%\2\2\u01e2\u01e3\5P)\2\u01e3\u01e7\3\2\2\2\u01e4\u01e7\5L\'\2\u01e5"+
		"\u01e7\3\2\2\2\u01e6\u01e0\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e5\3\2"+
		"\2\2\u01e7Q\3\2\2\2\u01e8\u01e9\b*\1\2\u01e9\u01ea\5T+\2\u01ea\u01eb\7"+
		"#\2\2\u01ebS\3\2\2\2\u01ec\u01ed\7\62\2\2\u01ed\u01ee\7$\2\2\u01ee\u01ef"+
		"\5L\'\2\u01efU\3\2\2\2\u01f0\u01f1\7\24\2\2\u01f1\u01f3\7\'\2\2\u01f2"+
		"\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f5\5X"+
		"-\2\u01f5W\3\2\2\2\u01f6\u0201\7\62\2\2\u01f7\u01f8\7*\2\2\u01f8\u01f9"+
		"\5:\36\2\u01f9\u01fa\7+\2\2\u01fa\u0200\3\2\2\2\u01fb\u01fc\7,\2\2\u01fc"+
		"\u01fd\5&\24\2\u01fd\u01fe\7-\2\2\u01fe\u0200\3\2\2\2\u01ff\u01f7\3\2"+
		"\2\2\u01ff\u01fb\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff\3\2\2\2\u0201"+
		"\u0202\3\2\2\2\u0202\u0204\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u0205\7\'"+
		"\2\2\u0205\u0215\5X-\2\u0206\u0211\7\62\2\2\u0207\u0208\7*\2\2\u0208\u0209"+
		"\5:\36\2\u0209\u020a\7+\2\2\u020a\u0210\3\2\2\2\u020b\u020c\7,\2\2\u020c"+
		"\u020d\5&\24\2\u020d\u020e\7-\2\2\u020e\u0210\3\2\2\2\u020f\u0207\3\2"+
		"\2\2\u020f\u020b\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211"+
		"\u0212\3\2\2\2\u0212\u0215\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u01f6\3\2"+
		"\2\2\u0214\u0206\3\2\2\2\u0215Y\3\2\2\2\61jr}\u0096\u009a\u009f\u00b0"+
		"\u00b4\u00bd\u00c5\u00cb\u00d1\u00d8\u00df\u00ee\u00fb\u0107\u010e\u0113"+
		"\u0118\u011d\u012c\u0130\u013d\u014a\u014e\u0161\u0169\u0171\u0178\u018a"+
		"\u0193\u0197\u01a0\u01a4\u01ab\u01c2\u01cc\u01d3\u01dc\u01e6\u01f2\u01ff"+
		"\u0201\u020f\u0211\u0214";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}