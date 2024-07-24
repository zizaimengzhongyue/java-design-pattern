import interviewer.*;
import job.*;

public class Main {
    public static void main(String[] args) {
        Interview i = Factory.getInstance("coder");

        Interviewer p = i.getInterviewer();
        Job j = i.getJob();
        j.jobDescription();
        System.out.println(p.selfIntroduction());
        System.out.println(p.question());

        
        i = Factory.getInstance("sales");

        p = i.getInterviewer();
        j = i.getJob();
        j.jobDescription();
        System.out.println(p.selfIntroduction());
        System.out.println(p.question());
    }
}