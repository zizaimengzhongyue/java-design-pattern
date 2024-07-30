public class Main {

    public static void main(String[] args) {
        Light light = new Light();
        Remote remote = new Remote();

        remote.setCommand(new TurnOn(light));
        remote.execute();

        remote.setCommand(new TurnOff(light));
        remote.execute();
    }

}