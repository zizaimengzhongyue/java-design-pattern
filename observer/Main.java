public class Main {
    public static void main(String[] args) {
        HeadHunter h = new HeadHunter();

        Candidate c1 = new Candidate("张三", h);
        Candidate c2 = new Candidate("李四", h);
        Candidate c3 = new Candidate("王五", h);

        h.change("招聘 java 程序员");
        h.change("招聘广告销售");

        h.removeObserver(c3);
        h.change("招聘 HR");
    }
}