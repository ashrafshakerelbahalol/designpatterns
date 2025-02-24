package behavioralpatterns.chainofresponsibility;

public class UserHandler extends Handler{
    private final Database database;

    public UserHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if(!database.isValidateUser(username)){
            System.out.println("User is not found");
            return false;
        }
        System.out.println("User is found");
        return handleNext(username, password); 
    }
    
} 
    

