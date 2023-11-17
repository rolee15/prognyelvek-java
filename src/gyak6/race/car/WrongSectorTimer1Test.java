package race.car;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;

import race.car.WrongSectorTimer1;

public class WrongSectorTimer1Test {

    private WrongSectorTimer1 sut;

    @BeforeEach
    public void setup() {
        int[] times = { 1, 2, 3 };
        sut = new WrongSectorTimer1(times);
    }

    @Test
    public void seemsGood() {
        assertArrayEquals(new int [] {1, 2, 3}, sut.sectorTimes);
    }

    @Test
    public void setArrayElemsBreaksEncapsulation() {
        sut.sectorTimes[0] = 4;
        sut.sectorTimes[1] = 5;
        sut.sectorTimes[2] = 6;
        assertEquals(3, sut.sectorTimes.length);
        assertArrayEquals(new int [] {4, 5, 6}, sut.sectorTimes);
    }


    @Test
    public void setArrayElemsBreaksEncapsulation2() {
        sut.sectorTimes = new int[] { 4, 5, 6, 7};
        assertEquals(4, sut.sectorTimes.length);
        assertArrayEquals(new int [] {4, 5, 6, 7}, sut.sectorTimes);
    }
}