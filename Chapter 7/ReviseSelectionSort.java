
import java.util.Scanner;

public class ReviseSelectionSort {

    public static void selectionSort(double[] list) {
        for (int i = list.length - 1; i > 0; i--) {
            int largestIndex = 0;

            for (int j = 1; j <= i; j++) {
                if (list[j] > list[largestIndex]) {
                    largestIndex = j;
                }
            }

            double temp = list[i];
            list[i] = list[largestIndex];
            list[largestIndex] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];

        System.out.println("Enter 10 double numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }

        selectionSort(numbers);

        System.out.println("Sorted numbers:");
        for (double num : numbers) {
            System.out.print(num + " ");
        }
    }
}

