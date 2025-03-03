package behavioralpatterns.strategy;

public class PaymentByPayPal implements PaymentStrategy{
private String email;
private String password;
    @Override
    public void collectPaymentDetials() {
        email="qwasert@gmail.com";
        password="asdsfdf";
    }

    @Override
    public boolean validatePaymentDetials() {
        System.out.println("validation done on paypal");
        return true;
    }

    @Override
    public void pay(int amount) {
       System.out.println("The payment is done"+amount);
    }
    
}
