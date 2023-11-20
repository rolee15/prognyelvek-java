package famous.sequence;

public class TriangularNumbers {

    public static int getTriangularNumber(int n) {
        if (n < 1) {
            return 0;
        }

        return n + getTriangularNumber(n - 1);
    }

    public static int getTriangularNumberAlternative(int n) {
        if (n < 1) {
            return 0;
        }

        return n * (n + 1) / 2;
    }
}