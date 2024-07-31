public class HR implements Visitor {

    public void visit(Coder coder) {
        System.out.printf("我联系了程序员:%s, ˙这是他的个人信息:%s\n", coder.getName(), coder.getMessage());
    }

    public void visit(Sales sales) {
        System.out.printf("我联系了销售:%s, ˙这是他的个人信息:%s\n", sales.getName(), sales.getMessage());
    }

}