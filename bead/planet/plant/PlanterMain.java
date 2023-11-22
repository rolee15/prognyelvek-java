package planet.plant;

import planet.Planet;
import planet.plant.Planter;

public class PlanterMain {

    private static Planter planter = new Planter();

    public static void main(String[] args) {

        for (int count : planter.getPlantCounts()) {
            System.out.print(count + " ");
        }
        System.out.println();

        planter.addPlant(Planet.MERCURY);
        planter.addPlant(Planet.NEPTUNE);
        planter.addPlant(Planet.NEPTUNE);
        planter.movePlants(10, Planet.EARTH, Planet.MERCURY);
        planter.growPlants();
        printSomePlanets();
    }

    private static void printSomePlanets() {
        printPlanet(Planet.EARTH);
        printPlanet(Planet.MERCURY);
        printPlanet(Planet.NEPTUNE);
    }

    private static void printPlanet(Planet planet) {
        System.out.println("Number of plants on " + planet.toString() + ": " + planter.getPlantCount(planet));
    }
}