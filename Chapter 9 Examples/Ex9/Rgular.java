package rgular;
public class Rgular {

    public static void main(String[] args) {

        // 1. no-arg constructor
        Reqular p1 = new Reqular();

        // 2. n=6, side=4
     Reqular p2 = new Reqular(6, 4);

        // 3. n=10, side=4, x=5.6, y=7.8
       Reqular p3 = new Reqular(10, 4, 5.6, 7.8);

        // Display results
        System.out.println("Polygon 1:");
        System.out.println("Perimeter: " + p1.getPerimeter());
        System.out.println("Area: " + p1.getArea());

        System.out.println("\nPolygon 2:");
        System.out.println("Perimeter: " + p2.getPerimeter());
        System.out.println("Area: " + p2.getArea());

        System.out.println("\nPolygon 3:");
        System.out.println("Perimeter: " + p3.getPerimeter());
        System.out.println("Area: " + p3.getArea());
    }
}
