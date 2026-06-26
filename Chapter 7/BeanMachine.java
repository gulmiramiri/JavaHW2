import java.util.Scanner;

public class BeanMachine {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of balls to drop: ");
        int balls = input.nextInt();

        System.out.print("Enter the number of slots in the bean machine: ");
        int slotsCount = input.nextInt();

        int[] slots = new int[slotsCount];

        // Drop balls and print paths
        for (int i = 0; i < balls; i++) {
            int position = 0;

            for (int j = 0; j < slotsCount - 1; j++) {
                if (Math.random() < 0.5) {
                    System.out.print("L");
                } else {
                    System.out.print("R");
                    position++;
                }
            }

            slots[position]++;
            System.out.println();
        }

        // Find maximum slot height
        int maxHeight = 0;
        for (int count : slots) {
            if (count > maxHeight) {
                maxHeight = count;
            }
        }

        // Display histogram
        System.out.println("\nHistogram:");

        for (int row = maxHeight; row > 0; row--) {
            for (int col = 0; col < slotsCount; col++) {
                if (slots[col] >= row) {
                    System.out.print("O ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Display slot numbers
        for (int i = 0; i < slotsCount; i++) {
            System.out.print("- ");
        }
        System.out.println();
    }
}