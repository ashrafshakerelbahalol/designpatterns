package creationalPatterns.prototype;

public class Bus extends Vehicle{
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
 
    public Bus(String name, Long id, int nofDoors, double capacity) {
        super(name, id);
        this.nofDoors = nofDoors;
        this.capacity = capacity;
    }
    public Bus(Bus bus) {
        super(bus);
        this.nofDoors = bus.nofDoors;
        this.capacity = bus.capacity;
    }
 
 
    public Bus(){
     
    }
    @Override
    public Bus clone() {
        System.out.println(toString());
       return new Bus (this);
    }
    @Override
    public String toString() {
        return "Bus [nofDoors=" + nofDoors + ", capacity=" + capacity + ", getName()=" + getName() + ", getNofDoors()="
                + getNofDoors() + ", getId()=" + getId() + ", getCapacity()=" + getCapacity() + ", getClass()="
                + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }
    
    
}
