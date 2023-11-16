package math.operation.safe;

public class Increment {

    public static int increment(int n) {

        if (n < Integer.MAX_VALUE) {
            n++;
        }

        return n;
    }
}
