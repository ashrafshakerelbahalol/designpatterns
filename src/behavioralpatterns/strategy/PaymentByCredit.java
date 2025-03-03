package behavioralpatterns.strategy;

public class PaymentByCredit implements PaymentStrategy{
  private CreditCard creditCard;
    @Override
    public void collectPaymentDetials() {
        creditCard = new CreditCard(125, null, "216514351");
    }

    @Override
    public boolean validatePaymentDetials() {
        System.out.println("validation done");
        return true;
    }

    @Override
    public void pay(int amount) {
       System.out.println("The payment is done"+amount);
    }
    
}
