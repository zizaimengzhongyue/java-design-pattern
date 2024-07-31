public class DraftState implements State {

    public void submit(Order order) {
        System.out.println("订单提交成功!");
        order.setState(new RunningState());
    }

    public void reject(Order order) {
        System.out.println("订单处于草稿状态，无法打回");
    }

    public void execute(Order order) {
        System.out.println("订单处于草稿状态，无法执行");
    }

}