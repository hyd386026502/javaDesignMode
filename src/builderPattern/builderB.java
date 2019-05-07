package builderPattern;

public class builderB extends Bulder{
    private  Product product = new Product();
    @Override
    public void buildPartA() {
        product.Add("部件x");
        System.out.println("建造部件x");
    }

    @Override
    public void buildPartB() {
        product.Add("部件Y");
        System.out.println("建造部件Y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
