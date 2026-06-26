package sort;
import java.util.Random;

public class Sort {

    public static void main(String[] args) {

        int[] numbers = new int[100000];

        Random random = new Random();

        // fill array with random numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100000);
        }

        StopWatch stopwatch = new StopWatch();

        stopwatch.start();

        // Selection sort
        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }

        stopwatch.stop();

        System.out.println("Sorting 100,000 numbers took: "
                + stopwatch.getElapsedTime() + " ms");
    }
}
