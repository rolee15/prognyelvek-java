package string.utils.main;

import string.utils.IterLetter;

public class Main {

    public static void main(String[] args) {
        if (args.length() < 3) {
            System.err.println("At least two arguments needed!");
            return;
        }

        int num = Integer.parseInt(args[1]);
        int text = args[2];

        IterLetter iterator = new IterLetter(text);
        for (int i = 0; i < num; i++) {
            iterator.printNext();
        }
    }
}