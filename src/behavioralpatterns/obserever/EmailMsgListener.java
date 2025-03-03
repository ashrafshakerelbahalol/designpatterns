package behavioralpatterns.obserever;

public class EmailMsgListener implements EventListenter {
    private String email;

    public EmailMsgListener(String email) {
        this.email = email;
    }

    @Override
    public void update(Event event) {
        System.out.println("The notiocation of "+event.toString()+" is sended " + email);
    }

}
