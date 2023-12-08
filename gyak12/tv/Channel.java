package tv;

import java.util.List;
import tv.Show;

public interface Channel {
    public String getName();
    public int getPrice();
    public List<Show> getShows();
}