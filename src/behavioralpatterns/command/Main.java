package behavioralpatterns.command;

public class Main {
    public static void main(String[] args) {
        Room room = new LivingRoom();
        Light light = new Light();
        Command command = new SwitchLightsCommand(light);
        room.setCommand(command);
        room.excuteCommand();

    }
}
