public class Interviewer implements Visitor {

    public void visit(Coder coder) {
        System.out.printf("我约了程序员候选人-%s面试, ˙这是他的个人信息:%s\n", coder.getName(), coder.getMessage());
    }

    public void visit(Sales sales) {
        System.out.printf("我约了销售候选热-%s面试, ˙这是他的个人信息:%s\n", sales.getName(), sales.getMessage());
    }

}