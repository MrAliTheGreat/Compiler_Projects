// Generated from C:/Users/rasou/Desktop/Compiler/Project/Phase 1/src/main/grammar\Sophia.g4 by ANTLR 4.8
package main.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SophiaLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MAIN", "MINMIN", "PLUSPLUS", "OROP", "ANDOP", "UNARYLOGIC", "SUMOP", 
			"COMPOP", "MULTOP", "CLS", "IF", "FALSE", "LIST", "EXT", "ELSE", "TRUE", 
			"IN", "THIS", "FOR", "INT", "NULL", "DEF", "FORE", "BOOL", "NEW", "FUNC", 
			"CONT", "STR", "PRI", "RET", "BRK", "VOID", "ENDOFLINE", "DEFINIT", "COMM", 
			"ASSIGN", "DOT", "LBRC", "RBRC", "LBRA", "RBRA", "LPAR", "RPAR", "COUPLE", 
			"FUNCSIG", "LST", "GT", "ID", "NUM", "POSNUM", "STRING", "DIGIT", "NOZERODIGIT", 
			"COMMENT", "UPLETTER", "LOWLETTER", "UNDERSCORE", "ZERO", "NXTLINE", 
			"WS"
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


	public SophiaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sophia.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2>\u017c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u0095\n\t\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3!\3!\3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3"+
		")\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\6\61"+
		"\u0138\n\61\r\61\16\61\u0139\3\61\3\61\3\61\3\61\7\61\u0140\n\61\f\61"+
		"\16\61\u0143\13\61\3\62\3\62\5\62\u0147\n\62\3\63\3\63\7\63\u014b\n\63"+
		"\f\63\16\63\u014e\13\63\3\64\3\64\6\64\u0152\n\64\r\64\16\64\u0153\3\64"+
		"\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\3\67\7\67\u0160\n\67\f\67\16"+
		"\67\u0163\13\67\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\6<\u0170\n<\r<\16"+
		"<\u0171\3<\3<\3=\6=\u0177\n=\r=\16=\u0178\3=\3=\2\2>\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>\3\2\7\4"+
		"\2--//\5\2\'\',,\61\61\3\2$$\4\2\f\f\17\17\4\2\13\13\"\"\2\u0189\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o"+
		"\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\3{\3\2"+
		"\2\2\5\u0080\3\2\2\2\7\u0083\3\2\2\2\t\u0086\3\2\2\2\13\u0089\3\2\2\2"+
		"\r\u008c\3\2\2\2\17\u008e\3\2\2\2\21\u0094\3\2\2\2\23\u0096\3\2\2\2\25"+
		"\u0098\3\2\2\2\27\u009e\3\2\2\2\31\u00a1\3\2\2\2\33\u00a7\3\2\2\2\35\u00ac"+
		"\3\2\2\2\37\u00b4\3\2\2\2!\u00b9\3\2\2\2#\u00be\3\2\2\2%\u00c1\3\2\2\2"+
		"\'\u00c6\3\2\2\2)\u00ca\3\2\2\2+\u00ce\3\2\2\2-\u00d3\3\2\2\2/\u00d7\3"+
		"\2\2\2\61\u00df\3\2\2\2\63\u00e4\3\2\2\2\65\u00e8\3\2\2\2\67\u00ed\3\2"+
		"\2\29\u00f6\3\2\2\2;\u00fd\3\2\2\2=\u0103\3\2\2\2?\u010a\3\2\2\2A\u0110"+
		"\3\2\2\2C\u0115\3\2\2\2E\u0117\3\2\2\2G\u0119\3\2\2\2I\u011b\3\2\2\2K"+
		"\u011d\3\2\2\2M\u011f\3\2\2\2O\u0121\3\2\2\2Q\u0123\3\2\2\2S\u0125\3\2"+
		"\2\2U\u0127\3\2\2\2W\u0129\3\2\2\2Y\u012b\3\2\2\2[\u012d\3\2\2\2]\u0130"+
		"\3\2\2\2_\u0132\3\2\2\2a\u0137\3\2\2\2c\u0146\3\2\2\2e\u0148\3\2\2\2g"+
		"\u014f\3\2\2\2i\u0157\3\2\2\2k\u0159\3\2\2\2m\u015b\3\2\2\2o\u0166\3\2"+
		"\2\2q\u0168\3\2\2\2s\u016a\3\2\2\2u\u016c\3\2\2\2w\u016f\3\2\2\2y\u0176"+
		"\3\2\2\2{|\7O\2\2|}\7c\2\2}~\7k\2\2~\177\7p\2\2\177\4\3\2\2\2\u0080\u0081"+
		"\7/\2\2\u0081\u0082\7/\2\2\u0082\6\3\2\2\2\u0083\u0084\7-\2\2\u0084\u0085"+
		"\7-\2\2\u0085\b\3\2\2\2\u0086\u0087\7~\2\2\u0087\u0088\7~\2\2\u0088\n"+
		"\3\2\2\2\u0089\u008a\7(\2\2\u008a\u008b\7(\2\2\u008b\f\3\2\2\2\u008c\u008d"+
		"\7#\2\2\u008d\16\3\2\2\2\u008e\u008f\t\2\2\2\u008f\20\3\2\2\2\u0090\u0091"+
		"\7?\2\2\u0091\u0095\7?\2\2\u0092\u0093\7#\2\2\u0093\u0095\7?\2\2\u0094"+
		"\u0090\3\2\2\2\u0094\u0092\3\2\2\2\u0095\22\3\2\2\2\u0096\u0097\t\3\2"+
		"\2\u0097\24\3\2\2\2\u0098\u0099\7e\2\2\u0099\u009a\7n\2\2\u009a\u009b"+
		"\7c\2\2\u009b\u009c\7u\2\2\u009c\u009d\7u\2\2\u009d\26\3\2\2\2\u009e\u009f"+
		"\7k\2\2\u009f\u00a0\7h\2\2\u00a0\30\3\2\2\2\u00a1\u00a2\7h\2\2\u00a2\u00a3"+
		"\7c\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a6\7g\2\2\u00a6"+
		"\32\3\2\2\2\u00a7\u00a8\7n\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7u\2\2\u00aa"+
		"\u00ab\7v\2\2\u00ab\34\3\2\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7z\2\2\u00ae"+
		"\u00af\7v\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7p\2\2\u00b1\u00b2\7f\2\2"+
		"\u00b2\u00b3\7u\2\2\u00b3\36\3\2\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7"+
		"n\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8\7g\2\2\u00b8 \3\2\2\2\u00b9\u00ba"+
		"\7v\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7w\2\2\u00bc\u00bd\7g\2\2\u00bd"+
		"\"\3\2\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7p\2\2\u00c0$\3\2\2\2\u00c1"+
		"\u00c2\7v\2\2\u00c2\u00c3\7j\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7u\2\2"+
		"\u00c5&\3\2\2\2\u00c6\u00c7\7h\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7t\2"+
		"\2\u00c9(\3\2\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7"+
		"v\2\2\u00cd*\3\2\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7w\2\2\u00d0\u00d1"+
		"\7n\2\2\u00d1\u00d2\7n\2\2\u00d2,\3\2\2\2\u00d3\u00d4\7f\2\2\u00d4\u00d5"+
		"\7g\2\2\u00d5\u00d6\7h\2\2\u00d6.\3\2\2\2\u00d7\u00d8\7h\2\2\u00d8\u00d9"+
		"\7q\2\2\u00d9\u00da\7t\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7c\2\2\u00dc"+
		"\u00dd\7e\2\2\u00dd\u00de\7j\2\2\u00de\60\3\2\2\2\u00df\u00e0\7d\2\2\u00e0"+
		"\u00e1\7q\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3\7n\2\2\u00e3\62\3\2\2\2\u00e4"+
		"\u00e5\7p\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7y\2\2\u00e7\64\3\2\2\2\u00e8"+
		"\u00e9\7h\2\2\u00e9\u00ea\7w\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec\7e\2\2"+
		"\u00ec\66\3\2\2\2\u00ed\u00ee\7e\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7"+
		"p\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7p\2\2\u00f3\u00f4"+
		"\7w\2\2\u00f4\u00f5\7g\2\2\u00f58\3\2\2\2\u00f6\u00f7\7u\2\2\u00f7\u00f8"+
		"\7v\2\2\u00f8\u00f9\7t\2\2\u00f9\u00fa\7k\2\2\u00fa\u00fb\7p\2\2\u00fb"+
		"\u00fc\7i\2\2\u00fc:\3\2\2\2\u00fd\u00fe\7r\2\2\u00fe\u00ff\7t\2\2\u00ff"+
		"\u0100\7k\2\2\u0100\u0101\7p\2\2\u0101\u0102\7v\2\2\u0102<\3\2\2\2\u0103"+
		"\u0104\7t\2\2\u0104\u0105\7g\2\2\u0105\u0106\7v\2\2\u0106\u0107\7w\2\2"+
		"\u0107\u0108\7t\2\2\u0108\u0109\7p\2\2\u0109>\3\2\2\2\u010a\u010b\7d\2"+
		"\2\u010b\u010c\7t\2\2\u010c\u010d\7g\2\2\u010d\u010e\7c\2\2\u010e\u010f"+
		"\7m\2\2\u010f@\3\2\2\2\u0110\u0111\7x\2\2\u0111\u0112\7q\2\2\u0112\u0113"+
		"\7k\2\2\u0113\u0114\7f\2\2\u0114B\3\2\2\2\u0115\u0116\7=\2\2\u0116D\3"+
		"\2\2\2\u0117\u0118\7<\2\2\u0118F\3\2\2\2\u0119\u011a\7.\2\2\u011aH\3\2"+
		"\2\2\u011b\u011c\7?\2\2\u011cJ\3\2\2\2\u011d\u011e\7\60\2\2\u011eL\3\2"+
		"\2\2\u011f\u0120\7}\2\2\u0120N\3\2\2\2\u0121\u0122\7\177\2\2\u0122P\3"+
		"\2\2\2\u0123\u0124\7]\2\2\u0124R\3\2\2\2\u0125\u0126\7_\2\2\u0126T\3\2"+
		"\2\2\u0127\u0128\7*\2\2\u0128V\3\2\2\2\u0129\u012a\7+\2\2\u012aX\3\2\2"+
		"\2\u012b\u012c\7%\2\2\u012cZ\3\2\2\2\u012d\u012e\7/\2\2\u012e\u012f\7"+
		"@\2\2\u012f\\\3\2\2\2\u0130\u0131\7@\2\2\u0131^\3\2\2\2\u0132\u0133\7"+
		">\2\2\u0133`\3\2\2\2\u0134\u0138\5o8\2\u0135\u0138\5q9\2\u0136\u0138\5"+
		"s:\2\u0137\u0134\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0141\3\2"+
		"\2\2\u013b\u0140\5o8\2\u013c\u0140\5q9\2\u013d\u0140\5s:\2\u013e\u0140"+
		"\5i\65\2\u013f\u013b\3\2\2\2\u013f\u013c\3\2\2\2\u013f\u013d\3\2\2\2\u013f"+
		"\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2"+
		"\2\2\u0142b\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0147\5e\63\2\u0145\u0147"+
		"\5u;\2\u0146\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147d\3\2\2\2\u0148\u014c"+
		"\5k\66\2\u0149\u014b\5i\65\2\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014df\3\2\2\2\u014e\u014c\3\2\2\2"+
		"\u014f\u0151\7$\2\2\u0150\u0152\n\4\2\2\u0151\u0150\3\2\2\2\u0152\u0153"+
		"\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\u0156\7$\2\2\u0156h\3\2\2\2\u0157\u0158\4\62;\2\u0158j\3\2\2\2\u0159"+
		"\u015a\4\63;\2\u015al\3\2\2\2\u015b\u015c\7\61\2\2\u015c\u015d\7\61\2"+
		"\2\u015d\u0161\3\2\2\2\u015e\u0160\n\5\2\2\u015f\u015e\3\2\2\2\u0160\u0163"+
		"\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0164\u0165\b\67\2\2\u0165n\3\2\2\2\u0166\u0167\4c|\2\u0167"+
		"p\3\2\2\2\u0168\u0169\4C\\\2\u0169r\3\2\2\2\u016a\u016b\7a\2\2\u016bt"+
		"\3\2\2\2\u016c\u016d\7\62\2\2\u016dv\3\2\2\2\u016e\u0170\t\5\2\2\u016f"+
		"\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2"+
		"\2\2\u0172\u0173\3\2\2\2\u0173\u0174\b<\2\2\u0174x\3\2\2\2\u0175\u0177"+
		"\t\6\2\2\u0176\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0176\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\b=\2\2\u017bz\3\2\2\2\16"+
		"\2\u0094\u0137\u0139\u013f\u0141\u0146\u014c\u0153\u0161\u0171\u0178\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}