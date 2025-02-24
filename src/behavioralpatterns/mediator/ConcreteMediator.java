package behavioralpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {
      private List<User> users;
      public ConcreteMediator (){
        users=new ArrayList<>();
      }
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            if (user != sender) { 
                user.receiveMessage(message);
            }
        }
    }

    public void addUser(User user) {
       users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    
    
}
