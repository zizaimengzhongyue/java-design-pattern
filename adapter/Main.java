public class Main {
    public static void main(String[] args) {

        Interview interview = new Adapter(new Coder());

        interview.selfIntroduction();
        interview.question();

    }
}