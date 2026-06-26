import java.util.Scanner;

public class CountOccurrenceOfNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] counts = new int[101];

        System.out.println("Enter numbers between 1 and 100 (0 to stop):");

        int number;

        while (true) {
            number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            if (number >= 1 && number <= 100) {
                counts[number]++;
            }
        }

        for (int i = 1; i <= 100; i++) {
            if (counts[i] > 0) {
                if (counts[i] == 1) {
                    System.out.println(i + " occurs 1 time");
                } else {
                    System.out.println(i + " occurs " + counts[i] + " times");
                }
            }
        }
    }
}