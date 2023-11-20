package plane;

public class PublicCircle {

    public double x = 0;
    public double y = 0;
    public double radius = 1;

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}