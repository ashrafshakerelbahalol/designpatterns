package behavioralpatterns.obserever;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        EventListenter event1 = new EmailMsgListener("AShrafSahkerz@gamail.com");
        EventListenter event2 = new EmailMsgListener("AShrafSahker2@gamail.com");
        NotificationService notificationService = store.getNotificationService();
        notificationService.subscribe(event1, Event.SALE);
        notificationService.subscribe(event2, Event.SALE);
        notificationService.subscribe(event2, Event.NEW_SALE);
        notificationService.notifyUser( Event.SALE);
        System.out.println("####################");
        notificationService.notifyUser( Event.NEW_SALE);



    }
}
