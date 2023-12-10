package tv;

import java.io.OutputStream;
import java.io.PrintWriter;
import tv.Show;

public class TvShowImpl extends Show implements TvShow {

    private final Channel channel;
    private final TvApp app;

    public TvShowImpl(String title, Channel channel, TvApp app) {
        super(title);
        this.channel = channel;
        this.app = app;
    }

    public Boolean isSubscribed() {
        return app.isSubscribed(channel);
    }

    public void subscribe() throws InsufficientFundsException {
        app.subscribe(channel);
    }

    public Channel getChannel() {
        return channel;
    }

    public void watch(OutputStream out) throws NotSubscribedException {
        if (!isSubscribed()) {
            throw new NotSubscribedException("Not subscribed to "
                + channel.getName());
        }

        var writer = new PrintWriter(out);
        writer.println("You are watching " + getTitle() + " on "
            + channel.getName());
        writer.flush();
    }

    public class NotSubscribedException extends Exception {
        public NotSubscribedException(String message) {
            super(message);
        }
    }
}