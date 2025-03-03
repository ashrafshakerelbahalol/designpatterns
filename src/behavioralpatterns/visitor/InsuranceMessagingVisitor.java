package behavioralpatterns.visitor;

import java.util.List;

public class InsuranceMessagingVisitor {
    public void sendInsuranceMails(List<Client>clients){
        for(Client client:clients){
             client.accept(this);   
               }
    }
    public void visit(House house){
        System.out.println("House visiting");

    }
    public void visit(Restaurant restaurant){
        System.out.println("Restaurant visiting");
    }
}
