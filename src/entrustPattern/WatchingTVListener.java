package entrustPattern;

import java.util.Date;

public class WatchingTVListener {
    public WatchingTVListener()
    {
        System.out.println("watching TV");
    }

    public void stopWatchingTV(Date date)
    {
        System.out.println("stop watching" + date);
    }
}
