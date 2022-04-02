package org.longqnh.validate;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.longqnh.grammar.ExpressionGrammarBaseListener;
import org.longqnh.grammar.ExpressionGrammarLexer;
import org.longqnh.grammar.ExpressionGrammarParser;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/**
 * Created by Long Nguyen
 * Date: 02/04/2022 02:30
 */
public class ExpressionSyntaxValidator extends ExpressionGrammarBaseListener implements ANTLRErrorListener {
    private List<String> errMsg = new ArrayList<>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e) {
        this.errMsg.add("Syntax error at line " + i + ":" + i1 + ";");
    }

    @Override
    public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {

    }

    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet) {

    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {

    }

    public ExpressionSyntaxDetails validate(String expression) {
        ExpressionGrammarLexer lexer = new ExpressionGrammarLexer(CharStreams.fromString(expression));
        ExpressionGrammarParser parser = new ExpressionGrammarParser(new CommonTokenStream(lexer));

        lexer.removeErrorListeners();
        lexer.addErrorListener(this);
        parser.removeErrorListeners();
        parser.addErrorListener(this);

        ParseTree tree = parser.expression();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(this, tree);

        ExpressionSyntaxDetails expressionSyntaxDetails = new ExpressionSyntaxDetails();
        expressionSyntaxDetails.setValid(errMsg.isEmpty());
        expressionSyntaxDetails.setError(String.join("\n", this.errMsg));

        return expressionSyntaxDetails;
    }
}
