package builderPattern;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * 建造者模式
 * 创建复杂对象的算法,  应该将将组成此对象的各个部分和装配方式 独立出来,  时 应用的模式
 * **/
public class client {
  /*  public static void main(String[] args) {
        director director =new director();
        Bulder bulderA = new builderA();
        director.construct(bulderA);
        Product product = bulderA.getResult();
        product.show();
    }*/
  private static class per {
      private  int age;
      private  String name;
      private Calendar c;
      public per(int age, String name,Calendar c){
            this.age = age;
            this.name = name;
            this.c = c;
      }
      public int getAge() {
          return age;
      }

      public void setAge(int age) {
          this.age = age;
      }

      public String getName() {
          return name;
      }

      public void setName(String name) {
          this.name = name;
      }

      public Calendar getC() {
          return c;
      }

      public void setC(Calendar c) {
          this.c = c;
      }

    /*  @Override
      public int compare(per o1, per o2) {
          if(o1.getC().after(o2.getC())){
              return 1;
          }else{
              return -1;
          }

      }*/
  }
  public static void main(String[] args) {
      per p1 = new per(1,"1",getC("1991-10-02 10:11:11"));
      per p2 = new per(2,"2", getC("1992-10-02 10:11:11"));
      per p3 = new per(3,"3", getC("1993-10-02 10:11:11"));
      per p4 = new per(4,"4", getC("1994-10-02 10:11:11"));
      per p5 = new per(5,"5", getC("1995-10-02 10:11:11"));

      List<per> list = new ArrayList();
      list.add(p5);
      list.add(p3);
      list.add(p2);
      list.add(p4);
      list.add(p1);
      list.sort((o1, o2) -> {
          if(o1.getC().after(o2.getC())){
              return -1;
          }else{
              return 1;
          }
      });
      System.out.println("下表"+list.get(0).getAge());
  }
  private static Calendar getC(String s){
      DateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//     int y = sf.getCalendar().get(Calendar.YEAR);
//     System.out.println(y);
      Calendar c1=Calendar.getInstance();
      try {
          c1.setTime(sf.parse(s));
      } catch (ParseException e) {
          e.printStackTrace();
      }
      System.out.println(c1.get(Calendar.YEAR));
      return c1;
  }
}
