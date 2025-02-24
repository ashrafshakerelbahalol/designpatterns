package behavioralpatterns.command;

public class FloorLamp {
 private Light light;
    public FloorLamp(){
        this.light = new Light();
    }
    public void turnOn(){
        System.out.println("The button is pressed");
        light.switchOn();
    }
}
