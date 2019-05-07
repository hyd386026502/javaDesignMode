package factoryMode.abstractMode;

/**
        * 生产某一个型号奔驰车E260辆的实际工厂 和相关导航仪
        */
public class E260Factory implements BanzFactory {
    @Override
    public Benz createCar() {
        return new BenzE260();
    }

    @Override
    public CarNavigator createNacigator() {
        return new E260Navigator();
    }
}