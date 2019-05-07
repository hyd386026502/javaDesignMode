package proxyPattern;

public class giverMan implements  giver{
    private  user user = null;
    public giverMan(user user){
        this.user = user;
    }
    @Override
    public void giveApper() {
        System.out.println(user.getName()+"送你苹果");
    }

    @Override
    public void givePen() {
        System.out.println(user.getName()+"送你铅笔");
    }

    @Override
    public void givePhone() {
        System.out.println(user.getName()+"送你手机");
    }
}
