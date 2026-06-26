/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.pkg16;
import java.util.Arrays;

public class Main {

    public static void sort(int[][] m) {

        int rows = m.length;
        int cols = m[0].length;

        int[][] temp = new int[rows][cols];

        int k = 0;
        int[] oneD = new int[rows * cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                oneD[k++] = m[i][j];
            }
        }

        Arrays.sort(oneD);

        k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                temp[i][j] = oneD[k++];
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                m[i][j] = temp[i][j];
            }
        }
    }

    public static void main(String[] args) {

        int[][] m = {
            {4, 2},
            {1, 7},
            {4, 5},
            {1, 2},
            {1, 1},
            {4, 1}
        };

        sort(m);

        for (int i = 0; i < m.length; i++) {
            System.out.println(Arrays.toString(m[i]));
        }
    }
}