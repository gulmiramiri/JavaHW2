package linear;

import java.util.Scanner;

public class Linear{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = input.nextDouble();

        System.out.print("Enter b: ");
        double b = input.nextDouble();

        System.out.print("Enter c: ");
        double c = input.nextDouble();

        System.out.print("Enter d: ");
        double d = input.nextDouble();

        System.out.print("Enter e: ");
        double e = input.nextDouble();

        System.out.print("Enter f: ");
        double f = input.nextDouble();

        LinearEquation eq = new LinearEquation(a, b, c, d, e, f);

        if (eq.isSolvable()) {
            System.out.println("x = " + eq.getX());
            System.out.println("y = " + eq.getY());
        } else {
            System.out.println("The equation has no solution.");
        }
    }
}