package creationalPatterns.prototype;

public abstract class Vehicle {
    private String name;
    private Long id;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
   
    public Vehicle(String name, Long id) {
        this.name = name;
        this.id = id;
    }
    public Vehicle(Vehicle vehicle) {
        this.name = vehicle.name;
        this.id = vehicle.id;
    }
    public Vehicle(){}

    public abstract Vehicle clone();
}
