package proxyPattern;

public class client {
    public static void main(String[] args) {
        user use = new user();
        proxy proxy = new proxy(use);
        proxy.giveApper();
        proxy.givePen();
        proxy.givePhone();
    }

}
