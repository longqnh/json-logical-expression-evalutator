package org.longqnh.grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionGrammarParser extends Parser {
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
	public static final int
		RULE_expression = 0, RULE_numComparator = 1, RULE_stringComparator = 2, 
		RULE_binary = 3, RULE_bool = 4, RULE_decimal = 5, RULE_field = 6, RULE_validList = 7, 
		RULE_nullPointer = 8, RULE_phrase = 9, RULE_quote = 10, RULE_regex = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"expression", "numComparator", "stringComparator", "binary", "bool", 
			"decimal", "field", "validList", "nullPointer", "phrase", "quote", "regex"
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

	@Override
	public String getGrammarFileName() { return "ExpressionGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpressionGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MatchExpressionContext extends ExpressionContext {
		public FieldContext left;
		public Token op;
		public RegexContext right;
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode MATCH() { return getToken(ExpressionGrammarParser.MATCH, 0); }
		public RegexContext regex() {
			return getRuleContext(RegexContext.class,0);
		}
		public MatchExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterMatchExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitMatchExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitMatchExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InExpressionContext extends ExpressionContext {
		public FieldContext left;
		public Token op;
		public ValidListContext right;
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode IN() { return getToken(ExpressionGrammarParser.IN, 0); }
		public ValidListContext validList() {
			return getRuleContext(ValidListContext.class,0);
		}
		public InExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterInExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitInExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitInExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumComparatorExpressionContext extends ExpressionContext {
		public FieldContext left;
		public NumComparatorContext op;
		public DecimalContext right;
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public NumComparatorContext numComparator() {
			return getRuleContext(NumComparatorContext.class,0);
		}
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public NumComparatorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterNumComparatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitNumComparatorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitNumComparatorExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotMatchExpressionContext extends ExpressionContext {
		public FieldContext left;
		public Token op;
		public RegexContext right;
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode NOT_MATCH() { return getToken(ExpressionGrammarParser.NOT_MATCH, 0); }
		public RegexContext regex() {
			return getRuleContext(RegexContext.class,0);
		}
		public NotMatchExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterNotMatchExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitNotMatchExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitNotMatchExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public BinaryContext op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BinaryContext binary() {
			return getRuleContext(BinaryContext.class,0);
		}
		public MultiExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterMultiExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitMultiExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitMultiExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringComparatorExpressionContext extends ExpressionContext {
		public FieldContext left;
		public StringComparatorContext op;
		public PhraseContext right;
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public StringComparatorContext stringComparator() {
			return getRuleContext(StringComparatorContext.class,0);
		}
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public StringComparatorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterStringComparatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitStringComparatorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitStringComparatorExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotInExpressionContext extends ExpressionContext {
		public FieldContext left;
		public Token op;
		public ValidListContext right;
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode NOT_IN() { return getToken(ExpressionGrammarParser.NOT_IN, 0); }
		public ValidListContext validList() {
			return getRuleContext(ValidListContext.class,0);
		}
		public NotInExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterNotInExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitNotInExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitNotInExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolComparatorExpressionContext extends ExpressionContext {
		public FieldContext left;
		public StringComparatorContext op;
		public BoolContext right;
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public StringComparatorContext stringComparator() {
			return getRuleContext(StringComparatorContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public BoolComparatorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterBoolComparatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitBoolComparatorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitBoolComparatorExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsNullExpressionContext extends ExpressionContext {
		public FieldContext left;
		public Token op;
		public NullPointerContext right;
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode IS() { return getToken(ExpressionGrammarParser.IS, 0); }
		public NullPointerContext nullPointer() {
			return getRuleContext(NullPointerContext.class,0);
		}
		public IsNullExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterIsNullExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitIsNullExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitIsNullExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldComparatorExpressionContext extends ExpressionContext {
		public FieldContext left;
		public NumComparatorContext op;
		public FieldContext right;
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public NumComparatorContext numComparator() {
			return getRuleContext(NumComparatorContext.class,0);
		}
		public FieldComparatorExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterFieldComparatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitFieldComparatorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitFieldComparatorExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(ExpressionGrammarParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ExpressionGrammarParser.RPAREN, 0); }
		public ParentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterParentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitParentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitParentExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsNotNullExpressionContext extends ExpressionContext {
		public FieldContext left;
		public Token op;
		public NullPointerContext right;
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode IS_NOT() { return getToken(ExpressionGrammarParser.IS_NOT, 0); }
		public NullPointerContext nullPointer() {
			return getRuleContext(NullPointerContext.class,0);
		}
		public IsNotNullExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterIsNotNullExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitIsNotNullExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitIsNotNullExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				_localctx = new ParentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(25);
				match(LPAREN);
				setState(26);
				expression(0);
				setState(27);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new FieldComparatorExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(29);
				((FieldComparatorExpressionContext)_localctx).left = field();
				setState(30);
				((FieldComparatorExpressionContext)_localctx).op = numComparator();
				setState(31);
				((FieldComparatorExpressionContext)_localctx).right = field();
				}
				break;
			case 3:
				{
				_localctx = new NumComparatorExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(33);
				((NumComparatorExpressionContext)_localctx).left = field();
				setState(34);
				((NumComparatorExpressionContext)_localctx).op = numComparator();
				setState(35);
				((NumComparatorExpressionContext)_localctx).right = decimal();
				}
				break;
			case 4:
				{
				_localctx = new BoolComparatorExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(37);
				((BoolComparatorExpressionContext)_localctx).left = field();
				setState(38);
				((BoolComparatorExpressionContext)_localctx).op = stringComparator();
				setState(39);
				((BoolComparatorExpressionContext)_localctx).right = bool();
				}
				break;
			case 5:
				{
				_localctx = new StringComparatorExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41);
				((StringComparatorExpressionContext)_localctx).left = field();
				setState(42);
				((StringComparatorExpressionContext)_localctx).op = stringComparator();
				setState(43);
				((StringComparatorExpressionContext)_localctx).right = phrase();
				}
				break;
			case 6:
				{
				_localctx = new IsNullExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(45);
				((IsNullExpressionContext)_localctx).left = field();
				setState(46);
				((IsNullExpressionContext)_localctx).op = match(IS);
				setState(47);
				((IsNullExpressionContext)_localctx).right = nullPointer();
				}
				break;
			case 7:
				{
				_localctx = new IsNotNullExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(49);
				((IsNotNullExpressionContext)_localctx).left = field();
				setState(50);
				((IsNotNullExpressionContext)_localctx).op = match(IS_NOT);
				setState(51);
				((IsNotNullExpressionContext)_localctx).right = nullPointer();
				}
				break;
			case 8:
				{
				_localctx = new MatchExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				((MatchExpressionContext)_localctx).left = field();
				setState(54);
				((MatchExpressionContext)_localctx).op = match(MATCH);
				setState(55);
				((MatchExpressionContext)_localctx).right = regex();
				}
				break;
			case 9:
				{
				_localctx = new NotMatchExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57);
				((NotMatchExpressionContext)_localctx).left = field();
				setState(58);
				((NotMatchExpressionContext)_localctx).op = match(NOT_MATCH);
				setState(59);
				((NotMatchExpressionContext)_localctx).right = regex();
				}
				break;
			case 10:
				{
				_localctx = new InExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				((InExpressionContext)_localctx).left = field();
				setState(62);
				((InExpressionContext)_localctx).op = match(IN);
				setState(63);
				((InExpressionContext)_localctx).right = validList();
				}
				break;
			case 11:
				{
				_localctx = new NotInExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65);
				((NotInExpressionContext)_localctx).left = field();
				setState(66);
				((NotInExpressionContext)_localctx).op = match(NOT_IN);
				setState(67);
				((NotInExpressionContext)_localctx).right = validList();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiExpressionContext(new ExpressionContext(_parentctx, _parentState));
					((MultiExpressionContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(71);
					if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
					setState(72);
					((MultiExpressionContext)_localctx).op = binary();
					setState(73);
					((MultiExpressionContext)_localctx).right = expression(12);
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NumComparatorContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(ExpressionGrammarParser.GT, 0); }
		public TerminalNode GE() { return getToken(ExpressionGrammarParser.GE, 0); }
		public TerminalNode LT() { return getToken(ExpressionGrammarParser.LT, 0); }
		public TerminalNode LE() { return getToken(ExpressionGrammarParser.LE, 0); }
		public TerminalNode EQ() { return getToken(ExpressionGrammarParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(ExpressionGrammarParser.NEQ, 0); }
		public NumComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numComparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterNumComparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitNumComparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitNumComparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumComparatorContext numComparator() throws RecognitionException {
		NumComparatorContext _localctx = new NumComparatorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_numComparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GE) | (1L << LT) | (1L << LE) | (1L << EQ) | (1L << NEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class StringComparatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(ExpressionGrammarParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(ExpressionGrammarParser.NEQ, 0); }
		public StringComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringComparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterStringComparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitStringComparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitStringComparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringComparatorContext stringComparator() throws RecognitionException {
		StringComparatorContext _localctx = new StringComparatorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stringComparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !(_la==EQ || _la==NEQ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class BinaryContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(ExpressionGrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(ExpressionGrammarParser.OR, 0); }
		public BinaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryContext binary() throws RecognitionException {
		BinaryContext _localctx = new BinaryContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_binary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(ExpressionGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ExpressionGrammarParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class DecimalContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(ExpressionGrammarParser.INTEGER, 0); }
		public TerminalNode DOUBLE() { return getToken(ExpressionGrammarParser.DOUBLE, 0); }
		public DecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitDecimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitDecimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalContext decimal() throws RecognitionException {
		DecimalContext _localctx = new DecimalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_decimal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==DOUBLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class FieldContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ExpressionGrammarParser.IDENTIFIER, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(IDENTIFIER);
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

	public static class ValidListContext extends ParserRuleContext {
		public QuoteContext quote() {
			return getRuleContext(QuoteContext.class,0);
		}
		public TerminalNode CUSTOM_STRING_LIST() { return getToken(ExpressionGrammarParser.CUSTOM_STRING_LIST, 0); }
		public TerminalNode CUSTOM_NUM_LIST() { return getToken(ExpressionGrammarParser.CUSTOM_NUM_LIST, 0); }
		public ValidListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_validList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterValidList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitValidList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitValidList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValidListContext validList() throws RecognitionException {
		ValidListContext _localctx = new ValidListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_validList);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				quote();
				}
				break;
			case CUSTOM_STRING_LIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(CUSTOM_STRING_LIST);
				}
				break;
			case CUSTOM_NUM_LIST:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				match(CUSTOM_NUM_LIST);
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

	public static class NullPointerContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(ExpressionGrammarParser.NULL, 0); }
		public NullPointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullPointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterNullPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitNullPointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitNullPointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullPointerContext nullPointer() throws RecognitionException {
		NullPointerContext _localctx = new NullPointerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nullPointer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(NULL);
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

	public static class PhraseContext extends ParserRuleContext {
		public TerminalNode PHRASE() { return getToken(ExpressionGrammarParser.PHRASE, 0); }
		public PhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitPhrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitPhrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PhraseContext phrase() throws RecognitionException {
		PhraseContext _localctx = new PhraseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_phrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(PHRASE);
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

	public static class QuoteContext extends ParserRuleContext {
		public TerminalNode QUOTE() { return getToken(ExpressionGrammarParser.QUOTE, 0); }
		public QuoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterQuote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitQuote(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitQuote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuoteContext quote() throws RecognitionException {
		QuoteContext _localctx = new QuoteContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_quote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(QUOTE);
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

	public static class RegexContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ExpressionGrammarParser.LPAREN, 0); }
		public QuoteContext quote() {
			return getRuleContext(QuoteContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ExpressionGrammarParser.RPAREN, 0); }
		public RegexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterRegex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitRegex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitRegex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegexContext regex() throws RecognitionException {
		RegexContext _localctx = new RegexContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_regex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__0);
			setState(104);
			match(LPAREN);
			setState(105);
			quote();
			setState(106);
			match(RPAREN);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#o\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2H\n\2\3\2\3\2"+
		"\3\2\3\2\7\2N\n\2\f\2\16\2Q\13\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\t\5\tb\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\2\3\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\7\3\2\24\31\3\2"+
		"\30\31\3\2\4\5\3\2\7\b\3\2\34\35\2o\2G\3\2\2\2\4R\3\2\2\2\6T\3\2\2\2\b"+
		"V\3\2\2\2\nX\3\2\2\2\fZ\3\2\2\2\16\\\3\2\2\2\20a\3\2\2\2\22c\3\2\2\2\24"+
		"e\3\2\2\2\26g\3\2\2\2\30i\3\2\2\2\32\33\b\2\1\2\33\34\7\32\2\2\34\35\5"+
		"\2\2\2\35\36\7\33\2\2\36H\3\2\2\2\37 \5\16\b\2 !\5\4\3\2!\"\5\16\b\2\""+
		"H\3\2\2\2#$\5\16\b\2$%\5\4\3\2%&\5\f\7\2&H\3\2\2\2\'(\5\16\b\2()\5\6\4"+
		"\2)*\5\n\6\2*H\3\2\2\2+,\5\16\b\2,-\5\6\4\2-.\5\24\13\2.H\3\2\2\2/\60"+
		"\5\16\b\2\60\61\7\13\2\2\61\62\5\22\n\2\62H\3\2\2\2\63\64\5\16\b\2\64"+
		"\65\7\f\2\2\65\66\5\22\n\2\66H\3\2\2\2\678\5\16\b\289\7\17\2\29:\5\30"+
		"\r\2:H\3\2\2\2;<\5\16\b\2<=\7\20\2\2=>\5\30\r\2>H\3\2\2\2?@\5\16\b\2@"+
		"A\7\t\2\2AB\5\20\t\2BH\3\2\2\2CD\5\16\b\2DE\7\n\2\2EF\5\20\t\2FH\3\2\2"+
		"\2G\32\3\2\2\2G\37\3\2\2\2G#\3\2\2\2G\'\3\2\2\2G+\3\2\2\2G/\3\2\2\2G\63"+
		"\3\2\2\2G\67\3\2\2\2G;\3\2\2\2G?\3\2\2\2GC\3\2\2\2HO\3\2\2\2IJ\f\r\2\2"+
		"JK\5\b\5\2KL\5\2\2\16LN\3\2\2\2MI\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2"+
		"\2P\3\3\2\2\2QO\3\2\2\2RS\t\2\2\2S\5\3\2\2\2TU\t\3\2\2U\7\3\2\2\2VW\t"+
		"\4\2\2W\t\3\2\2\2XY\t\5\2\2Y\13\3\2\2\2Z[\t\6\2\2[\r\3\2\2\2\\]\7\"\2"+
		"\2]\17\3\2\2\2^b\5\26\f\2_b\7\23\2\2`b\7\22\2\2a^\3\2\2\2a_\3\2\2\2a`"+
		"\3\2\2\2b\21\3\2\2\2cd\7\21\2\2d\23\3\2\2\2ef\7 \2\2f\25\3\2\2\2gh\7!"+
		"\2\2h\27\3\2\2\2ij\7\3\2\2jk\7\32\2\2kl\5\26\f\2lm\7\33\2\2m\31\3\2\2"+
		"\2\5GOa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}