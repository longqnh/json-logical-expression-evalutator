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
		RPAREN=25, LSPAREN=26, RSPAREN=27, INTEGER=28, DOUBLE=29, SQUOTE=30, DQUOTE=31, 
		PHRASE=32, QUOTE=33, IDENTIFIER=34, WS=35;
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
			"RPAREN", "LSPAREN", "RSPAREN", "INTEGER", "DOUBLE", "SQUOTE", "DQUOTE", 
			"PHRASE", "QUOTE", "IDENTIFIER", "WS", "VBAR", "AMPER", "ESC_CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'regex'", null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'>'", "'>='", "'<'", "'<='", 
			"'='", "'!='", "'('", "')'", "'['", "']'", null, null, "'''", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "AND", "OR", "NOT", "TRUE", "FALSE", "IN", "NOT_IN", "IS", 
			"IS_NOT", "LIKE", "NOT_LIKE", "MATCH", "NOT_MATCH", "NULL", "CUSTOM_NUM_LIST", 
			"CUSTOM_STRING_LIST", "GT", "GE", "LT", "LE", "EQ", "NEQ", "LPAREN", 
			"RPAREN", "LSPAREN", "RSPAREN", "INTEGER", "DOUBLE", "SQUOTE", "DQUOTE", 
			"PHRASE", "QUOTE", "IDENTIFIER", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u011e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\5\3[\n\3\5\3]\n\3\3\4\3\4\3\4\3\4\5\4c\n\4\5\4e\n\4"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u00a0\n\21\f\21\16\21\u00a3"+
		"\13\21\3\21\7\21\u00a6\n\21\f\21\16\21\u00a9\13\21\6\21\u00ab\n\21\r\21"+
		"\16\21\u00ac\3\21\3\21\3\22\3\22\3\22\7\22\u00b4\n\22\f\22\16\22\u00b7"+
		"\13\22\3\22\7\22\u00ba\n\22\f\22\16\22\u00bd\13\22\6\22\u00bf\n\22\r\22"+
		"\16\22\u00c0\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\35\5\35\u00dd\n\35\3\35\6\35\u00e0\n\35\r\35\16\35\u00e1\3\36\5\36\u00e5"+
		"\n\36\3\36\6\36\u00e8\n\36\r\36\16\36\u00e9\3\36\3\36\6\36\u00ee\n\36"+
		"\r\36\16\36\u00ef\5\36\u00f2\n\36\3\37\3\37\3 \3 \3!\3!\3!\6!\u00fb\n"+
		"!\r!\16!\u00fc\3!\3!\3\"\3\"\3\"\6\"\u0104\n\"\r\"\16\"\u0105\3\"\3\""+
		"\3#\3#\7#\u010c\n#\f#\16#\u010f\13#\3$\6$\u0112\n$\r$\16$\u0113\3$\3$"+
		"\3%\3%\3&\3&\3\'\3\'\3\'\2\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I\2K\2M\2\3\2\30\4\2CCcc\4\2"+
		"PPpp\4\2FFff\4\2QQqq\4\2TTtt\4\2VVvv\4\2WWww\4\2GGgg\4\2HHhh\4\2NNnn\4"+
		"\2UUuu\4\2KKkk\4\2MMmm\4\2OOoo\4\2EEee\4\2JJjj\3\2\62;\4\2))^^\4\2$$^"+
		"^\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\16\17\"\"\2\u0131\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3O\3\2\2\2\5\\\3"+
		"\2\2\2\7d\3\2\2\2\tf\3\2\2\2\13j\3\2\2\2\ro\3\2\2\2\17u\3\2\2\2\21x\3"+
		"\2\2\2\23|\3\2\2\2\25\177\3\2\2\2\27\u0083\3\2\2\2\31\u0088\3\2\2\2\33"+
		"\u008c\3\2\2\2\35\u0092\3\2\2\2\37\u0096\3\2\2\2!\u009b\3\2\2\2#\u00b0"+
		"\3\2\2\2%\u00c4\3\2\2\2\'\u00c6\3\2\2\2)\u00c9\3\2\2\2+\u00cb\3\2\2\2"+
		"-\u00ce\3\2\2\2/\u00d0\3\2\2\2\61\u00d3\3\2\2\2\63\u00d5\3\2\2\2\65\u00d7"+
		"\3\2\2\2\67\u00d9\3\2\2\29\u00dc\3\2\2\2;\u00e4\3\2\2\2=\u00f3\3\2\2\2"+
		"?\u00f5\3\2\2\2A\u00f7\3\2\2\2C\u0100\3\2\2\2E\u0109\3\2\2\2G\u0111\3"+
		"\2\2\2I\u0117\3\2\2\2K\u0119\3\2\2\2M\u011b\3\2\2\2OP\7t\2\2PQ\7g\2\2"+
		"QR\7i\2\2RS\7g\2\2ST\7z\2\2T\4\3\2\2\2UV\t\2\2\2VW\t\3\2\2W]\t\4\2\2X"+
		"Z\5K&\2Y[\5K&\2ZY\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\U\3\2\2\2\\X\3\2\2\2]\6"+
		"\3\2\2\2^_\t\5\2\2_e\t\6\2\2`b\5I%\2ac\5I%\2ba\3\2\2\2bc\3\2\2\2ce\3\2"+
		"\2\2d^\3\2\2\2d`\3\2\2\2e\b\3\2\2\2fg\t\3\2\2gh\t\5\2\2hi\t\7\2\2i\n\3"+
		"\2\2\2jk\t\7\2\2kl\t\6\2\2lm\t\b\2\2mn\t\t\2\2n\f\3\2\2\2op\t\n\2\2pq"+
		"\t\2\2\2qr\t\13\2\2rs\t\f\2\2st\t\t\2\2t\16\3\2\2\2uv\t\r\2\2vw\t\3\2"+
		"\2w\20\3\2\2\2xy\5\t\5\2yz\5G$\2z{\5\17\b\2{\22\3\2\2\2|}\t\r\2\2}~\t"+
		"\f\2\2~\24\3\2\2\2\177\u0080\5\23\n\2\u0080\u0081\5G$\2\u0081\u0082\5"+
		"\t\5\2\u0082\26\3\2\2\2\u0083\u0084\t\13\2\2\u0084\u0085\t\r\2\2\u0085"+
		"\u0086\t\16\2\2\u0086\u0087\t\t\2\2\u0087\30\3\2\2\2\u0088\u0089\5\t\5"+
		"\2\u0089\u008a\5G$\2\u008a\u008b\5\27\f\2\u008b\32\3\2\2\2\u008c\u008d"+
		"\t\17\2\2\u008d\u008e\t\2\2\2\u008e\u008f\t\7\2\2\u008f\u0090\t\20\2\2"+
		"\u0090\u0091\t\21\2\2\u0091\34\3\2\2\2\u0092\u0093\5\t\5\2\u0093\u0094"+
		"\5G$\2\u0094\u0095\5\33\16\2\u0095\36\3\2\2\2\u0096\u0097\t\3\2\2\u0097"+
		"\u0098\t\b\2\2\u0098\u0099\t\13\2\2\u0099\u009a\t\13\2\2\u009a \3\2\2"+
		"\2\u009b\u00aa\5\65\33\2\u009c\u00ab\59\35\2\u009d\u00a1\5;\36\2\u009e"+
		"\u00a0\7.\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a7\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00a6\5G$\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2"+
		"\2\u00a7\u00a8\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u009c"+
		"\3\2\2\2\u00aa\u009d\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\5\67\34\2\u00af\"\3\2\2"+
		"\2\u00b0\u00be\5\65\33\2\u00b1\u00b5\5C\"\2\u00b2\u00b4\7.\2\2\u00b3\u00b2"+
		"\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00bb\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00ba\5G$\2\u00b9\u00b8\3\2\2"+
		"\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bf"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00b1\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\5\67"+
		"\34\2\u00c3$\3\2\2\2\u00c4\u00c5\7@\2\2\u00c5&\3\2\2\2\u00c6\u00c7\7@"+
		"\2\2\u00c7\u00c8\7?\2\2\u00c8(\3\2\2\2\u00c9\u00ca\7>\2\2\u00ca*\3\2\2"+
		"\2\u00cb\u00cc\7>\2\2\u00cc\u00cd\7?\2\2\u00cd,\3\2\2\2\u00ce\u00cf\7"+
		"?\2\2\u00cf.\3\2\2\2\u00d0\u00d1\7#\2\2\u00d1\u00d2\7?\2\2\u00d2\60\3"+
		"\2\2\2\u00d3\u00d4\7*\2\2\u00d4\62\3\2\2\2\u00d5\u00d6\7+\2\2\u00d6\64"+
		"\3\2\2\2\u00d7\u00d8\7]\2\2\u00d8\66\3\2\2\2\u00d9\u00da\7_\2\2\u00da"+
		"8\3\2\2\2\u00db\u00dd\7/\2\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00df\3\2\2\2\u00de\u00e0\t\22\2\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3"+
		"\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2:\3\2\2\2\u00e3\u00e5"+
		"\7/\2\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6"+
		"\u00e8\t\22\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3"+
		"\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00f1\3\2\2\2\u00eb\u00ed\7\60\2\2\u00ec"+
		"\u00ee\t\22\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3"+
		"\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00eb\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2<\3\2\2\2\u00f3\u00f4\7)\2\2\u00f4>\3\2\2\2\u00f5"+
		"\u00f6\7$\2\2\u00f6@\3\2\2\2\u00f7\u00fa\5=\37\2\u00f8\u00fb\5M\'\2\u00f9"+
		"\u00fb\n\23\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fc\3"+
		"\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u00ff\5=\37\2\u00ffB\3\2\2\2\u0100\u0103\5? \2\u0101\u0104\5M\'\2\u0102"+
		"\u0104\n\24\2\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104\u0105\3"+
		"\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0108\5? \2\u0108D\3\2\2\2\u0109\u010d\t\25\2\2\u010a\u010c\t\26\2\2"+
		"\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010eF\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0112\t\27\2\2\u0111"+
		"\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114\u0115\3\2\2\2\u0115\u0116\b$\2\2\u0116H\3\2\2\2\u0117\u0118"+
		"\7~\2\2\u0118J\3\2\2\2\u0119\u011a\7(\2\2\u011aL\3\2\2\2\u011b\u011c\7"+
		"^\2\2\u011c\u011d\13\2\2\2\u011dN\3\2\2\2\32\2Z\\bd\u00a1\u00a7\u00aa"+
		"\u00ac\u00b5\u00bb\u00c0\u00dc\u00e1\u00e4\u00e9\u00ef\u00f1\u00fa\u00fc"+
		"\u0103\u0105\u010d\u0113\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}