package factoryMode.methodMode;
/**
 *生产系列二的 实际工厂
 * */
public class twoFactory implements creatFactory {
    /**
     * 生产汽车2的方法
     * **/
    @Override
    public productAsCar createCar() {
        return new productCarOne();
    }
}
