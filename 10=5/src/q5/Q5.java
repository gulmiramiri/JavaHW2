package q5;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        
        
         Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        StackOfIntegers factors = new StackOfIntegers();
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                factors.push(i);
                number /= i;
            }
        }

        System.out.println("The smallest factors of " + number + " in decreasing order are:");
        System.out.println(factors.toString());

        scanner.close();
    }
}
