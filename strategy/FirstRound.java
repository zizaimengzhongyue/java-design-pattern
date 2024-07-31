public class FirstRound implements Interviewer {

    public void selfIntroduction() {
        System.out.println("我是第一轮面试官");
    }

    public void question(String name) {
        System.out.printf("%s同学你好，请编码实现一个策略模式\n", name);
    }

}