package behavioralpatterns.visitor;

public class House extends Client {

    public House(String name, String address, String number) {
        super(name, address, number);
    }

    @Override
    protected void accept(InsuranceMessagingVisitor insuranceMessagingVisitor) {
       insuranceMessagingVisitor.visit(this);
    }
    
}
