/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.pkg24;

public class Main {

    public static boolean isValid(int[][] grid) {

        for (int i = 0; i < 9; i++) {
            if (!validSet(grid[i])) return false;
        }

        for (int j = 0; j < 9; j++) {
            int[] col = new int[9];
            for (int i = 0; i < 9; i++) {
                col[i] = grid[i][j];
            }
            if (!validSet(col)) return false;
        }

        for (int block = 0; block < 9; block++) {
            int[] box = new int[9];
            int index = 0;

            int rowStart = (block / 3) * 3;
            int colStart = (block % 3) * 3;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    box[index++] = grid[rowStart + i][colStart + j];
                }
            }

            if (!validSet(box)) return false;
        }

        return true;
    }

    static boolean validSet(int[] arr) {
        boolean[] seen = new boolean[10];

        for (int v : arr) {
            if (v < 1 || v > 9 || seen[v]) return false;
            seen[v] = true;
        }
        return true;
    }
}