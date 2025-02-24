package behavioralpatterns.mediator;

public class ConcretUser implements User {
    private String name;
   private Mediator mediator;
    public ConcretUser(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.addUser(this);
    }
    public void sendMessage(String message) {
       System.out.println("The message is: "+message);
         mediator.sendMessage(message, this);
    }

    public void receiveMessage(String message) {
        System.out.println(name+" received hte message: "+message);
        
    }

    public String getName() {
        System.out.println("The name is: "+name);
        return name;
    }

    
}
