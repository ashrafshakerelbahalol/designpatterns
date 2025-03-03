package behavioralpatterns.visitor;

public class Restaurant extends Client {

    public Restaurant(String name, String address, String number) {
        super(name, address, number);
    }
    @Override
    protected void accept(InsuranceMessagingVisitor insuranceMessagingVisitor) {
       insuranceMessagingVisitor.visit(this);
    }
    
}
