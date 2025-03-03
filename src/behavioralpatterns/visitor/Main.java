package behavioralpatterns.visitor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Client>clients =List.of(new House(null, null, null),new Restaurant(null, null, null));
        InsuranceMessagingVisitor insuranceMessagingVisitor = new InsuranceMessagingVisitor();
        insuranceMessagingVisitor.sendInsuranceMails(clients);
    }
}
