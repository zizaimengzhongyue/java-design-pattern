public class User {

    private ChatRoom chatRoom;
    private String name;

    public User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public void send(String message) {
        this.chatRoom.sendMessage(this, String.format("%s 说: %s\n", this.name, message));
    }

    public void receive(String message) {
        System.out.printf("%s 收到了消息: %s\n", this.name, message);
    }

}