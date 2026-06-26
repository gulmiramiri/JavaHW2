/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.pkg18;

import java.util.Random;
import java.util.Arrays;

public class Main {


    public static void shuffle(int[][] m) {

        Random rand = new Random();

        for (int i = m.length - 1; i > 0; i--) {

            int j = rand.nextInt(i + 1);

            int[] temp = m[i];
            m[i] = m[j];
            m[j] = temp;
        }
    }

    public static void main(String[] args) {

        int[][] m = {
            {1, 2},
            {3, 4},
            {5, 6},
            {7, 8},
            {9, 10}
        };

        shuffle(m);

        for (int i = 0; i < m.length; i++) {
            System.out.println(Arrays.toString(m[i]));
        }
    }
}
