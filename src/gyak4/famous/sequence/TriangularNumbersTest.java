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