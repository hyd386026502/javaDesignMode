package factoryMode.abstractMode;

/**
 * 车型C180的导航仪
 */
public class C180Navigator implements CarNavigator {

    C180Navigator(){
        navigatorColor();
        navigatorPrice();
    }

    @Override
    public void navigatorColor() {
        System.out.println("汽车C180的导航仪颜色：黑色");
    }

    @Override
    public void navigatorPrice() {
        System.out.println("汽车C180的导航仪价格：480元");
    }
}