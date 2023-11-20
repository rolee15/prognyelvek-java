package famous.sequence;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import famous.sequence.Fibonacci;

public class FibonacciTest {

    @Test
    public void testFibonacci1() {
        assertEquals(1, Fibonacci.fib(1));
    }

    @Test
    public void testFibonacci2() {
        assertEquals(1, Fibonacci.fib(2));
    }


    @Test
    public void testFibonacci3() {
        assertEquals(8, Fibonacci.fib(6));
    }
}