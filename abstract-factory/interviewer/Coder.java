package interviewer;

public class Coder implements Interviewer {

    public String selfIntroduction() {
        return "我是码农面试官";
    }

    public String question() {
        return "请用 java 实现一个设计模式";
    }
}