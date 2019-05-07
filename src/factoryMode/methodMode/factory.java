package factoryMode.methodMode;
/**
 * 工厂方法模式:
 * 工厂模式方法的优点：
 1.良好的封装性
 2.优秀的可扩展性
 3.屏蔽产品类
 4.工厂方法模式是典型的解耦框架
 上面几个有点你在看完这篇文章，熟知工厂方法模式后，再回来细细品味就会更有味道。

 工厂方法模式的使用场景：
 1.需要灵活、可扩展的框架
 2.在异构项目中
 3.在测试驱动开发的框架中使用
 工厂方法模式还可以与其他模式混合使用（单例模式、原型模式）
 应用场景没有必要纠结那么多，等你熟知很多设计模式后，你的代码设计思维自然会严谨、扩展性好一些。
 问题是要熟知，不然知一半用一半，后期维护是更加麻烦的事情，还不如不用
 ---------------------

 一个产品的 多个系列时候 使用;
 而抽象工厂模式: 是多个产品混成一个生产线使用,扩展性低,需要实现所有的接口
 * **/
public class factory {
    public static void main(String[] a) {
        System.out.println("生产奔驰车1");
        //父类但对象子类的实例
        factory banzFactory = new factory();//创建一个C180工厂
        //调用父类的方法，这就是java多态的一种体现
        productAsCar  one =  banzFactory.createOne();
        one.carColor();//C180工厂生产车辆C180

        System.out.println("=========================================");
        System.out.println("生产奔驰车2");
        //调用父类的方法，这就是java多态的一种体现
        productAsCar  Two =  banzFactory.createOne();
        Two.carColor();//C180工厂生产车辆C180
    }


    /**
     *
     * 系列一 的汽车
     * **/
    public productAsCar createOne(){
        return new productCarOne();
    }
    /**
     *
     * 系列二 的汽车
     * **/
    public productAsCar createTwo(){
        return new productCarTwo();
    }
}
