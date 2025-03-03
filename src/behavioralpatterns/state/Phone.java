package behavioralpatterns.state;

public class Phone {
    private MobileState currentState;

    public Phone() {
        // Default state
        this.currentState = new RingingMode();
    }

    public void setState(MobileState state) {
        this.currentState = state;
    }

    public void alert() {
        currentState.alert();
    }
}