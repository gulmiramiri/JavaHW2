package uselinear;
import java.util.Scanner;

public class UseLinear {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1, y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter x2, y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.print("Enter x3, y3: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        System.out.print("Enter x4, y4: ");
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        // Convert to linear equations:
        // Line 1: (y1 - y2)x + (x2 - x1)y = (y1 - y2)x1 + (x2 - x1)y1
        double a = (y1 - y2);
        double b = (x2 - x1);
        double e = (y1 - y2) * x1 + (x2 - x1) * y1;

        // Line 2: (y3 - y4)x + (x4 - x3)y = (y3 - y4)x3 + (x4 - x3)y3
        double c = (y3 - y4);
        double d = (x4 - x3);
        double f = (y3 - y4) * x3 + (x4 - x3) * y3;

        LinearEquation eq = new LinearEquation(a, b, c, d, e, f);

        if (eq.isSolvable()) {
            System.out.println("Intersecting Point:");
            System.out.println("x = " + eq.getX());
            System.out.println("y = " + eq.getY());
        } else {
            System.out.println("The lines do not intersect (no solution).");
        }
    }
}