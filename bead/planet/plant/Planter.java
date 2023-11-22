package planet.plant;

import planet.Planet;

public class Planter {

    private int[] plantCounts = new int[] { 0,0,100,0,0,0,0,0};
    private Planet planterLocation = Planet.EARTH;

    public int[] getPlantCounts() {
        return plantCounts;
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
}