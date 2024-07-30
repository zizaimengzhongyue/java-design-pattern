public class Main {

    public static void main(String[] args) {
        Interviewer interview = new FirstRound("张三");
        interview.setNextRound(new SecondRound("李四")).setNextRound(new ThirdRound("王五"));

        interview.interview(1);
        interview.interview(2);
        interview.interview(3);
        interview.interview(4);
        interview.interview(5);
        interview.interview(6);
        interview.interview(7);
        interview.interview(8);
        interview.interview(9);
    }

}