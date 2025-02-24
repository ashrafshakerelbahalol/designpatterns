package behavioralpatterns.mediator;

public interface User {
    void sendMessage(String message);

    void receiveMessage(String message);

    String getName();
}
