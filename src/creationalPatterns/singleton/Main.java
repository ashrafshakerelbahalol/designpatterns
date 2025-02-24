package creationalPatterns.singleton;

public class Main {
    public static void main(String[] args) {
        String data= "hello world";
        Singleton singleton=Singleton.getInstance(data);
        System.out.println(singleton.getData());
        data= "Ashraf";
        Singleton singleton1=Singleton.getInstance(data);
        System.out.println(singleton1.getData());
    }
}
