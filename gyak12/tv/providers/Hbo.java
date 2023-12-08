package tv.providers;

import java.util.Arrays;
import tv.Channel;
import tv.Show;

class Hbo extends ProviderBase implements Channel {

    public Hbo() {
        name = "HBO";
        price = 5;
        shows = Arrays.asList(new Show("Game of Thrones"), new Show("Westworld"));
    }
}