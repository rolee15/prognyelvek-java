package planet.plant;

import java.util.Arrays;
import planet.Planet;

public class Planter {

    private static final int PLANET_COUNT = 8;

    private int[] plantCounts;
    private Planet planterLocation = Planet.EARTH;

    public Planter() {
        plantCounts = new int[] { 0, 0, 100, 0, 0, 0, 0, 0 };
    }

    public Planter(int[] plantCounts) {
        if (plantCounts.length != PLANET_COUNT) {
            throw new IllegalArgumentException("Invalid plantCounts length: " + plantCounts.length);
        }
        this.plantCounts = Arrays.copyOf(plantCounts, PLANET_COUNT);
    }

    public Planter(int[] plantCounts, Planet planterLocation) {
        if (plantCounts.length != PLANET_COUNT) {
            throw new IllegalArgumentException("Invalid plantCounts length: " + plantCounts.length);
        }
        this.plantCounts = Arrays.copyOf(plantCounts, PLANET_COUNT);
        this.planterLocation = planterLocation;
    }

    public int[] getPlantCounts() {
        return Arrays.copyOf(plantCounts, PLANET_COUNT);
    }

    public int getPlantCount(Planet planet) {
        return plantCounts[planet.ordinal()];
    }

    public void addPlant(Planet planet) {
        plantCounts[planet.ordinal()]++;
        planterLocation = planet;
    }

    public void movePlants(int count, Planet source, Planet target) {
        if (plantCounts[source.ordinal()] < count) {
            throw new IllegalArgumentException("Not enough plants on " + target.niceName() + ": " + count);
        }

        plantCounts[source.ordinal()] -= count;
        plantCounts[target.ordinal()] += count;
        planterLocation = target;
    }

    public void growPlants() {
        plantCounts[planterLocation.ordinal()] *= 2;
    }

    public void growPlantsByDistanceFrom(Planet planet) {
        for (int i = 0; i < plantCounts.length; i++) {
            plantCounts[i] += Math.abs(i - planet.ordinal());
        }
    }
}