import java.util.Scanner;

public class PartitionList {

    public static int partition(int[] list) {
        int pivot = list[0];
        int low = 1;
        int high = list.length - 1;

        while (high > low) {
            while (low <= high && list[low] <= pivot) {
                low++;
            }

            while (low <= high && list[high] > pivot) {
                high--;
            }

            if (high > low) {
                int temp = list[low];
                list[low] = list[high];
                list[high] = temp;
            }
        }

        while (high > 0 && list[high] >= pivot) {
            high--;
        }

        if (pivot > list[high]) {
            list[0] = list[high];
            list[high] = pivot;
            return high;
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list size: ");
        int size = input.nextInt();

        int[] list = new int[size];

        System.out.print("Enter the list contents: ");
        for (int i = 0; i < size; i++) {
            list[i] = input.nextInt();
        }

        int pivotIndex = partition(list);

        System.out.println("After the partition, the list is");
        for (int num : list) {
            System.out.print(num + " ");
        }

        System.out.println("\nPivot index: " + pivotIndex);
    }
}