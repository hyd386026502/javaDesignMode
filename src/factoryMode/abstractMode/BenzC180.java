package factoryMode.abstractMode;

/**
 * 奔驰C180的生产的具体类
 */
public class BenzC180 implements Benz {
    /**
     * 构造方法，创建的时候就设置基本属性
     */
    public BenzC180() {
        carColor();
        carPrice();
        carSpeed();
    }

    @Override
    public void carColor() {
        System.out.println("奔驰C180的颜色是银白色");

    }

    @Override
    public void carSpeed() {
        System.out.println("奔驰C180的速度是200公里每小时");
    }

    @Override
    public void carPrice() {
        System.out.println("奔驰C180的价格是100万");
    }
}