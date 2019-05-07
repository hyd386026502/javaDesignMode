package factoryMode.abstractMode;

/**
 * 车型E260的导航仪
 */
public class E260Navigator implements CarNavigator {

    E260Navigator(){
        navigatorColor();
        navigatorPrice();
    }

    @Override
    public void navigatorColor() {
        System.out.println("汽车E260的导航仪颜色：白色");
    }

    @Override
    public void navigatorPrice() {
        System.out.println("汽车E260的导航仪价格：880元");
    }
}