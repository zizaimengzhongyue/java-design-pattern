import java.util.ArrayList;

public class ChatRoom {

    ArrayList<User> userList = new ArrayList<>();

    public void addUser(User user) {
        this.userList.add(user);
    }

    public void sendMessage(User user, String message) {
        System.out.println(message);
        for (User item : this.userList) {
            if (item == user) {
                continue;
            }
            item.receive(message);
        }
    }

}