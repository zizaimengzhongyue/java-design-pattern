public class Main {
    public static void main(String[] args) {
        InterviewerFactory interviewerFactory = new InterviewerFactory();

        Interviewer interviewer = interviewerFactory.getInterviewer("张三");
        interviewer.selfIntroduction();

        interviewer = interviewerFactory.getInterviewer("李四");
        interviewer.selfIntroduction();

        interviewer = interviewerFactory.getInterviewer("张三");
        interviewer.selfIntroduction();
    }
}