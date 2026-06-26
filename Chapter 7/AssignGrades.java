import java.util.Scanner;

public class AssignGrades {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int Students = scanner.nextInt();

        System.out.print("Enter the number of grades: ");
        int[] Grades = new int[Students];
        for (int i = 0; i < Grades.length; i++) {
            Grades[i] = scanner.nextInt();
        }

        int best = Grades[0];
        for (int i = 0; i < Grades.length; i++) {
            if (Grades[i] > best) {
                best = Grades[i];
            }
        }

        for (int i = 0; i < Grades.length; i++) {
            if (Grades[i] >= best - 10) {
                System.out.println("Student "+ i + " score is "+ Grades[i] + " and grade is A.");
            }
            else if (Grades[i] >= best - 20) {
                System.out.println("Student "+ i + " score is "+ Grades[i] + " and grade is B.");
            }
            else if (Grades[i] >= best - 30) {
                System.out.println("Student "+ i + " score is "+ Grades[i] + " and grade is C.");
            }
            else if (Grades[i] >= best - 40) {
                System.out.println("Student "+ i + " score is "+ Grades[i] + " and grade is D.");
            }
            else {
                System.out.println("F.");
            }
        }




    }

}