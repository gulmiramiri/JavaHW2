/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.pkg14;


import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter size of square matrix: ");
        int n = input.nextInt();

        int[][] m = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = rand.nextInt(2);
            }
        }

        System.out.println("Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            if (allSameRow(m, i))
                System.out.println("Row " + i + " has all same values");
        }

        for (int j = 0; j < n; j++) {
            if (allSameCol(m, j))
                System.out.println("Column " + j + " has all same values");
        }

        if (allSameMainDiagonal(m))
            System.out.println("Main diagonal has all same values");

        if (allSameAntiDiagonal(m))
            System.out.println("Sub diagonal has all same values");
    }

    public static boolean allSameRow(int[][] m, int row) {
        for (int j = 1; j < m[row].length; j++) {
            if (m[row][j] != m[row][0])
                return false;
        }
        return true;
    }

    public static boolean allSameCol(int[][] m, int col) {
        for (int i = 1; i < m.length; i++) {
            if (m[i][col] != m[0][col])
                return false;
        }
        return true;
    }

    public static boolean allSameMainDiagonal(int[][] m) {
        for (int i = 1; i < m.length; i++) {
            if (m[i][i] != m[0][0])
                return false;
        }
        return true;
    }

    public static boolean allSameAntiDiagonal(int[][] m) {
        int n = m.length;
        for (int i = 1; i < n; i++) {
            if (m[i][n - 1 - i] != m[0][n - 1])
                return false;
        }
        return true;
    }
}