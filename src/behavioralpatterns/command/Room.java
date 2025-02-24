package behavioralpatterns.command;

public abstract class Room {
   private Command command;
 
    public void excuteCommand(){
        command.excute();
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
