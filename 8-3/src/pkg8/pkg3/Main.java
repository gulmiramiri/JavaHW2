/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.pkg3;

public class Main {

    public static void main(String[] args) {
        char[][] answers = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int[][] results = new int[answers.length][2];

        for (int i = 0; i < answers.length; i++) {
            int correctCount = 0;

            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j])
                    correctCount++;
            }

            results[i][0] = i;
            results[i][1] = correctCount;
        }

        for (int i = 0; i < results.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < results.length; j++) {
                if (results[j][1] < results[minIndex][1])
                    minIndex = j;
            }

            int[] temp = results[i];
            results[i] = results[minIndex];
            results[minIndex] = temp;
        }

        for (int i = 0; i < results.length; i++) {
            System.out.println("Student " + results[i][0]
                    + "'s correct count is " + results[i][1]);
        }
    }
}