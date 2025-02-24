package behavioralpatterns.command;

public class LivingRoom extends Room {
    private FloorLamp floorLamp;
    public LivingRoom (){
        this.floorLamp = new FloorLamp();
    }
   
    
}
