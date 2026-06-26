
import java.util.Arrays;
import java.util.Scanner;

public class IdenticalArrays {

    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }

        Arrays.sort(list1);
        Arrays.sort(list2);

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1: ");
        int size1 = input.nextInt();
        int[] list1 = new int[size1];

        for (int i = 0; i < size1; i++) {
            list1[i] = input.nextInt();
        }

        System.out.print("Enter list2: ");
        int size2 = input.nextInt();
        int[] list2 = new int[size2];

        for (int i = 0; i < size2; i++) {
            list2[i] = input.nextInt();
        }

        if (equals(list1, list2)) {
            System.out.println("Two lists are identical");
        } else {
            System.out.println("Two lists are not identical");
        }
    }
}