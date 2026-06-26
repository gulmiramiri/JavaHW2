
import java.util.Scanner;

public class SolveQuadraticEquations {

    public static int solveQuadratic(double[] eqn, double[] roots) {
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
            roots[1] = (-b - Math.sqrt(discriminant)) / (2 * a);
            return 2;
        } else if (discriminant == 0) {
            roots[0] = -b / (2 * a);
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] eqn = new double[3];
        double[] roots = new double[2];

        System.out.print("Enter a, b, and c: ");
        eqn[0] = input.nextDouble();
        eqn[1] = input.nextDouble();
        eqn[2] = input.nextDouble();

        int numberOfRoots = solveQuadratic(eqn, roots);

        System.out.println("Number of real roots: " + numberOfRoots);

        if (numberOfRoots == 2) {
            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);
        } else if (numberOfRoots == 1) {
            System.out.println("Root: " + roots[0]);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}