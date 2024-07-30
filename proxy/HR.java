public class HR implements Interviewer {

    private Interviewer interviewer;
    private String name;

    public HR(String name) {
        this.name = name;
    }

    public void selfIntroduction() {
        if (this.interviewer == null) {
            this.interviewer = new Coder(this.name);
        }
        this.interviewer.selfIntroduction();
    }

    public void question() {
        if (this.interviewer == null) {
            this.interviewer = new Coder(this.name);
        }
        this.interviewer.question();
    }

}