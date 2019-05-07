package builderPattern;

import java.util.ArrayList;
import java.util.List;
/**
 * 产品类, 由多个构建 构成
 * **/
public class Product {
    List<String> parts = new ArrayList<>();
    public  void  Add(String  part){
        parts.add(part);
    }
    public  void  show(){
        for (String parts: parts) {
            System.out.println(parts);
        }
    }
}
