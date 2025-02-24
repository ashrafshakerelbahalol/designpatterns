package behavioralpatterns.chainofresponsibility;

import java.util.HashMap;
import java.util.Map;

public class Database {
    private final Map<String,String> users;
    public Database(){
        users=new HashMap<>();
        users.put("ashraf","1234");
        users.put("ahmed", "123");
        users.put("mohamed", "12345");
    }
    public boolean isValidateUser(String username){
        return users.containsKey(username);
    }
    public boolean isValidatPassword(String username, String password){
        return users.get(username).equals(password);
    }
}
