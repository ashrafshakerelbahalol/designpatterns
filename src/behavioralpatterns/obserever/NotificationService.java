package behavioralpatterns.obserever;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class NotificationService {
private final Map <Event,List<EventListenter>> cus;
public NotificationService (){
    cus= new HashMap<>();
    Arrays.stream(Event.values()).forEach(event ->cus.put(event, new ArrayList<>()));
}
public void subscribe(EventListenter eventListenter,Event event){
    cus.get(event).add(eventListenter);
}
public void unsubscribe(EventListenter eventListenter,Event event){
    cus.get(event).remove(eventListenter);
}
public void notifyUser(Event event){
    cus.get(event).forEach(listener-> listener.update(event));
}
}
