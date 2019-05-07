package component;

public abstract class Decorator extends Component{
    protected Component component;
    public void  setComponent(Component component){
        this.component = component;
    }
    @Override
    public  void Operation() {
        if (component!=null){
            component.Operation();
        }
    }
}
