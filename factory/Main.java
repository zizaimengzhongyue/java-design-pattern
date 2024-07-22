import interviewer.*;

public class Main {
    public static void main(String[] args) {
        Interviewer sales = Factory.getInterviewer("sales");
        System.out.println(sales.selfIntroduction());
        System.out.println(sales.question());

        Interviewer coder = Factory.getInterviewer("coder");
        System.out.println(coder.selfIntroduction());
        System.out.println(coder.question());
    }
}

