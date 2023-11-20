public class PointMain {
    
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(1, 1);
        p1.mirror(p1);

        System.out.println("Points:");
        System.out.println("p1: " + p1.ToString());
        System.out.println("p2: " + p2.ToString());
        System.out.println();
        
        System.out.println("translate p1 by +1,+1:");
        p1.move(1, 1);        
        System.out.println("p1: " + p1.ToString());

        System.out.println("distance of p1 from the origo:");
        double distance = p1.distance(new Point(0, 0));
        System.out.println(distance);
    }
}
