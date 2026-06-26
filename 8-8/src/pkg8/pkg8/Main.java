/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.pkg8;

public class Main {


    public static void main(String[] args) {

        double[][] points = {
            {-1, 0},
            {3, 1},
            {3, 1},
            {2, 0.5},
            {3.5, 2},
            {3, 1},
            {-1.5, 4},
            {5, 4}
        };

        double minDistance = Double.MAX_VALUE;

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {

                double d = distance(points[i][0], points[i][1],
                                    points[j][0], points[j][1]);

                if (d < minDistance) {
                    minDistance = d;
                }
            }
        }

        System.out.println("Minimum distance: " + minDistance);
        System.out.println("Closest pairs:");

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {

                double d = distance(points[i][0], points[i][1],
                                    points[j][0], points[j][1]);

                if (Math.abs(d - minDistance) < 1E-10) {
                    System.out.println(
                        "(" + points[i][0] + ", " + points[i][1] + ") and "
                      + "(" + points[j][0] + ", " + points[j][1] + ")"
                    );
                }
            }
        }
    }

    public static double distance(
            double x1, double y1,
            double x2, double y2) {

        return Math.sqrt(
                Math.pow(x2 - x1, 2) +
                Math.pow(y2 - y1, 2));
    }
}