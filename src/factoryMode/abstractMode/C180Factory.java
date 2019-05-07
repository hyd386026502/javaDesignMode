package factoryMode.abstractMode;

/**
 * 生产某一个型号奔驰车辆的实际工厂 和相关导航仪
 */
public class C180Factory implements BanzFactory {
    @Override
    public Benz createCar() {
        return new BenzC180();
    }

    @Override
    public CarNavigator createNacigator() {
        return new C180Navigator();
    }
}