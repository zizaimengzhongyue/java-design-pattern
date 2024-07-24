public class Counter {
    private int count;
    private static Counter instance = new Counter();

    private Counter() {}

    public static Counter getInstance() {
        return instance;
    }

    public void increament() {
        this.count++;
    }

    public int getCount() {
        return this.count;
    }
}