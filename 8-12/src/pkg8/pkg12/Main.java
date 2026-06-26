/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.pkg12;

import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        int[][] brackets = {
            {8350, 33950, 82250, 171550, 372950},
            {16700, 67900, 137050, 20885, 372950},
            {8350, 33950, 68525, 104425, 186475},
            {11950, 45500, 117450, 190200, 372950}
        };

        System.out.print("Enter taxable income: ");
        double income = input.nextDouble();

        System.out.print("Enter filing status (0-3): ");
        int status = input.nextInt();

        double tax = 0;

        if (income <= brackets[status][0]) {
            tax = income * rates[0];
        } else {
            tax = brackets[status][0] * rates[0];

            for (int i = 1; i < rates.length; i++) {

                double lower = brackets[status][i - 1];
                double upper = brackets[status][i];

                if (income > upper) {
                    tax += (upper - lower) * rates[i];
                } else {
                    tax += (income - lower) * rates[i];
                    break;
                }
            }
        }

        System.out.println("Tax is: " + tax);
    }
}