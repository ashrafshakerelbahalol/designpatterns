package behavioralpatterns.strategy;

public interface PaymentStrategy {

    void collectPaymentDetials();

    boolean validatePaymentDetials();

    void pay(int amount);

}
