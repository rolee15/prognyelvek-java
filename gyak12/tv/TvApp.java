package tv;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import tv.Channel;
import tv.TvShow;
import tv.TvShowImpl;
import tv.Wallet;
import tv.providers.ChannelFactory;
import tv.providers.Provider;

public class TvApp {

    private final Wallet wallet;
    private final Map<Channel, Boolean> subscriptions;

    public TvApp(Wallet wallet) {
        this.wallet = wallet;
        subscriptions = new HashMap<Channel, Boolean>();

        subscriptions.put(ChannelFactory.getChannel(Provider.HBO), false);
        subscriptions.put(ChannelFactory.getChannel(Provider.SHOWTIME), false);
        subscriptions.put(ChannelFactory.getChannel(Provider.STARZ), false);
    }

    public List<TvShow> browseAllShows() {
        var list = new ArrayList<TvShow>();
        for (Channel channel : subscriptions.keySet()) {
            channel.getShows().forEach(show -> list.add(new TvShowImpl(show.getTitle(), channel)));
        }
        return list;
    }

    public TvShow searchShow(String name) throws ShowNotFoundException {
        for (Channel channel : subscriptions.keySet()) {
            for (Show show : channel.getShows()) {
                var title = show.getTitle();
                if (name.equals(title)) {
                    return new TvShowImpl(title, channel);
                }
            }
        }

        throw new ShowNotFoundException("Can't find show with given name: " + name);
    }

    public class ShowNotFoundException extends Exception {
        public ShowNotFoundException(String message) {
            super(message);
        }
    }
}