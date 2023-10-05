package plane.but.not.flying;

import plane.PublicCircle;
import plane.Circle;

public class CircleMain {

    public static void main(String[] args) {
        PublicCircle c = new PublicCircle();

        System.out.println("PublicCircle area: " + c.getArea());

        c.x = 5;
        c.y = 2;
        c.radius = 10;

        System.out.println("PublicCircle new area: " + c.getArea());


        try {
            Circle c2 = new Circle(0, 0, -1);
            c2.setX(-5);
            c2.setY(2);
            c2.setRadius(-10);
        }
        catch (IllegalArgumentException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
}