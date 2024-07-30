import java.util.Random;

public class ThirdRound implements Interviewer {

    protected String name;
    protected Interviewer nextRound;

    public ThirdRound(String name) {
        this.name = name;
    }

    public Interviewer setNextRound(Interviewer interviewer) {
        this.nextRound = interviewer;
        return interviewer;
    }

    public void selfIntroduction() {
        System.out.printf("我是三面面试官，我的名字是: %s\n", this.name);
    }

    public void interview(int num) {
        this.selfIntroduction();
        int rand = new Random().nextInt(2);
        if (rand != 0) {
            System.out.println("很遗憾面试失败");
            return;
        }
        if (this.nextRound == null) {
            System.out.println("恭喜你通过面试，回家等 offer 吧");
            return;
        }
        System.out.println("恭喜你通过面试，请准备下一场面试");
        this.nextRound.interview(num);
    }
}