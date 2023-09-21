public class DistanceMain {
    
    public static void main(String[] args) {
        
        if (args.length % 2 != 0) {
            System.err.println("Odd number of coordinates in arguments!");
            return;
        }

        double distance = 0;
        Point prevPoint = null;
        for (int i = 0; i < args.length; i += 2) {
            double x = Double.parseDouble(args[i]);
            double y = Double.parseDouble(args[i + 1]);
            Point p = new Point(x, y);

            if (prevPoint != null) {
                distance += p.distance(prevPoint);
            }

            prevPoint = p;
        }

        System.out.println(distance);
    }
}
