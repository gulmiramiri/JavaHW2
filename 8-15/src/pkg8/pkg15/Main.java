/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.pkg15;


import java.util.Scanner;

public class Main {

    public static boolean sameLine(double[][] points) {

        if (points.length < 2) return true;

        double x0 = points[0][0];
        double y0 = points[0][1];

        double x1 = points[1][0];
        double y1 = points[1][1];

        for (int i = 2; i < points.length; i++) {

            double x = points[i][0];
            double y = points[i][1];

            double cross =
                    (x1 - x0) * (y - y0) -
                    (y1 - y0) * (x - x0);

            if (cross != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[][] points = new double[5][2];

        System.out.println("Enter 5 points (x y):");

        for (int i = 0; i < 5; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        System.out.println("Same line? " + sameLine(points));
    }
}