/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.pkg23;
import java.util.Scanner;
import java.util.Random;


public class Main {

    public static void main(String[] args) {

        int[][] m = new int[6][6];
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 6; i++)
            for (int j = 0; j < 6; j++)
                m[i][j] = rand.nextInt(2);

        System.out.println("Matrix:");
        print(m);

        System.out.print("Enter flipped row: ");
        int r = input.nextInt();

        System.out.print("Enter flipped column: ");
        int c = input.nextInt();

        m[r][c] = 1 - m[r][c];

        int badRow = -1;
        int badCol = -1;

        for (int i = 0; i < 6; i++) {
            int sum = 0;
            for (int j = 0; j < 6; j++) sum += m[i][j];
            if (sum % 2 != 0) badRow = i;
        }

        for (int j = 0; j < 6; j++) {
            int sum = 0;
            for (int i = 0; i < 6; i++) sum += m[i][j];
            if (sum % 2 != 0) badCol = j;
        }

        System.out.println("Flipped cell detected at: (" + badRow + ", " + badCol + ")");
    }

    static void print(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }
}