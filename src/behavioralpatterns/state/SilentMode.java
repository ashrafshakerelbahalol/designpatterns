package behavioralpatterns.state;

public class SilentMode implements MobileState {

    @Override
    public void alert() {
       System.out.println("Silence");
    }

} 
    

