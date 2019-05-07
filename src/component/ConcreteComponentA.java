package component;

public class ConcreteComponentA extends Decorator {
    private String addedState;
    @Override
    public  void Operation() {
        addedState = "增加状态A";
        System.out.println("被A装饰过了:"+addedState);
        this.component.Operation();
    }
}
