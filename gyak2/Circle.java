public class Circle {
    
    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void enlarge(double f) {
        radius *= f;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
