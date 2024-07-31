public class Main {

    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        User user01 = new User("张三", chatRoom);
        User user02 = new User("李四", chatRoom);
        User user03 = new User("王五", chatRoom);
        chatRoom.addUser(user01);
        chatRoom.addUser(user02);
        chatRoom.addUser(user03);

        user01.send("Hello, everyone!");
        user02.send("朋友们好！");
        user03.send("中秋节快乐！");
    }

}