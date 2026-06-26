/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.pkg2;
import java.util.Scanner;

public class Main {

    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;

        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[4][4];

        System.out.println("Enter a 4-by-4 matrix row by row:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        System.out.println("Sum of the elements in the major diagonal is "
                + sumMajorDiagonal(matrix));
    }
}
