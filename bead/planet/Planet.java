package planet;

public enum Planet {
    MERCURY,
    VENUS,
    EARTH,
    MARS,
    JUPITER,
    SATURN,
    URANUS,
    NEPTUNE;

    public String niceName() {
        switch (this) {
            case MERCURY:
                return "Mercury";
            case VENUS:
                return "Venus";
            case EARTH:
                return "Earth";
            case MARS:
                return "Mars";
            case JUPITER:
                return "Jupiter";
            case SATURN:
                return "Saturn";
            case URANUS:
                return "Uranus";
            case NEPTUNE:
                return "Neptune";
            default:
                return null;
        }
    }
}