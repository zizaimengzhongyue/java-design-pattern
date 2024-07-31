public class Variable implements Expression {
    private boolean variable;

    public Variable(boolean variable) {
        this.variable = variable;
    }

    public boolean interpret() {
        return this.variable;
    }
}