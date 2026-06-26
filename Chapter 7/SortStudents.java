
import java.util.Scanner;

public class SortStudents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        String[] names = new String[n];
        double[] scores = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            names[i] = input.next();

            System.out.print("Enter student score: ");
            scores[i] = input.nextDouble();
        }

        // Sort in decreasing order of scores
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (scores[j] > scores[maxIndex]) {
                    maxIndex = j;
                }
            }

            double tempScore = scores[i];
            scores[i] = scores[maxIndex];
            scores[maxIndex] = tempScore;

            String tempName = names[i];
            names[i] = names[maxIndex];
            names[maxIndex] = tempName;
        }

        System.out.println("\nStudents in decreasing order of scores:");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " " + scores[i]);
        }
    }
}