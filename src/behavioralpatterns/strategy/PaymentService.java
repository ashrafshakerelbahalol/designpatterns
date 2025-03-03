package behavioralpatterns.strategy;

public class PaymentService {
    PaymentStrategy paymentStrategy ;
    int cost;
    public void processOrder(){
        paymentStrategy.collectPaymentDetials();
        if(paymentStrategy.validatePaymentDetials())
          paymentStrategy.pay(getTotal());
    }
    boolean includeDelivery;
     int getTotal(){
        return includeDelivery?cost+10:cost;
    }
    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public boolean isIncludeDelivery() {
        return includeDelivery;
    }
    public void setIncludeDelivery(boolean includeDelivery) {
        this.includeDelivery = includeDelivery;
    }
    
}
