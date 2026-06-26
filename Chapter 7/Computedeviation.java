
import java.util.Scanner;

public class Computedeviation {

    /** Compute the mean of an array of double values */
    public static double mean(double[] x) {
        double sum = 0;

        for (double value : x) {
            sum += value;
        }

        return sum / x.length;
    }

    /** Compute the deviation of double values */
    public static double deviation(double[] x) {
        double mean = mean(x);
        double sum = 0;

        for (double value : x) {
            sum += Math.pow(value - mean, 2);
        }

        return Math.sqrt(sum / (x.length - 1));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }

        System.out.println("The mean is " + mean(numbers));
        System.out.println("The standard deviation is " + deviation(numbers));
    }
}