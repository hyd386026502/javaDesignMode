package proxyPattern;
/**
 * 代理
 * 为其他对象 提供一种代理 来控制对这个对象的访问 **/
public class proxy implements giver {
    private  giverMan giverMan = null;
    public proxy(user user){
        this.giverMan =  new giverMan(user);
    }
    @Override
    public void giveApper() {
        giverMan.giveApper();
    }

    @Override
    public void givePen() {
       giverMan.givePen();
    }

    @Override
    public void givePhone() {
        giverMan.givePhone();
    }
}
