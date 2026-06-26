/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.pkg1;

 import java.util.Scanner;
public class Main {
     
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[3][4];

        System.out.println("Enter a 3-by-4 matrix row by row:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        for (int col = 0; col < matrix[0].length; col++) {
            System.out.println("Sum of column " + col + " is " +
                    sumColumn(matrix, col));
        }
    }
}  

