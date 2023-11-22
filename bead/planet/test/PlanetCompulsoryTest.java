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

    @ParameterizedTest
    @EnumSource(value = Planet.class, names = {"MERCURY", "MARS", "SATURN", "NEPTUNE"})
    public void addPlant(Planet somePlanet) {
        planter.addPlant(Planet.EARTH);

        assertEquals(101, planter.getPlantCount(Planet.EARTH));
        assertEquals(0, planter.getPlantCount(somePlanet));
    }

    @ParameterizedTest
    @EnumSource(value = Planet.class, names = {"MERCURY", "MARS", "SATURN", "NEPTUNE"})
    public void growOnEarth(Planet somePlanet) {
        planter.growPlants();

        assertEquals(200, planter.getPlantCount(Planet.EARTH));
        assertEquals(0, planter.getPlantCount(somePlanet));
    }

    @Test
    public void growMoveThenGrow() {
        planter.movePlants(30, Planet.EARTH, Planet.MARS);
        planter.movePlants(20, Planet.EARTH, Planet.NEPTUNE);
        planter.movePlants(15, Planet.MARS, Planet.NEPTUNE);
        planter.growPlants();

        assertEquals(50, planter.getPlantCount(Planet.EARTH));
        assertEquals(15, planter.getPlantCount(Planet.MARS));
        assertEquals(70, planter.getPlantCount(Planet.NEPTUNE));
    }
}