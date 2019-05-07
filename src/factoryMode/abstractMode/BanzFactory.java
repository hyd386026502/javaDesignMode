package factoryMode.abstractMode;

/**
 * 奔驰工厂的抽象接口
 */
public interface BanzFactory {
    /**
     * 创建奔驰的方法
     */
    Benz createCar();

    /**
     * 创建导航仪的方法
     */
    CarNavigator createNacigator();

}