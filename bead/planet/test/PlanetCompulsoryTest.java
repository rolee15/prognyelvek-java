package planet.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import planet.Planet;
import planet.plant.Planter;

public class PlanetCompulsoryTest {

    private Planter planter;

    @BeforeEach
    public void setup() {
        planter = new Planter();
    }

    @ParameterizedTest
    @EnumSource(value = Planet.class, names = {"MERCURY", "MARS", "SATURN", "NEPTUNE"})
    public void init(Planet somePlanet) {
        assertEquals(100, planter.getPlantCount(Planet.EARTH));
        assertEquals(0, planter.getPlantCount(somePlanet));
    }
}