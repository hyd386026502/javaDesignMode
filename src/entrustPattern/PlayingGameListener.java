package entrustPattern;

import java.util.Date;

public class PlayingGameListener {
    public PlayingGameListener()
    {
        System.out.println("playing");
    }

    public void stopPlayingGame(Date date)
    {
        System.out.println("stop playing" + date);
    }
}
