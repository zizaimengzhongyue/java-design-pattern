public abstract class BeverageDecorator implements Beverage{
    protected Beverage beverage;
    protected String description;
    protected double cost;

    public String getDescription() {
        return this.description;
    }

    public double getCost() {
        return this.cost;
    }
}