package q4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sequence of numbers ending with 0:");
        ArrayList<Integer> list = new ArrayList<>();

        // Read input until the user enters '0'
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            list.add(num);
        }

        // Check if the list is null or empty
        if (list == null || list.isEmpty()) {
            System.out.println("The list is null or empty.");
        } else {
            Integer maxNumber = getMax(list);
            System.out.println("The maximum number in the list is: " + maxNumber);
        }

        scanner.close();
    }

    // Method to find the maximum element in an ArrayList
    public static Integer getMax(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int max = list.get(0);
        for (int i : list) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}