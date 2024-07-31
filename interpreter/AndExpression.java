public class AndExpression implements Expression {
    private Expression left;
    private Expression right;

    public AndExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public boolean interpret() {
        return this.left.interpret() && this.right.interpret();
    }
}