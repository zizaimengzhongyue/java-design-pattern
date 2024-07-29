public class Main {

    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        System.out.printf("%s售价 %.2f\n", coffee.getDescription(), coffee.getCost());

        Beverage milk = new Milk(coffee);
        System.out.printf("%s售价 %.2f\n", milk.getDescription(), milk.getCost());

        Beverage sugar = new Sugar(milk);
        System.out.printf("%s售价 %.2f\n", sugar.getDescription(), sugar.getCost());
    }

}