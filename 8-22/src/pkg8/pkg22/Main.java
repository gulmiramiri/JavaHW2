/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.pkg22;
import java.util.Random;


public class Main {

    public static void main(String[] args) {

        int[][] m = new int[6][6];
        Random rand = new Random();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                m[i][j] = rand.nextInt(2);
            }
        }

        System.out.println("Matrix:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        boolean allEven = true;

        // rows
        for (int i = 0; i < 6; i++) {
            int sum = 0;
            for (int j = 0; j < 6; j++) {
                sum += m[i][j];
            }
            if (sum % 2 != 0) {
                allEven = false;
            }
        }

        // columns
        for (int j = 0; j < 6; j++) {
            int sum = 0;
            for (int i = 0; i < 6; i++) {
                sum += m[i][j];
            }
            if (sum % 2 != 0) {
                allEven = false;
            }
        }

        System.out.println("Every row and column has even number of 1s? " + allEven);
    }
}