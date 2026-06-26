/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.pkg13;

import java.util.Scanner;
public class Main {


    public static int[] locateLargest(double[][] a) {

        int row = 0;
        int col = 0;
        double max = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                if (a[i][j] > max) {
                    max = a[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        return new int[]{row, col};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();

        double[][] array = new double[rows][cols];

        System.out.println("Enter the array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = input.nextDouble();
            }
        }

        int[] location = locateLargest(array);

        System.out.println("Largest element is at (" + location[0] + ", " + location[1] + ")");
    }
}