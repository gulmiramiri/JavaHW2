/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.pkg10;
import java.util.Random;
public class Main {



    public static void main(String[] args) {

        int[][] matrix = new int[4][4];
        Random rand = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(2);
            }
        }

        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int maxRow = 0;
        int rowIndex = 0;

        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            if (sum > maxRow) {
                maxRow = sum;
                rowIndex = i;
            }
        }

        int maxCol = 0;
        int colIndex = 0;

        for (int j = 0; j < matrix[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][j];
            }
            if (sum > maxCol) {
                maxCol = sum;
                colIndex = j;
            }
        }

        System.out.println("Row with most 1s: " + rowIndex);
        System.out.println("Column with most 1s: " + colIndex);
    }
}