package tv.providers;

import java.util.List;
import java.util.stream.Collectors;
import tv.Channel;
import tv.Show;

abstract class ProviderBase {

    protected String name;
    protected int price;
    protected List<Show> shows;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public List<Show> getShows() {
        return shows;
    }

    @Override
    public String toString() {
        var showsString = String.join(", ", shows.stream().map(s -> s.toString()).collect(Collectors.toList()));
        return "Name: " + name + ", price: " + price + ", shows: {" + showsString + "}";
    }
}