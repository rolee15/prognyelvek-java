package race.car;

import java.util.Arrays;

public class WrongSectorTimer1 {

    public int[] sectorTimes;

    public WrongSectorTimer1(int[] times) {
        sectorTimes = Arrays.copyOf(times, times.length);
    }
}