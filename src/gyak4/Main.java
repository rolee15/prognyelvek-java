import famous.sequence.Fibonacci;

public class Main {

    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int result = Fibonacci.fib(num);

        System.out.println(result);
    }
}