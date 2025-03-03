package behavioralpatterns.state;

public class VibrateMode implements MobileState {

    @Override
    public void alert() {
       System.out.println("Vibernating");
    }
    
}
