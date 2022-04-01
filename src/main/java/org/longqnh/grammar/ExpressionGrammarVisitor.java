// Generated from D:/workspace/json-logical-expression-evalutator/src/main/grammar\ExpressionGrammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpressionGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpressionGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code matchExpression}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchExpression(ExpressionGrammarParser.MatchExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inExpression}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInExpression(ExpressionGrammarParser.InExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numComparatorExpression}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumComparatorExpression(ExpressionGrammarParser.NumComparatorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notMatchExpression}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotMatchExpression(ExpressionGrammarParser.NotMatchExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiExpression}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiExpression(ExpressionGrammarParser.MultiExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringComparatorExpression}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringComparatorExpression(ExpressionGrammarParser.StringComparatorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notInExpression}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotInExpression(ExpressionGrammarParser.NotInExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolComparatorExpression}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolComparatorExpression(ExpressionGrammarParser.BoolComparatorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isNullExpression}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNullExpression(ExpressionGrammarParser.IsNullExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fieldComparatorExpression}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldComparatorExpression(ExpressionGrammarParser.FieldComparatorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentExpression}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentExpression(ExpressionGrammarParser.ParentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isNotNullExpression}
	 * labeled alternative in {@link ExpressionGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNotNullExpression(ExpressionGrammarParser.IsNotNullExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#numComparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumComparator(ExpressionGrammarParser.NumComparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#stringComparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringComparator(ExpressionGrammarParser.StringComparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(ExpressionGrammarParser.BinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(ExpressionGrammarParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#decimal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal(ExpressionGrammarParser.DecimalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(ExpressionGrammarParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#validList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidList(ExpressionGrammarParser.ValidListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#nullPointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullPointer(ExpressionGrammarParser.NullPointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#phrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhrase(ExpressionGrammarParser.PhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#quote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuote(ExpressionGrammarParser.QuoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#regex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegex(ExpressionGrammarParser.RegexContext ctx);
}