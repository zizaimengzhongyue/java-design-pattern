public class RunningState implements State {

    public void submit(Order order) {
        System.out.println("订单处于运行状态，无法提交");
    }

    public void reject(Order order) {
        System.out.println("订单打回成功");
        order.setState(new DraftState());
    }

    public void execute(Order order) {
        System.out.println("订单执行成功");
        order.setState(new FinishState());
    }

}