package entrustPattern;

import java.util.ArrayList;
import java.util.List;
/**
 *通过java反射机制将通知者 和观察者分离出来,
 *
 * ，这样也改掉了观察者模式的缺点，通知者类完全不知道自己需要通知的是谁，做到了完全解耦，
 * 同时也去掉了抽象的观察者类。
 * **/
public class EventHandler {
    private List<Event> objects;

    public EventHandler() {
        objects = new ArrayList<Event>();
    }
    public void  addEvent(Object object,String  methodName,Object[] args){
        objects.add(new Event(object,methodName,args));
    }
public void notifyX() throws Exception{
        for (Event event: objects){
            event.invoke();
        }
}
}
