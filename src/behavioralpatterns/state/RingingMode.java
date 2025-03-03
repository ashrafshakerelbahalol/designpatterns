package behavioralpatterns.state;

public class RingingMode implements MobileState {

    @Override
    public void alert() {
       System.out.println("Ringing");
    }

}
