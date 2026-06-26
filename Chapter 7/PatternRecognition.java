
import java.util.Scanner;

public class PatternRecognition {

    public static boolean isConsecutiveFour(int[] values) {
        for (int i = 0; i <= values.length - 4; i++) {
            if (values[i] == values[i + 1] &&
                    values[i] == values[i + 2] &&
                    values[i] == values[i + 3]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int size = input.nextInt();

        int[] values = new int[size];

        System.out.print("Enter the values: ");
        for (int i = 0; i < size; i++) {
            values[i] = input.nextInt();
        }

        if (isConsecutiveFour(values)) {
            System.out.println("The series contains four consecutive numbers with the same value.");
        } else {
            System.out.println("The series does not contain four consecutive numbers with the same value.");
        }
    }
}