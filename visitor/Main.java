public class Main {

    public static void main(String[] args) {
        Coder coder = new Coder("张三");
        Sales sales = new Sales("李四");

        HR hr = new HR();
        coder.accept(hr);
        sales.accept(hr);

        Interviewer interviewer = new Interviewer();
        coder.accept(interviewer);
        sales.accept(interviewer);
    }

}