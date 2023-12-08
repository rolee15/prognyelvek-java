package tv.providers;

import java.util.Arrays;
import tv.Channel;
import tv.Show;

class Starz extends ProviderBase implements Channel {

    public Starz() {
        name = "Starz";
        price = 10;
        shows = Arrays.asList(new Show("Outlander"), new Show("Battlestar Galactica"));
    }
}