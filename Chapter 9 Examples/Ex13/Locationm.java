package locationm;
import java.util.Scanner;

public class Locationm {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get matrix size
        System.out.print("Enter number of rows and columns: ");
        int rows = input.nextInt();
        int cols = input.nextInt();

        double[][] array = new double[rows][cols];

        // input values
        System.out.println("Enter the array elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = input.nextDouble();
            }
        }

        // find location of largest
        Location loc = Location.locateLargest(array);

        System.out.println("Largest Value: " + loc.maxValue);
        System.out.println("Location: (" + loc.row + ", " + loc.column + ")");
    }
}