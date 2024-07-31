public class NotExpression implements Expression {

    private Expression expr;

    public NotExpression(Expression expr) {
        this.expr = expr;
    }

    public boolean interpret() {
        return !(this.expr.interpret());
    }

}