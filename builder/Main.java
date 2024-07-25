public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder();
        Interview interview = builder.setSelfIntroduction("我是这一轮面试面试官").setQuestion("你先简单做个自我介绍").Build();
        System.out.println(interview.getOpenSpeech());
    }
}