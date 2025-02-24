package behavioralpatterns.chainofresponsibility;
public abstract class Handler {
    private Handler next;
    public Handler setHandler(Handler next){
        this.next= next;
        return next;
    }
    public abstract boolean handle (String username, String password);
    public boolean handleNext(String username,String password){
        if(next==null){
            return true;
        }
        return next.handle(username, password);
    }
    
}
