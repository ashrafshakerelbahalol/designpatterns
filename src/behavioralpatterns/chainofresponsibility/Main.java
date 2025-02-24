package behavioralpatterns.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        Database database =new Database();
        Handler  handler = new UserHandler(database);
        handler.setHandler(new PasswordHandler(database));
        handler.handle("ashraf", "1234");
        
    }
}
