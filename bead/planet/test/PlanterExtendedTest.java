package planet.test;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import planet.Planet;
import planet.plant.Planter;

public class PlanterExtendedTest {

    Planter planter;

    @Test
    public void init2() {
        planter = new Planter(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });

        planter.growPlants();

        assertArrayEquals(new int[] { 1, 2, 6, 4, 5, 6, 7, 8 }, planter.getPlantCounts());
    }

    @Test
    public void encapsulation() {
        int[] counts = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };

        planter = new Planter(counts);
        counts[0] = 100;
        int[] counts2 = planter.getPlantCounts();
        counts2[3] = 200;

        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }, planter.getPlantCounts());
    }

    @Test
    public void init3() {
        planter = new Planter(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }, Planet.JUPITER);

        planter.growPlants();

        assertArrayEquals(new int[] { 1, 2, 3, 4, 10, 6, 7, 8 }, planter.getPlantCounts());
    }
}