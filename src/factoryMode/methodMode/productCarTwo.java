package factoryMode.methodMode;
/**
 *一个汽车 生产 具体类
 * */
public class productCarTwo implements productAsCar{
    /**
     * 构造方法: 初始化;
     * **/
    public productCarTwo(){
        carColor();
        carName();
        carPrice();
    }
    @Override
    public void carColor() {
        System.out.print("green");
    }

    @Override
    public void carName() {
        System.out.print("宝马系列2");
    }

    @Override
    public void carPrice() {
        System.out.print("200");
    }
}
