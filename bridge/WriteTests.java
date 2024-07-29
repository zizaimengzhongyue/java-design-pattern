public abstract class WriteTests {
    protected TestPaper testPaper;

    public WriteTests(TestPaper testPaper) {
        this.testPaper = testPaper;
    }

    public abstract void jobDescription();

    public void question(){}
}