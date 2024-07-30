public class TurnOff implements Command {

    private Light light;

    public TurnOff(Light light) {
        this.light = light;
    }

    public void execute() {
        this.light.TurnOff();
    }
}