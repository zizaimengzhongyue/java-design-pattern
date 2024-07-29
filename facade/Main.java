public class Main {

    public static void main(String[] args) {
        Mac mac = new Mac(new Steam(), new BattleNet(), new IntelliJ());

        mac.work();
        mac.rest();
    }

}