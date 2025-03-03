package behavioralpatterns.obserever;

public class Store {
    private final NotificationService notificationService;
    public Store(){
        notificationService=new NotificationService();
    }
    public NotificationService getNotificationService(){
        return notificationService;
    }
}
