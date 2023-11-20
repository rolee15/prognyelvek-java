package point2d;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public void mirror(Point other) {
        x -= other.x - x;
        y -= other.y - y;
    }

    public double distance(Point other) {
        double a = Math.abs(x - other.x);
        double b = Math.abs(y - other.y);
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        return c;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString() {
        return "x:" + x + " y: " + y;
    }
}