public class TurnOn implements Command {

    private Light light;

    public TurnOn(Light light) {
        this.light = light;
    }

    public void execute() {
       this.light.TurnOn();
    }
}