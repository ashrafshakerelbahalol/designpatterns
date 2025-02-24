package behavioralpatterns.command;

public class SwitchLightsCommand implements Command {
    private Light light;

    public SwitchLightsCommand(Light light) {
        this.light = light;
    }

    @Override
    public void excute() {
        System.out.println("The SwitchLightsCommand is pressed");
        light.switchOn();
    }

}
