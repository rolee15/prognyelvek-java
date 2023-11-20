package planet.structure;

import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import check.CheckThat;

public class PlanterExtendedStructureTest {
    @BeforeAll
    public static void init() {
        CheckThat.theClass("planet.plant.Planter")
            .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL);
    }

    @Test
    public void constructor02() {
        it.hasConstructor(withArgs("array of int"))
            .thatIs(VISIBLE_TO_ALL);
    }

    @Test
    public void constructor03() {
        it.hasConstructor(withArgs("array of int", "planet.Planet"))
            .thatIs(VISIBLE_TO_ALL);
    }

    @Test
    public void methodGetPlantCounts() {
        it.hasMethod("getPlantCounts", withNoParams())
            .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
            .thatReturns("array of int");
    }
    
    @Test
    public void methodGrowPlantsByDistanceFrom() {
        it.hasMethod("growPlantsByDistanceFrom", withParams("planet.Planet"))
        .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
        .thatReturnsNothing();
    }
}

