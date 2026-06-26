/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.pkg5;
import java.util.Scanner;
public class Main {



    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] c = new double[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        return c;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] a = new double[3][3];
        double[][] b = new double[3][3];

        System.out.println("Enter matrix1:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = input.nextDouble();
            }
        }

        System.out.println("Enter matrix2:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = input.nextDouble();
            }
        }

        double[][] c = addMatrix(a, b);

        System.out.println("The matrices are added as follows");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }

            if (i == 1)
                System.out.print("+ ");
            else
                System.out.print("  ");

            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j] + " ");
            }

            if (i == 1)
                System.out.print("= ");
            else
                System.out.print("  ");

            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + " ");
            }

            System.out.println();
        }
    }
}