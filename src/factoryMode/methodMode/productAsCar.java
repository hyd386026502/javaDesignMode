package factoryMode.methodMode;
/**
 * 定义产品(汽车)规范 ,
 *接口: 抽象方法和全局变量的集合
 *  可以实现多个接口
 *  只能继承一个类
 *   一个接口可以定义多个抽象类,  一个抽象类中也可以定义多个接口, 子类中 必须继承 如下:
 *       interface A{    // 定义接口
                 public void printA() ;  // 抽象方法
                 abstract class B{   // 定义内部抽象类
                 public abstract void printB() ; // 定义抽象方法
                 }
         };

         class X implements A{   // 实现接口
             public void printA(){
             System.out.println("HELLO --> A") ;
             }

             class Y extends B{  // 继承抽象类  , 不写就不继承;   抽象类中有多个接口亦然
                 public void printB(){
                 System.out.println("HELLO --> B") ;
                 }
              };
         };
         public class InnerExtDemo02{
             public static void main(String args[]){
             A.B b = new X().new Y() ;
             b.printB() ;
             }
         };
 *
 *
 * 抽象类中:
 *   又构造方法,变量, 抽象方法, 普通方法常量,  组成,
 *   为一个模板
 *
 * 也可以在使用抽象类来继承, 抽象类中定义一些变量,和共同方法来使子类公用, 提升代码复用性,
 *
 *
 *
 *  小汽车的 接口
 * **/
public interface productAsCar {
    public final  int finish = 1;  //全局使用 抽象类中定一些变量,使用get  set 方法, 或一些子类公用的方法并实现, 实现代码复用性

    public abstract void carColor();
    public abstract void carName();
    public abstract void carPrice();
}
