package behavioralpatterns.command;

public class Light {
    private boolean switchOn;

    public void switchOn() {
        switchOn = !switchOn;
        if (switchOn)
            System.out.println("The light is on");
        else {
            System.out.println("The light is off");
        }
    }

}
