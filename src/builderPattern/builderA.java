package builderPattern;

public class builderA extends Bulder{
    private Product  p = new Product();
    @Override
    public void buildPartA() {
        p.Add("部件A");
        System.out.println("建造部件A");
    }

    @Override
    public void buildPartB() {
        p.Add("部件B");
        System.out.println("建造部件B");
    }

    @Override
    public Product getResult() {
        return p;
    }
}
