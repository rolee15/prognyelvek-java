package math.operation.safe;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import math.operation.safe.Increment;

public class IncrementTest {

    @Test
    public void testIncrementZero() {
        assertEquals(1, Increment.increment(0));
    }

    @Test
    public void testIncrementIntMin() {
        assertEquals(Integer.MIN_VALUE + 1, Increment.increment(Integer.MIN_VALUE));
    }

    @Test
    public void testIncrementIntMax() {
        assertEquals(Integer.MAX_VALUE, Increment.increment(Integer.MAX_VALUE));
    }

    @Test
    public void testIncrementBigPositive() {
        assertEquals(1147000001, Increment.increment(1147000000));
    }

    @Test
    public void testIncrementBigNegative() {
        assertEquals(-1146999999, Increment.increment(-1147000000));
    }

    @Test
    public void testIncrementMinusOne() {
        assertEquals(0, Increment.increment(-1));
    }
}
