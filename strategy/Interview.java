public class Interview {

    private Interviewer interviewer;

    public Interview(Interviewer interviewer) {
        this.interviewer = interviewer;
    }

    public void interview(String name) {
        this.interviewer.selfIntroduction();
        this.interviewer.question(name);
    }

}