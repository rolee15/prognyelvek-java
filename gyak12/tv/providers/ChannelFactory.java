package tv.providers;

import java.util.HashMap;
import java.util.Map;
import tv.Channel;
import tv.providers.Provider;

public class ChannelFactory {

    private static final Map<Provider, Channel> CHANNELS = new HashMap<>();
    static {
        CHANNELS.put(Provider.HBO, new Hbo());
        CHANNELS.put(Provider.SHOWTIME, new Showtime());
        CHANNELS.put(Provider.STARZ, new Starz());
    }

    public static Channel getChannel(Provider provider) {
        return CHANNELS.get(provider);
    }
}