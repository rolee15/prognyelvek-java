package tv;

import tv.Show;
import tv.TvApp;
import tv.Wallet;
import tv.providers.*;

public class Main {

    public static void main(String[] args) {
        var wallet = new Wallet();
        var app = new TvApp(wallet);

        try {
            var show = app.searchShow("Game of Thrones");

            if (!show.isSubscribed()) {
                show.subscribe();
            }
            show.watch(System.out);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}