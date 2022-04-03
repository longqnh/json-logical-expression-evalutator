package org.longqnh.evaluate;

import com.google.gson.JsonObject;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.longqnh.grammar.ExpressionGrammarLexer;
import org.longqnh.grammar.ExpressionGrammarParser;

/**
 * Created by Long Nguyen
 * Date: 02/04/2022 02:50
 */
public class ExpressionEvaluator {
    public boolean evaluate(String expression, JsonObject json) {
        if (json == null || json.isJsonNull() || json.size() == 0 || expression == null || expression.isEmpty()) {
            return false;
        }

        ExpressionVisitor visitor = new ExpressionVisitor();
        visitor.setJson(json);

        ExpressionGrammarLexer lexer = new ExpressionGrammarLexer(CharStreams.fromString(expression));
        ExpressionGrammarParser parser = new ExpressionGrammarParser(new CommonTokenStream(lexer));
        ExpressionGrammarParser.ExpressionContext expressionContext = parser.expression();
        Object result = visitor.visit(expressionContext);

        return (boolean) result;
    }
}
