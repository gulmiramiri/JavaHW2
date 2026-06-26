/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.pkg19;
import java.util.Scanner;

public class Main {

    public static boolean isConsecutiveFour(int[][] values) {

        int rows = values.length;
        int cols = values[0].length;

        // horizontal
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= cols - 4; j++) {
                if (same(values[i][j], values[i][j+1], values[i][j+2], values[i][j+3]))
                    return true;
            }
        }

        // vertical
        for (int i = 0; i <= rows - 4; i++) {
            for (int j = 0; j < cols; j++) {
                if (same(values[i][j], values[i+1][j], values[i+2][j], values[i+3][j]))
                    return true;
            }
        }

        // diagonal (top-left to bottom-right)
        for (int i = 0; i <= rows - 4; i++) {
            for (int j = 0; j <= cols - 4; j++) {
                if (same(values[i][j], values[i+1][j+1], values[i+2][j+2], values[i+3][j+3]))
                    return true;
            }
        }

        // diagonal (top-right to bottom-left)
        for (int i = 0; i <= rows - 4; i++) {
            for (int j = 3; j < cols; j++) {
                if (same(values[i][j], values[i+1][j-1], values[i+2][j-2], values[i+3][j-3]))
                    return true;
            }
        }

        return false;
    }

    private static boolean same(int a, int b, int c, int d) {
        return (a == b && b == c && c == d);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = input.nextInt();

        System.out.print("Enter columns: ");
        int cols = input.nextInt();

        int[][] values = new int[rows][cols];

        System.out.println("Enter matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                values[i][j] = input.nextInt();
            }
        }

        System.out.println("Has four consecutive? " + isConsecutiveFour(values));
    }
}