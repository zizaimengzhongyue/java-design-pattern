public class Main {

    public static void main(String[] args) {
        Resume resume = new Resume();
        resume.setMessage("我是一名 Java 程序员，精通设计模式！");

        Orginator orginator = new Orginator(resume);
        System.out.println(orginator.getMessage());
        orginator.saveToMemento();
        orginator.setMessage("我是一名 Java 程序员，熟悉设计模式...");
        System.out.println(orginator.getMessage());

        orginator.restoreFromMemento();
        System.out.println(orginator.getMessage());
    }

}