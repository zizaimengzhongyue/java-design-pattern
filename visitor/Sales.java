public class Sales implements Candidate {

    private String name;

    public Sales(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getMessage() {
        return "我是一名电脑销售";
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}