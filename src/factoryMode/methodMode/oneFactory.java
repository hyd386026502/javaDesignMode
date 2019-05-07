package factoryMode.methodMode;
/**
 *生产系列一汽车  实际工厂
 * */
public class oneFactory implements creatFactory {
    /**
     * 生产汽车1的方法
     * **/
    @Override
    public productAsCar createCar() {
        return new productCarOne();
    }
}
