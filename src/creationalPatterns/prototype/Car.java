package creationalPatterns.prototype;

public class Car extends Vehicle{
    private int nofDoors;
    private double capacity;
   
    public int getNofDoors() {
        return nofDoors;
    }
    public void setNofDoors(int nofDoors) {
        this.nofDoors = nofDoors;
    }
    public double getCapacity() {
        return capacity;
    }
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
 
    public Car(String name, Long id, int nofDoors, double capacity) {
        super(name, id);
        this.nofDoors = nofDoors;
        this.capacity = capacity;
    }
    public Car(Car car) {
        super(car);
        this.nofDoors = car.nofDoors;
        this.capacity = car.capacity;
    }
 
 
    public Car(){
     
    }
    @Override
    public Car clone() {
       return new Car (this);
    }
    
}
