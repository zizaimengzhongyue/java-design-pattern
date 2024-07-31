public interface State {
    public void submit(Order order);
    public void execute(Order order);
    public void reject(Order order);
}