/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.pkg11;
import java.util.Scanner;
public class Main {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 511: ");
        int number = input.nextInt();

        char[][] matrix = new char[3][3];

        String binary = String.format("%9s", Integer.toBinaryString(number))
                .replace(' ', '0');

        int k = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                matrix[i][j] = (binary.charAt(k) == '0') ? 'H' : 'T';
                k++;
            }
        }

        System.out.println("Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}