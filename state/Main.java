public class Main {

    public static void main(String[] args) {
        Order order = new Order();

        order.reject();
        order.execute();
        order.submit();

        order.submit();
        order.reject();
        order.submit();
        order.execute();

        order.submit();
        order.reject();
        order.execute();
    }

}