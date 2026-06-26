package q4;

public class MyPoint {


            private double x;
    private double y;

    public MyPoint() {
        this(0, 0);
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

  
    public double getX() {
        return x;
    }

  
    public double getY() {
        return y;
    }

    public double distance(MyPoint other) {
        double dx = x - other.x;
        double dy = y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    /**
     * Static method to calculate the distance between two MyPoint objects.
     *
     * @param p1 The first MyPoint object.
     * @param p2 The second MyPoint object.
     * @return The distance between the two points.
     */
    public static double distance(MyPoint p1, MyPoint p2) {
        return p1.distance(p2);

    
}
}
