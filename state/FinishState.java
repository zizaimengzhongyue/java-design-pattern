public class FinishState implements State {

    public void submit(Order order) {
        System.out.println("订单已完成，无法提交");
    }

    public void reject(Order order) {
        System.out.println("订单已完成，无法打回");
    }

    public void execute(Order order) {
        System.out.println("订单已完成，无法执行");
    }

}