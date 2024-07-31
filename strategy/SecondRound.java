public class SecondRound implements Interviewer {

    public void selfIntroduction() {
        System.out.println("我是第二轮面试官");
    }

    public void question(String name) {
        System.out.printf("%s同学你好，请介绍下你对设计模式的理解\n", name);
    }

}