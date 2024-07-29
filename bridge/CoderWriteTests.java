public class CoderWriteTests extends WriteTests {

    public CoderWriteTests(TestPaper testPaper) {
        super(testPaper);
    }

    public void jobDescription() {
        System.out.println("这是一场 java 程序员笔试，重点考察设计模式.");
    }

    public void question() {
        this.testPaper.question();
    }

}