public class Coder implements Interviewer {

    protected String name;

    public Coder(String name) {
        this.name = name;
    }

    public void selfIntroduction() {
        System.out.printf("我是 Java 面试官, 我的名字是: %s\n", this.name);
    }

    public void question() {
        System.out.println("请实现一个代理模式的 demo.");
    }

}