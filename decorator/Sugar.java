public class Sugar extends BeverageDecorator {
    protected Beverage beverage;
    protected String description = "加糖;";
    protected double cost = 2.0;

    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage.getDescription() + this.description;
    }

    public double getCost() {
        return this.beverage.getCost() + this.cost;
    }
}