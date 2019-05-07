package entrustPattern;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Notifier goodNotifier = new ConcreteNotifier();

        PlayingGameListener playingGameListener = new PlayingGameListener();

        WatchingTVListener watchingTVListener = new WatchingTVListener();

        goodNotifier.addListener(playingGameListener, "stopPlayingGame", new Date());

        goodNotifier.addListener(watchingTVListener, "stopWatchingTV", new Date());

        goodNotifier.notifyX();
    }
}
