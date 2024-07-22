package interviewer;

public class Sales implements Interviewer {

    public String selfIntroduction() {
        return "我是销售面试官";
    }

    public String question() {
        return "请卖给我一支钢笔";
    }
}