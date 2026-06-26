/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.pkg17;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of banks: ");
        int n = input.nextInt();

        System.out.print("Enter minimum asset limit: ");
        double limit = input.nextDouble();

        double[] balance = new double[n];
        double[][] loans = new double[n][n];

        System.out.println("Enter each bank's balance:");
        for (int i = 0; i < n; i++) {
            balance[i] = input.nextDouble();
        }

        System.out.println("Enter number of loans:");
        int m = input.nextInt();

        System.out.println("Enter loans (fromBank toBank amount):");
        for (int i = 0; i < m; i++) {
            int iBank = input.nextInt();
            int jBank = input.nextInt();
            double amount = input.nextDouble();
            loans[iBank][jBank] = amount;
        }

        boolean[] unsafe = new boolean[n];

        while (true) {

            boolean changed = false;

            for (int i = 0; i < n; i++) {

                double assets = balance[i];

                for (int j = 0; j < n; j++) {
                    assets += loans[i][j];
                }

                if (assets < limit && !unsafe[i]) {
                    unsafe[i] = true;
                    changed = true;

                    for (int j = 0; j < n; j++) {
                        loans[j][i] = 0;
                    }
                }
            }

            if (!changed) break;
        }

        System.out.println("Unsafe banks:");
        for (int i = 0; i < n; i++) {
            if (unsafe[i]) {
                System.out.print(i + " ");
            }
        }
    }
}