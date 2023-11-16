package famous.sequence;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import famous.sequence.TriangularNumbers;

public class TriangularNumbersTest {

    @Test
    public void testTriangular0() {
        assertEquals(0, TriangularNumbers.getTriangularNumber(0));
    }

    @Test
    public void testTriangular1() {
        assertEquals(1, TriangularNumbers.getTriangularNumber(1));
    }

    @Test
    public void testTriangular2() {
        assertEquals(3, TriangularNumbers.getTriangularNumber(2));
    }

    @Test
    public void testTriangular3() {
        assertEquals(6, TriangularNumbers.getTriangularNumber(3));
    }

    @Test
    public void testTriangular4() {
        assertEquals(10, TriangularNumbers.getTriangularNumber(4));
    }

    @Test
    public void testTriangular100() {
        assertEquals(5050, TriangularNumbers.getTriangularNumber(100));
    }

    @Test
    public void testTriangularMinusOne() {
        assertEquals(0, TriangularNumbers.getTriangularNumber(-1));
    }

    @Test
    public void testTriangularMinusAny() {
        assertEquals(0, TriangularNumbers.getTriangularNumber(-100));
    }

}