package templatePattern;
/**
 * 定义一个操作中的算法的骨架,将一些不走延迟到子类中,
 * 模板方法使子类可以不改变一个算法的结构即可重新定义该算法的某些特定步骤
 **/
public abstract class topClass {
    public abstract  void  pringtOperation1();
    public abstract  void  pringtOperation2();
    public void TemplteMethod(){
        pringtOperation1();
        pringtOperation2();
        System.out.println("完毕");
    }
}
