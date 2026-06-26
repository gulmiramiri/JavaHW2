import java.util.Scanner;

public class ReverseTheNumbersEntered {
public static  void main(String args[]) {

    /*Write a program that reads 10 integers then displays
    them in the reverse of the order in which they were read.*/

    Scanner scanner = new Scanner(System.in);

    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
        System.out.print("Please enter the " + (i + 1) + " number : ");
        numbers[i] = scanner.nextInt();
    }

    System.out.println("Reversed numbers:");
    for (int j = 9; j >= 0; j--) {
        System.out.print(numbers[j] + " ");
    }



        }
}
