package Behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements Chat{
    Admin admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(Admin admin){
        this.admin = admin;
    }

    public void addUserToChat(User user){
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User currentUser: users){
            if(currentUser != user){
                currentUser.getMessage(message);
            }
        }
    }
}
