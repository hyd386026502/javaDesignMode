package entrustPattern;

public class ConcreteNotifier extends Notifier {
    @Override
    public EventHandler getEventHandler() {
        return super.getEventHandler();
    }

    @Override
    public void setEventHandler(EventHandler eventHandler) {
        super.setEventHandler(eventHandler);
    }

    @Override
    public void addListener(Object object, String methodName, Object[] args) {
        this.getEventHandler().addEvent(object,methodName,args);
    }

    @Override
    public void notifyX() {
        try {
            this.getEventHandler().notifyX();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
