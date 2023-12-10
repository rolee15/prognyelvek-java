package tv;

import java.io.OutputStream;
import tv.Channel;

public interface TvShow {
    public String getTitle();
    public Boolean isSubscribed();
    public void subscribe() throws InsufficientFundsException;
    public Channel getChannel();
    public void watch(OutputStream out) throws TvShowImpl.NotSubscribedException;
}