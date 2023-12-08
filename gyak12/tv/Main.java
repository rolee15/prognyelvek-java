package tv;

import tv.Show;
import tv.TvApp;
import tv.Wallet;
import tv.providers.*;

public class Main {

    public static void main(String[] args) {
        var app = new TvApp(new Wallet());

        for (var show : app.browseAllShows())
            System.out.println(show);
    }
}