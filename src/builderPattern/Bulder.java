package builderPattern;
/**
 * 建造者类,
 * **/
public abstract class Bulder {

    public abstract void  buildPartA();
    public abstract void  buildPartB();
    public abstract Product  getResult();
}
