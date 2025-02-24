package creationalPatterns.prototype;

public class Main {
    public static void main(String[] args) {
        Bus bus= new Bus("sadas",12L,12,12.2);
        Bus bus1=bus.clone();
    }
    
}
