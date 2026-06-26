import java.util.Scanner;

public class MergeTwoSortedLists {

    public static int[] merge(int[] list1, int[] list2) {
        int[] merged = new int[list1.length + list2.length];

        int i = 0; // list1 index
        int j = 0; // list2 index
        int k = 0; // merged index

        while (i < list1.length && j < list2.length) {
            if (list1[i] <= list2[j]) {
                merged[k++] = list1[i++];
            } else {
                merged[k++] = list2[j++];
            }
        }

        while (i < list1.length) {
            merged[k++] = list1[i++];
        }

        while (j < list2.length) {
            merged[k++] = list2[j++];
        }

        return merged;
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

        int[] merged = merge(list1, list2);

        System.out.print("The merged list is ");
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}