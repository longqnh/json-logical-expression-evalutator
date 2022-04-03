package org.longqnh.evaluate;

import com.google.gson.JsonObject;
import org.longqnh.grammar.ExpressionGrammarBaseVisitor;
import org.longqnh.grammar.ExpressionGrammarParser;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Created by Long Nguyen
 * Date: 02/04/2022 02:40
 */
public class ExpressionVisitor extends ExpressionGrammarBaseVisitor<Object> {
    private JsonObject json;

    public void setJson(JsonObject json) {
        this.json = json;
    }

    private String findByKey(String key) {
        return json.get(key).getAsString();
    }

    @Override
    public Object visitParentExpression(ExpressionGrammarParser.ParentExpressionContext ctx) {
        return super.visit(ctx.expression());
    }

    @Override
    public Object visitMultiExpression(ExpressionGrammarParser.MultiExpressionContext ctx) {
        if (ctx.op.AND() != null) {
            return toBoolean(ctx.left) && toBoolean(ctx.right);
        } else if (ctx.op.OR() != null) {
            return toBoolean(ctx.left) || toBoolean(ctx.right);
        }

        throw new RuntimeException();
    }

    @Override
    public Object visitFieldComparatorExpression(ExpressionGrammarParser.FieldComparatorExpressionContext ctx) {
        String left = toString(ctx.left);
        String right = toString(ctx.right);

        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        if (ctx.op.EQ() != null) {
            return left.equals(right);
        } else if (ctx.op.NEQ() != null) {
            return !left.equals(right);
        } else if (ctx.op.LE() != null) {
            return left.compareTo(right) <= 0;
        } else if (ctx.op.GE() != null) {
            return left.compareTo(right) >= 0;
        } else if (ctx.op.LT() != null) {
            return left.compareTo(right) < 0;
        } else if (ctx.op.GT() != null) {
            return left.compareTo(right) > 0;
        }

        throw new RuntimeException();
    }

    @Override
    public Object visitNumComparatorExpression(ExpressionGrammarParser.NumComparatorExpressionContext ctx) {
        if (ctx.op.EQ() != null) {
            return toNumber(ctx.left) == toNumber(ctx.right);
        } else if (ctx.op.NEQ() != null) {
            return toNumber(ctx.left) != toNumber(ctx.right);
        } else if (ctx.op.LE() != null) {
            return toNumber(ctx.left) <= toNumber(ctx.right);
        } else if (ctx.op.GE() != null) {
            return toNumber(ctx.left) >= toNumber(ctx.right);
        } else if (ctx.op.LT() != null) {
            return toNumber(ctx.left) < toNumber(ctx.right);
        } else if (ctx.op.GT() != null) {
            return toNumber(ctx.left) > toNumber(ctx.right);
        }

        throw new RuntimeException();
    }

    @Override
    public Object visitBoolComparatorExpression(ExpressionGrammarParser.BoolComparatorExpressionContext ctx) {
        if (ctx.op.EQ() != null) {
            return toBoolean(ctx.left) == toBoolean(ctx.right);
        } else if (ctx.op.NEQ() != null) {
            return toBoolean(ctx.left) != toBoolean(ctx.right);
        }

        throw new RuntimeException();
    }

    @Override
    public Object visitStringComparatorExpression(ExpressionGrammarParser.StringComparatorExpressionContext ctx) {
        if (ctx.op.EQ() != null) {
            return toString(ctx.right).equals(toString(ctx.left));
        } else if (ctx.op.NEQ() != null) {
            return !toString(ctx.right).equals(toString(ctx.left));
        }

        throw new RuntimeException();
    }

    @Override
    public Object visitIsNullExpression(ExpressionGrammarParser.IsNullExpressionContext ctx) {
        String value = toString(ctx.left);
        return value == null || value.isEmpty();
    }

    @Override
    public Object visitIsNotNullExpression(ExpressionGrammarParser.IsNotNullExpressionContext ctx) {
        String value = toString(ctx.left);
        return value != null && !value.isEmpty();
    }

    private boolean handleMatch(String value, Pattern regex) {
        Matcher matcher = regex.matcher(value);
        return matcher.matches();
    }

    @Override
    public Object visitMatchExpression(ExpressionGrammarParser.MatchExpressionContext ctx) {
        String value = toString(ctx.left);
        Pattern regex = toRegex(ctx.right);

        if (value == null || regex == null)
            return false;

        return handleMatch(value, regex);
    }

    @Override
    public Object visitNotMatchExpression(ExpressionGrammarParser.NotMatchExpressionContext ctx) {
        String value = toString(ctx.left);
        Pattern regex = toRegex(ctx.right);

        if (value == null || regex == null)
            return true;

        return !handleMatch(value, regex);
    }

    @Override
    public Object visitInExpression(ExpressionGrammarParser.InExpressionContext ctx) {
        String value = toString(ctx.left);
        if (value == null)
            return false;

        List<String> data = toList(ctx.right);

        return data.contains(value);
    }

    @Override
    public Object visitNotInExpression(ExpressionGrammarParser.NotInExpressionContext ctx) {
        String value = toString(ctx.left);
        if (value == null)
            return true;

        List<String> data = toList(ctx.right);

        return !data.contains(value);
    }

    private boolean toBoolean(ExpressionGrammarParser.FieldContext ctx) {
        String value = findByKey(ctx.getText());
        if (value == null) {
            throw new RuntimeException("Key " + ctx.getText() + " doesn't exist in the given JSON object");
        }
        return Boolean.valueOf(value);
    }

    private boolean toBoolean(ExpressionGrammarParser.BoolContext ctx) {
        return Boolean.valueOf(ctx.getText().toLowerCase());
    }

    private boolean toBoolean(ExpressionGrammarParser.ExpressionContext ctx) {
        return (boolean)visit(ctx);
    }

    private double toNumber(ExpressionGrammarParser.FieldContext ctx) {
        String value = findByKey(ctx.getText());
        if (value == null) {
            throw new RuntimeException("Key " + ctx.getText() + " doesn't exist in the given JSON object");
        }
        return Double.valueOf(value);
    }

    private double toNumber(ExpressionGrammarParser.DecimalContext ctx) {
        return Double.valueOf(ctx.getText());
    }

    private String toString(ExpressionGrammarParser.FieldContext ctx) {
        return findByKey(ctx.getText());
    }

    private String toString(ExpressionGrammarParser.PhraseContext ctx) {
        return ctx.getText().substring(1, ctx.getText().length() - 1);
    }

    private String toString(ExpressionGrammarParser.QuoteContext ctx) {
        return ctx.getText().substring(1, ctx.getText().length() - 1);
    }

    private Pattern toRegex(ExpressionGrammarParser.RegexContext ctx) {
        if (ctx.quote() != null) {
            return Pattern.compile(toString(ctx.quote()));
        }

        return null;
    }

    private List<String> toList(ExpressionGrammarParser.ValidListContext ctx) {
        List<String> list = new ArrayList<>();

        String s = ctx.getText().substring(1, ctx.getText().length() - 1); // remove ()

        if (ctx.CUSTOM_STRING_LIST() != null) {
            list = Arrays.stream(s.split(","))
                    .map(String::trim)
                    .map(st -> st.substring(1, st.length() - 1)) // remove ''
                    .collect(Collectors.toList());
        } else if (ctx.CUSTOM_NUM_LIST() != null) {
            list = Arrays.stream(s.split(","))
                    .map(String::trim)
                    .collect(Collectors.toList());
        }

        return list;
    }
}
