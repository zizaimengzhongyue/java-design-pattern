public class Coder implements Candidate {

    private String name;

    public Coder(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getMessage() {
        return "我是一名 Java 程序员";
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}