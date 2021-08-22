// Generated from C:/Users/rasou/Desktop/Compiler/Homeworks/HW2/4/src/main/grammar\answer.g4 by ANTLR 4.8
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
public class answer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IDENTIFIER=1, NUM=2, STR=3, COMMENT=4, MLCOMMENT=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IDENTIFIER", "NUM", "STR", "COMMENT", "MLCOMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IDENTIFIER", "NUM", "STR", "COMMENT", "MLCOMMENT"
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


	public answer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "answer.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			IDENTIFIER_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			NUM_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			STR_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			MLCOMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void IDENTIFIER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println("IDENTIFIER = " + getText() + " ");
			break;
		}
	}
	private void NUM_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			System.out.println("NUM = " + getText() + " ");
			break;
		}
	}
	private void STR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			System.out.println("STR = " + getText() + " ");
			break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			System.out.println("COMMENT = " + getText() + " ");
			break;
		}
	}
	private void MLCOMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			System.out.println("MLCOMMENT = " + getText() + " ");
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\7F\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\7\3\32\n\3\f\3\16\3\35\13\3\5\3\37\n\3\3\3\3\3\3\4\3"+
		"\4\6\4%\n\4\r\4\16\4&\3\4\3\4\3\4\3\5\3\5\3\5\3\5\6\5\60\n\5\r\5\16\5"+
		"\61\3\5\5\5\65\n\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6=\n\6\f\6\16\6@\13\6\3\6"+
		"\3\6\3\6\3\6\3\6\3>\2\7\3\3\5\4\7\5\t\6\13\7\3\2\n\5\2C\\aac|\6\2\62;"+
		"C\\aac|\3\2\62\62\3\2\63;\3\2\62;\3\2$$\3\2\f\f\3\3\f\f\2K\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\3\r\3\2\2\2\5\36\3\2"+
		"\2\2\7\"\3\2\2\2\t+\3\2\2\2\138\3\2\2\2\r\21\t\2\2\2\16\20\t\3\2\2\17"+
		"\16\3\2\2\2\20\23\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\24\3\2\2\2\23"+
		"\21\3\2\2\2\24\25\b\2\2\2\25\4\3\2\2\2\26\37\t\4\2\2\27\33\t\5\2\2\30"+
		"\32\t\6\2\2\31\30\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34"+
		"\37\3\2\2\2\35\33\3\2\2\2\36\26\3\2\2\2\36\27\3\2\2\2\37 \3\2\2\2 !\b"+
		"\3\3\2!\6\3\2\2\2\"$\7$\2\2#%\n\7\2\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'"+
		"\3\2\2\2\'(\3\2\2\2()\7$\2\2)*\b\4\4\2*\b\3\2\2\2+,\7\61\2\2,-\7\61\2"+
		"\2-/\3\2\2\2.\60\n\b\2\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2"+
		"\2\2\62\64\3\2\2\2\63\65\t\t\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\67\b\5"+
		"\5\2\67\n\3\2\2\289\7\61\2\29:\7,\2\2:>\3\2\2\2;=\13\2\2\2<;\3\2\2\2="+
		"@\3\2\2\2>?\3\2\2\2><\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\7,\2\2BC\7\61\2\2"+
		"CD\3\2\2\2DE\b\6\6\2E\f\3\2\2\2\n\2\21\33\36&\61\64>\7\3\2\2\3\3\3\3\4"+
		"\4\3\5\5\3\6\6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}