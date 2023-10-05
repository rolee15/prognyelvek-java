package famous.sequence;

public class Fibonacci {

    public static int fib(int n) {
        if (n <= 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static int fib2(int n) {
        if (n <= 0)
            return 0;
        
        if (n < 3)
            return 1;

        int prev1 = 1;
        int prev2 = 1;
        int aggr = 1;

        for (int i = 2; i < n; i++) {
            aggr = prev1 + prev2;
            prev1 = prev2;
            prev2 = aggr;
        }

        return aggr;
    }
}