package string.utils;

public class IterLetter {

    private String s;
    private int p = 0;
    private boolean firstCall = true;

    public IterLetter(String s) {
        if (s == null)
            throw new IllegalArgumentException("s must not be null");
    }

    public void printNext() {
        if (firstCall) {
            System.out.println();
            firstCall = false;
        }

        if (p >= s.length()) {
            System.out.println();
            return;
        }

        System.out.println(s[p++]);
    }
}