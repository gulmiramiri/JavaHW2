
import java.util.Scanner;

public class AverageAnArray {

    public static double average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] intArray = new int[10];
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            intArray[i] = input.nextInt();
        }

        System.out.println("Average of integers: " + average(intArray));

        double[] doubleArray = new double[10];
        System.out.println("Enter 10 double values:");
        for (int i = 0; i < 10; i++) {
            doubleArray[i] = input.nextDouble();
        }

        System.out.println("Average of doubles: " + average(doubleArray));
    }
}