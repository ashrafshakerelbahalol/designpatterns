package behavioralpatterns.strategy;

public class Main {
    public static void main(String[] args) {
     PaymentService paymentService =new PaymentService();
     paymentService.setIncludeDelivery(true);
     paymentService.setCost(100);
     paymentService.setPaymentStrategy(new PaymentByPayPal());
     paymentService.processOrder();

    }
}
