/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.pkg4;

public class Main {

    public static void main(String[] args) {

        int[][] hours = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {4, 3, 4, 3, 3, 9, 4}
        };

        int[][] totalHours = new int[8][2];

        for (int i = 0; i < hours.length; i++) {
            int sum = 0;

            for (int j = 0; j < hours[i].length; j++) {
                sum += hours[i][j];
            }

            totalHours[i][0] = i;
            totalHours[i][1] = sum;
        }

        for (int i = 0; i < totalHours.length - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < totalHours.length; j++) {
                if (totalHours[j][1] > totalHours[maxIndex][1])
                    maxIndex = j;
            }

            int[] temp = totalHours[i];
            totalHours[i] = totalHours[maxIndex];
            totalHours[maxIndex] = temp;
        }

        for (int i = 0; i < totalHours.length; i++) {
            System.out.println("Employee " + totalHours[i][0]
                    + ": " + totalHours[i][1]);
        }
    }
}