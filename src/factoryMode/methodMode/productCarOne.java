package factoryMode.methodMode;
/**
 *一个汽车 生产 具体类
 * */
public class productCarOne implements productAsCar{

    /**
     * 构造方法: 初始化;
     * **/
    public productCarOne(){
        carColor();
        carName();
        carPrice();
    }
    @Override
    public void carColor() {
        System.out.print("red");
    }

    @Override
    public void carName() {
        System.out.print("宝马系列1");
    }

    @Override
    public void carPrice() {
        System.out.print("100");
    }
}
