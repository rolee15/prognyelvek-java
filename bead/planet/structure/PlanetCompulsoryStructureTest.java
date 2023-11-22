package planet.structure;

import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import check.CheckThat;

import planet.Planet;

public class PlanetCompulsoryStructureTest {
    @Test
    public void testEnum() {
        CheckThat.theEnum("planet.Planet")
            .hasEnumElements("MERCURY", "VENUS", "EARTH", "MARS", "JUPITER", "SATURN", "URANUS", "NEPTUNE");
    }
}

