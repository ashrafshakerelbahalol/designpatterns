package behavioralpatterns.state;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.alert();
        phone.setState(new SilentMode());
        phone.alert();
    }
}
