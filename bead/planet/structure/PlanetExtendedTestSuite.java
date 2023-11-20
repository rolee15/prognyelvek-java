package planet.structure;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import planet.test.PlanterExtendedTest;

@Suite
@SelectClasses({
    PlanterExtendedStructureTest.class,
    PlanterExtendedTest.class,
    PlanetCompulsoryTestSuite.class
})
public class PlanetExtendedTestSuite {}
