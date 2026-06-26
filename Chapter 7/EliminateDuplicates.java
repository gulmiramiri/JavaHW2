
import java.util.Scanner;

public class EliminateDuplicates {

    public static int[] eliminateDuplicates(int[] list) {
        int[] temp = new int[list.length];
        int count = 0;

        for (int i = 0; i < list.length; i++) {
            boolean duplicate = false;

            for (int j = 0; j < count; j++) {
                if (list[i] == temp[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                temp[count++] = list[i];
            }
        }

        int[] result = new int[count];
        System.arraycopy(temp, 0, result, 0, count);

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        int[] distinct = eliminateDuplicates(numbers);

        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < distinct.length; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(distinct[i]);
        }
    }
}