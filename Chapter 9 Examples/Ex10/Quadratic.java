package quadratic;
import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // user input
        System.out.print("Enter a: ");
        double a = input.nextDouble();

        System.out.print("Enter b: ");
        double b = input.nextDouble();

        System.out.print("Enter c: ");
        double c = input.nextDouble();

        QuadraticEquation eq = new QuadraticEquation(a, b, c);

        double discriminant = eq.getDiscriminant();

        if (discriminant > 0) {
            System.out.println("Root 1: " + eq.getRoot1());
            System.out.println("Root 2: " + eq.getRoot2());
        } 
        else if (discriminant == 0) {
            System.out.println("Single Root: " + eq.getRoot1());
        } 
        else {
            System.out.println("The equation has no roots.");
        }
    }
}