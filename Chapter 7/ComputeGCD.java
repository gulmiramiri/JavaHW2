
import java.util.Scanner;

public class ComputeGCD {

    public static int gcd(int... numbers) {
        int result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            result = gcdTwo(result, numbers[i]);
        }

        return result;
    }

    private static int gcdTwo(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter five integers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("The GCD is " + gcd(numbers));
    }
}
