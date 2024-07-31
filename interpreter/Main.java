public class Main {

    public static void main(String[] args) {
        Expression expression = new NotExpression(
                new OrExpression(
                        new AndExpression(new Variable(true), new Variable(false)),
                        new Variable(true)
                )
        );
        System.out.println(expression.interpret());

        expression = new NotExpression(
                new OrExpression(
                        new AndExpression(new Variable(true), new Variable(false)),
                        new Variable(false)
                )
        );
        System.out.println(expression.interpret());
    }

}