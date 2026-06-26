/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.pkg21;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of cities: ");
        int n = input.nextInt();

        double[][] city = new double[n][2];

        System.out.println("Enter coordinates (x y):");
        for (int i = 0; i < n; i++) {
            city[i][0] = input.nextDouble();
            city[i][1] = input.nextDouble();
        }

        double minTotalDistance = Double.MAX_VALUE;
        int central = 0;

        for (int i = 0; i < n; i++) {

            double total = 0;

            for (int j = 0; j < n; j++) {
                total += distance(city[i], city[j]);
            }

            if (total < minTotalDistance) {
                minTotalDistance = total;
                central = i;
            }
        }

        System.out.println("Central city is: " + central);
        System.out.println("Total distance: " + minTotalDistance);
    }

    public static double distance(double[] a, double[] b) {
        return Math.sqrt(Math.pow(a[0] - b[0], 2) +
                         Math.pow(a[1] - b[1], 2));
    }
}