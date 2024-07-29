public class Main {
    public static void main(String[] args) {
        FS dir = new Folder("root");
        FS user = new Folder("user");
        FS config = new File("config");

        user.add(config);
        dir.add(user);

        dir.getMeta();
        FS child = dir.getChild(0);
        child.getMeta();
        FS leaf = child.getChild(0);
        leaf.getMeta();
    }
}