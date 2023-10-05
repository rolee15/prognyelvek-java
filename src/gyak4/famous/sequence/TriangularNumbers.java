package famous.sequence;

public class TriangularNumbers {

    public static int getTriangularNumber(int n) {
        int acc = 0;
        for (int i = 1; i <= n; i++) {
            acc += i;
        }

        return acc;
    }
}