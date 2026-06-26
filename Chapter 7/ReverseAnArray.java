
import java.util.Scanner;

public class ReverseAnArray {

    public static double[] reverse(double[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            double temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }

        reverse(numbers);

        System.out.println("Reversed array:");
        for (double num : numbers) {
            System.out.print(num + " ");
        }
    }
}