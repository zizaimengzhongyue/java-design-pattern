public class Candidate extends Observer {
    private String name;
    protected Subject subject;

    public Candidate(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    public void update() {
        System.out.printf("我是候选人 %s，我收到的职位信息: %s\n", this.name, subject.getMessage());
    }
}