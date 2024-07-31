public class Main {

    public static void main(String[] args) {
        Interview interview = new Interview(new FirstRound());
        interview.interview("张三");

        interview = new Interview(new SecondRound());
        interview.interview("张三");

        interview = new Interview(new ThirdRound());
        interview.interview("张三");
    }

}