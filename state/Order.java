public class Order {

    private State state;

    public Order() {
        this.state = new DraftState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void submit() {
        this.state.submit(this);
    }

    public void reject() {
        this.state.reject(this);
    }

    public void execute() {
        this.state.execute(this);
    }

}