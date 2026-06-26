
import java.util.Arrays;

public class ExecutionTime {

    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;

            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[100000];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }

        int key = (int) (Math.random() * 100000);

        long startTime = System.nanoTime();
        linearSearch(array, key);
        long endTime = System.nanoTime();

        long linearExecutionTime = endTime - startTime;

        Arrays.sort(array);

        startTime = System.nanoTime();
        binarySearch(array, key);
        endTime = System.nanoTime();

        long binaryExecutionTime = endTime - startTime;

        System.out.println("Linear Search Execution Time: "
                + linearExecutionTime + " nanoseconds");

        System.out.println("Binary Search Execution Time: "
                + binaryExecutionTime + " nanoseconds");
    }
}