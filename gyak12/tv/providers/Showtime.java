package tv.providers;

import java.util.Arrays;
import tv.Channel;
import tv.Show;

class Showtime extends ProviderBase implements Channel {

    public Showtime() {
        name = "Showtime";
        price = 7;
        shows = Arrays.asList(new Show("Shameless"));
    }
}