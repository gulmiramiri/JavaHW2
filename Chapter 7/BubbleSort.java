import java.util.Scanner;

public class BubbleSort {

    public static void bubbleSort(double[] array) {
        boolean swapped;

        do {
            swapped = false;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    double temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];

        System.out.println("Enter 10 double numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }

        bubbleSort(numbers);

        System.out.println("Sorted numbers:");
        for (double num : numbers) {
            System.out.print(num + " ");
        }
    }
}