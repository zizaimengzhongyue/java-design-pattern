public class Main {
    public static void main(String[] args) {
        Counter c1 = Counter.getInstance();
        c1.increament();
        System.out.println(c1.getCount());
        c1.increament();

        Counter c2 = Counter.getInstance();
        System.out.println(c2.getCount());
    }
}