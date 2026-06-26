
import java.util.Scanner;

public class PrintDistinctNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] distinct = new int[10];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            int num = input.nextInt();
            boolean found = false;

            for (int j = 0; j < count; j++) {
                if (distinct[j] == num) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                distinct[count] = num;
                count++;
            }
        }

        System.out.println("The number of distinct numbers is " + count);
        System.out.print("The distinct numbers are: ");

        for (int i = 0; i < count; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(distinct[i]);
        }
    }
}