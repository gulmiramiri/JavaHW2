
package q7;
import java.util.ArrayList;
import java.util.Collections;
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
            shuffle(list);
            System.out.println("Shuffled List:");
            for (int num : list) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }

    // Method to shuffle an ArrayList
    public static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
    }
}