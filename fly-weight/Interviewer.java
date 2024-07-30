public class Interviewer {
    public String name;

    public Interviewer(String name) {
        this.name = name;
    }

    public void selfIntroduction() {
        System.out.printf("我叫 %s，是第一轮面试的面试官\n", this.name);
    }
}