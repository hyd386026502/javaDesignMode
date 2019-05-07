package observerPattern;

public interface Observer {
	 /**
     * 
     * @param subject 被观察者
     * @param data    被观察者传递给观察者的 数据
     */
    void update(Subject subject, Object data);
}
