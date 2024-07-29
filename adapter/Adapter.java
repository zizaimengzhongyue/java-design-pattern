public class Adapter implements Interview {
    private Coder interviewer;

    public Adapter(Coder coder) {
        this.interviewer = coder;
    }

    public void selfIntroduction() {
        this.interviewer.selfIntroduction();
    }

    public void question() {
        this.interviewer.designPatternQuestion();
    }
}