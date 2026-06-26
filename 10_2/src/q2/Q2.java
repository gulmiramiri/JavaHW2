package q2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.println("Enter your height in feet and inches:");
        System.out.print("Feet: ");
        double feet = scanner.nextDouble();
        System.out.print("Inches: ");
        double inches = scanner.nextDouble();

        // Create an instance of the BMI class
        BMI bmi = new BMI(name, age, weight, feet, inches);

        // Calculate the BMI
        double bmiResult = bmi.calculateBMI();

        System.out.println("Your BMI is: " + bmiResult);
    }
    
    
}
