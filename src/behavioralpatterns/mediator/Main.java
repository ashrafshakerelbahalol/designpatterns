package behavioralpatterns.mediator;

public class Main {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcretUser user1 = new ConcretUser("User1", mediator);
        ConcretUser user2 = new ConcretUser("User2", mediator);
        ConcretUser user3 = new ConcretUser("User3", mediator);
        user1.sendMessage("Hello");
        user2.sendMessage("game over");
        
    
    }
}
