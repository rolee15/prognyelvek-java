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
    public void testFibonacci6() {
        assertEquals(8, Fibonacci.fib(6));
    }


    @Test
    public void testFib2_0() {
        assertEquals(0, Fibonacci.fib2(0));
    }

    @Test
    public void testFib2_negative() {
        assertEquals(0, Fibonacci.fib2(-1));
    }

    @Test
    public void testFib2_1() {
        assertEquals(1, Fibonacci.fib2(1));
    }

    @Test
    public void testFib2_2() {
        assertEquals(1, Fibonacci.fib2(2));
    }

    @Test
    public void testFib2_3() {
        assertEquals(2, Fibonacci.fib2(3));
    }

    @Test
    public void testFib2_4() {
        assertEquals(3, Fibonacci.fib2(4));
    }

    @Test
    public void testFib2_5() {
        assertEquals(5, Fibonacci.fib2(5));
    }
    
    @Test
    public void testFib2_6() {
        assertEquals(8, Fibonacci.fib2(6));
    }
    
    @Test
    public void testFib2_7() {
        assertEquals(13, Fibonacci.fib2(7));
    }
}