package tv;

import java.io.OutputStream;
import tv.Show;

class TvShowImpl extends Show implements TvShow {

    private final Channel channel;

    public TvShowImpl(String title, Channel channel) {
        super(title);
        this.channel = channel;
    }

    public Boolean isSubscribed() {
        return false;
    }

    public void subscribe() {

    }

    public Channel getChannel() {
        return null;
    }

    public void watch(OutputStream out) {

    }
}