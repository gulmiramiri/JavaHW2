import java.util.Scanner;
public class AnalyzeNumbers {
public static void main(String[] args) {


/*
 This project will take a numbers input from user,
 compute their average,
 and find out how many numbers are above the average.
*/

    Scanner scanner = new Scanner(System.in);

    int count = 0;

    System.out.print("How many numbers do you want to enter: ");
    int size = scanner.nextInt();
    int[] numbers = new int[size];
    System.out.println();

    for (int i = 0; i < size; i++)
    {
        System.out.print("Enter number " + (i + 1) + ": ");
        numbers[i] = scanner.nextInt();
    }

    int sum =0;
    for (int i = 0; i < size; i++)
    {
        sum +=  numbers[i];
    }

    int average = sum/size;
    System.out.println();
    System.out.println("The average number is: " + average);
    System.out.println();

    for (int i = 0; i < size; i++)
    {
        if (numbers[i] > average)
        {
            System.out.println("Number " + numbers[i] + " is greater than average");

            count++;
        }
    }
    System.out.println();
    System.out.println(count+" numbers are greater than average");


        }
}
