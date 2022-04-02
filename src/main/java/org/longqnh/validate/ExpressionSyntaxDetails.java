package org.longqnh.validate;

/**
 * Created by Long Nguyen
 * Date: 02/04/2022 22:53
 */
public class ExpressionSyntaxDetails {
    private boolean valid;
    private String error;

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
