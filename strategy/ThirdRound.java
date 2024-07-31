public class ThirdRound implements Interviewer {

    public void selfIntroduction() {
        System.out.println("我是第三轮面试官");
    }

    public void question(String name) {
        System.out.printf("%s同学你好，你对薪资的预期是多少？\n", name);
    }

}