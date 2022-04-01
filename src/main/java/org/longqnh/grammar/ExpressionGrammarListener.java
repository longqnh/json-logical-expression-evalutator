// Generated from D:/workspace/json-logical-expression-evalutator/src/main/grammar\ExpressionGrammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionGrammarParser}.
 */
public interface ExpressionGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code matchExpression}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMatchExpression(ExpressionGrammarParser.MatchExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code matchExpression}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMatchExpression(ExpressionGrammarParser.MatchExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inExpression}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInExpression(ExpressionGrammarParser.InExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inExpression}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInExpression(ExpressionGrammarParser.InExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numComparatorExpression}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumComparatorExpression(ExpressionGrammarParser.NumComparatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numComparatorExpression}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumComparatorExpression(ExpressionGrammarParser.NumComparatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notMatchExpression}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotMatchExpression(ExpressionGrammarParser.NotMatchExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notMatchExpression}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotMatchExpression(ExpressionGrammarParser.NotMatchExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiExpression}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiExpression(ExpressionGrammarParser.MultiExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiExpression}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiExpression(ExpressionGrammarParser.MultiExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringComparatorExpression}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringComparatorExpression(ExpressionGrammarParser.StringComparatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringComparatorExpression}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringComparatorExpression(ExpressionGrammarParser.StringComparatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notInExpression}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotInExpression(ExpressionGrammarParser.NotInExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notInExpression}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotInExpression(ExpressionGrammarParser.NotInExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolComparatorExpression}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolComparatorExpression(ExpressionGrammarParser.BoolComparatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolComparatorExpression}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolComparatorExpression(ExpressionGrammarParser.BoolComparatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isNullExpression}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIsNullExpression(ExpressionGrammarParser.IsNullExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isNullExpression}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIsNullExpression(ExpressionGrammarParser.IsNullExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fieldComparatorExpression}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFieldComparatorExpression(ExpressionGrammarParser.FieldComparatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fieldComparatorExpression}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFieldComparatorExpression(ExpressionGrammarParser.FieldComparatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentExpression}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParentExpression(ExpressionGrammarParser.ParentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentExpression}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParentExpression(ExpressionGrammarParser.ParentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isNotNullExpression}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIsNotNullExpression(ExpressionGrammarParser.IsNotNullExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isNotNullExpression}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIsNotNullExpression(ExpressionGrammarParser.IsNotNullExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#numComparator}.
	 * @param ctx the parse tree
	 */
	void enterNumComparator(ExpressionGrammarParser.NumComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#numComparator}.
	 * @param ctx the parse tree
	 */
	void exitNumComparator(ExpressionGrammarParser.NumComparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#stringComparator}.
	 * @param ctx the parse tree
	 */
	void enterStringComparator(ExpressionGrammarParser.StringComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#stringComparator}.
	 * @param ctx the parse tree
	 */
	void exitStringComparator(ExpressionGrammarParser.StringComparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#binary}.
	 * @param ctx the parse tree
	 */
	void enterBinary(ExpressionGrammarParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#binary}.
	 * @param ctx the parse tree
	 */
	void exitBinary(ExpressionGrammarParser.BinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(ExpressionGrammarParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(ExpressionGrammarParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#decimal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(ExpressionGrammarParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#decimal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(ExpressionGrammarParser.DecimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(ExpressionGrammarParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(ExpressionGrammarParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#validList}.
	 * @param ctx the parse tree
	 */
	void enterValidList(ExpressionGrammarParser.ValidListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#validList}.
	 * @param ctx the parse tree
	 */
	void exitValidList(ExpressionGrammarParser.ValidListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#nullPointer}.
	 * @param ctx the parse tree
	 */
	void enterNullPointer(ExpressionGrammarParser.NullPointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#nullPointer}.
	 * @param ctx the parse tree
	 */
	void exitNullPointer(ExpressionGrammarParser.NullPointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#phrase}.
	 * @param ctx the parse tree
	 */
	void enterPhrase(ExpressionGrammarParser.PhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#phrase}.
	 * @param ctx the parse tree
	 */
	void exitPhrase(ExpressionGrammarParser.PhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#quote}.
	 * @param ctx the parse tree
	 */
	void enterQuote(ExpressionGrammarParser.QuoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#quote}.
	 * @param ctx the parse tree
	 */
	void exitQuote(ExpressionGrammarParser.QuoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#regex}.
	 * @param ctx the parse tree
	 */
	void enterRegex(ExpressionGrammarParser.RegexContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#regex}.
	 * @param ctx the parse tree
	 */
	void exitRegex(ExpressionGrammarParser.RegexContext ctx);
}