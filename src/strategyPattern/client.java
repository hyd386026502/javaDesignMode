package strategyPattern;
/**
 * 在不同时间或不同情况应用不同的业务规则,策略模式的特点
 *
 * 将客户端压力转到服务器
 **/
public class client {
    static Context context =null;
    public static void main(String[] args) {
        getresult(3);
    }
    private static void getresult(int i){
        switch (i){
            case 1: context = new Context(new algorithmA());
                break;
            case 2:context = new Context(new algorithmB());
                break;
            case 3:context = new Context(new algorithmC());
                break;
        }
        context.getAlgorithm();
    }


}
