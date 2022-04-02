package org.longqnh.grammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, AND=2, OR=3, NOT=4, TRUE=5, FALSE=6, IN=7, NOT_IN=8, IS=9, IS_NOT=10, 
		LIKE=11, NOT_LIKE=12, MATCH=13, NOT_MATCH=14, NULL=15, CUSTOM_NUM_LIST=16, 
		CUSTOM_STRING_LIST=17, GT=18, GE=19, LT=20, LE=21, EQ=22, NEQ=23, LPAREN=24, 
		RPAREN=25, INTEGER=26, DOUBLE=27, SQUOTE=28, DQUOTE=29, PHRASE=30, QUOTE=31, 
		IDENTIFIER=32, WS=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "AND", "OR", "NOT", "TRUE", "FALSE", "IN", "NOT_IN", "IS", "IS_NOT", 
			"LIKE", "NOT_LIKE", "MATCH", "NOT_MATCH", "NULL", "CUSTOM_NUM_LIST", 
			"CUSTOM_STRING_LIST", "GT", "GE", "LT", "LE", "EQ", "NEQ", "LPAREN", 
			"RPAREN", "INTEGER", "DOUBLE", "SQUOTE", "DQUOTE", "PHRASE", "QUOTE", 
			"IDENTIFIER", "WS", "VBAR", "AMPER", "ESC_CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'regex'", null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'>'", "'>='", "'<'", "'<='", 
			"'='", "'!='", "'('", "')'", null, null, "'''", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "AND", "OR", "NOT", "TRUE", "FALSE", "IN", "NOT_IN", "IS", 
			"IS_NOT", "LIKE", "NOT_LIKE", "MATCH", "NOT_MATCH", "NULL", "CUSTOM_NUM_LIST", 
			"CUSTOM_STRING_LIST", "GT", "GE", "LT", "LE", "EQ", "NEQ", "LPAREN", 
			"RPAREN", "INTEGER", "DOUBLE", "SQUOTE", "DQUOTE", "PHRASE", "QUOTE", 
			"IDENTIFIER", "WS"
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


	public ExpressionGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ExpressionGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u0122\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\5\3W\n\3\5\3Y\n\3\3\4\3\4\3\4\3\4\5\4_\n\4\5\4a\n\4\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\7\21\u009c\n\21\f\21\16\21\u009f\13\21\3"+
		"\21\7\21\u00a2\n\21\f\21\16\21\u00a5\13\21\6\21\u00a7\n\21\r\21\16\21"+
		"\u00a8\3\21\3\21\3\22\3\22\3\22\7\22\u00b0\n\22\f\22\16\22\u00b3\13\22"+
		"\3\22\7\22\u00b6\n\22\f\22\16\22\u00b9\13\22\6\22\u00bb\n\22\r\22\16\22"+
		"\u00bc\3\22\3\22\5\22\u00c1\n\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\5\33\u00d7"+
		"\n\33\3\33\6\33\u00da\n\33\r\33\16\33\u00db\3\34\5\34\u00df\n\34\3\34"+
		"\6\34\u00e2\n\34\r\34\16\34\u00e3\3\34\3\34\6\34\u00e8\n\34\r\34\16\34"+
		"\u00e9\5\34\u00ec\n\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\6\37\u00f5\n"+
		"\37\r\37\16\37\u00f6\3\37\3\37\7\37\u00fb\n\37\f\37\16\37\u00fe\13\37"+
		"\3 \3 \3 \6 \u0103\n \r \16 \u0104\3 \3 \7 \u0109\n \f \16 \u010c\13 "+
		"\3!\3!\7!\u0110\n!\f!\16!\u0113\13!\3\"\6\"\u0116\n\"\r\"\16\"\u0117\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3%\2\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E\2G\2I\2\3\2\30\4\2CCcc\4\2"+
		"PPpp\4\2FFff\4\2QQqq\4\2TTtt\4\2VVvv\4\2WWww\4\2GGgg\4\2HHhh\4\2NNnn\4"+
		"\2UUuu\4\2KKkk\4\2MMmm\4\2OOoo\4\2EEee\4\2JJjj\3\2\62;\4\2))^^\4\2$$^"+
		"^\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\16\17\"\"\2\u0138\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3K\3\2\2\2\5X\3\2\2\2\7`\3\2\2\2\tb\3"+
		"\2\2\2\13f\3\2\2\2\rk\3\2\2\2\17q\3\2\2\2\21t\3\2\2\2\23x\3\2\2\2\25{"+
		"\3\2\2\2\27\177\3\2\2\2\31\u0084\3\2\2\2\33\u0088\3\2\2\2\35\u008e\3\2"+
		"\2\2\37\u0092\3\2\2\2!\u0097\3\2\2\2#\u00ac\3\2\2\2%\u00c2\3\2\2\2\'\u00c4"+
		"\3\2\2\2)\u00c7\3\2\2\2+\u00c9\3\2\2\2-\u00cc\3\2\2\2/\u00ce\3\2\2\2\61"+
		"\u00d1\3\2\2\2\63\u00d3\3\2\2\2\65\u00d6\3\2\2\2\67\u00de\3\2\2\29\u00ed"+
		"\3\2\2\2;\u00ef\3\2\2\2=\u00f1\3\2\2\2?\u00ff\3\2\2\2A\u010d\3\2\2\2C"+
		"\u0115\3\2\2\2E\u011b\3\2\2\2G\u011d\3\2\2\2I\u011f\3\2\2\2KL\7t\2\2L"+
		"M\7g\2\2MN\7i\2\2NO\7g\2\2OP\7z\2\2P\4\3\2\2\2QR\t\2\2\2RS\t\3\2\2SY\t"+
		"\4\2\2TV\5G$\2UW\5G$\2VU\3\2\2\2VW\3\2\2\2WY\3\2\2\2XQ\3\2\2\2XT\3\2\2"+
		"\2Y\6\3\2\2\2Z[\t\5\2\2[a\t\6\2\2\\^\5E#\2]_\5E#\2^]\3\2\2\2^_\3\2\2\2"+
		"_a\3\2\2\2`Z\3\2\2\2`\\\3\2\2\2a\b\3\2\2\2bc\t\3\2\2cd\t\5\2\2de\t\7\2"+
		"\2e\n\3\2\2\2fg\t\7\2\2gh\t\6\2\2hi\t\b\2\2ij\t\t\2\2j\f\3\2\2\2kl\t\n"+
		"\2\2lm\t\2\2\2mn\t\13\2\2no\t\f\2\2op\t\t\2\2p\16\3\2\2\2qr\t\r\2\2rs"+
		"\t\3\2\2s\20\3\2\2\2tu\5\t\5\2uv\5C\"\2vw\5\17\b\2w\22\3\2\2\2xy\t\r\2"+
		"\2yz\t\f\2\2z\24\3\2\2\2{|\5\23\n\2|}\5C\"\2}~\5\t\5\2~\26\3\2\2\2\177"+
		"\u0080\t\13\2\2\u0080\u0081\t\r\2\2\u0081\u0082\t\16\2\2\u0082\u0083\t"+
		"\t\2\2\u0083\30\3\2\2\2\u0084\u0085\5\t\5\2\u0085\u0086\5C\"\2\u0086\u0087"+
		"\5\27\f\2\u0087\32\3\2\2\2\u0088\u0089\t\17\2\2\u0089\u008a\t\2\2\2\u008a"+
		"\u008b\t\7\2\2\u008b\u008c\t\20\2\2\u008c\u008d\t\21\2\2\u008d\34\3\2"+
		"\2\2\u008e\u008f\5\t\5\2\u008f\u0090\5C\"\2\u0090\u0091\5\33\16\2\u0091"+
		"\36\3\2\2\2\u0092\u0093\t\3\2\2\u0093\u0094\t\b\2\2\u0094\u0095\t\13\2"+
		"\2\u0095\u0096\t\13\2\2\u0096 \3\2\2\2\u0097\u00a6\5\61\31\2\u0098\u00a7"+
		"\5\65\33\2\u0099\u009d\5\67\34\2\u009a\u009c\7.\2\2\u009b\u009a\3\2\2"+
		"\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a3"+
		"\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a2\5C\"\2\u00a1\u00a0\3\2\2\2\u00a2"+
		"\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a7\3\2"+
		"\2\2\u00a5\u00a3\3\2\2\2\u00a6\u0098\3\2\2\2\u00a6\u0099\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00ab\5\63\32\2\u00ab\"\3\2\2\2\u00ac\u00ba\5\61\31\2\u00ad"+
		"\u00b1\5=\37\2\u00ae\u00b0\7.\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b7\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b4\u00b6\5C\"\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2"+
		"\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00ba\u00ad\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\5\63\32\2\u00bf"+
		"\u00c1\7k\2\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1$\3\2\2\2\u00c2"+
		"\u00c3\7@\2\2\u00c3&\3\2\2\2\u00c4\u00c5\7@\2\2\u00c5\u00c6\7?\2\2\u00c6"+
		"(\3\2\2\2\u00c7\u00c8\7>\2\2\u00c8*\3\2\2\2\u00c9\u00ca\7>\2\2\u00ca\u00cb"+
		"\7?\2\2\u00cb,\3\2\2\2\u00cc\u00cd\7?\2\2\u00cd.\3\2\2\2\u00ce\u00cf\7"+
		"#\2\2\u00cf\u00d0\7?\2\2\u00d0\60\3\2\2\2\u00d1\u00d2\7*\2\2\u00d2\62"+
		"\3\2\2\2\u00d3\u00d4\7+\2\2\u00d4\64\3\2\2\2\u00d5\u00d7\7/\2\2\u00d6"+
		"\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00da\t\22"+
		"\2\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\66\3\2\2\2\u00dd\u00df\7/\2\2\u00de\u00dd\3\2\2\2"+
		"\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00e2\t\22\2\2\u00e1\u00e0"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00eb\3\2\2\2\u00e5\u00e7\7\60\2\2\u00e6\u00e8\t\22\2\2\u00e7\u00e6\3"+
		"\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00ec\3\2\2\2\u00eb\u00e5\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec8\3\2\2\2"+
		"\u00ed\u00ee\7)\2\2\u00ee:\3\2\2\2\u00ef\u00f0\7$\2\2\u00f0<\3\2\2\2\u00f1"+
		"\u00f4\59\35\2\u00f2\u00f5\5I%\2\u00f3\u00f5\n\23\2\2\u00f4\u00f2\3\2"+
		"\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fc\59\35\2\u00f9\u00fb\7k"+
		"\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd>\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0102\5;\36\2"+
		"\u0100\u0103\5I%\2\u0101\u0103\n\24\2\2\u0102\u0100\3\2\2\2\u0102\u0101"+
		"\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u010a\5;\36\2\u0107\u0109\7k\2\2\u0108\u0107\3\2"+
		"\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"@\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u0111\t\25\2\2\u010e\u0110\t\26\2"+
		"\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112"+
		"\3\2\2\2\u0112B\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0116\t\27\2\2\u0115"+
		"\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2"+
		"\2\2\u0118\u0119\3\2\2\2\u0119\u011a\b\"\2\2\u011aD\3\2\2\2\u011b\u011c"+
		"\7~\2\2\u011cF\3\2\2\2\u011d\u011e\7(\2\2\u011eH\3\2\2\2\u011f\u0120\7"+
		"^\2\2\u0120\u0121\13\2\2\2\u0121J\3\2\2\2\35\2VX^`\u009d\u00a3\u00a6\u00a8"+
		"\u00b1\u00b7\u00bc\u00c0\u00d6\u00db\u00de\u00e3\u00e9\u00eb\u00f4\u00f6"+
		"\u00fc\u0102\u0104\u010a\u0111\u0117\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}