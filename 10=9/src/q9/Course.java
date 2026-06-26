package q9;

import java.util.Arrays;
import java.util.Scanner;

public class Course {
    private String name;
    private int maxSize;
    private Student[] students;
    int count;
    public Course(String name, int maxSize) {
        this.name = name;
        this.maxSize = maxSize;
        this.students = new Student[maxSize];
    }

    public void addStudent(Student student) {
        if (isFull()) {
            increaseArraySize();
        }
        students[count++] = student;  // Increment count and add the student to the array
    }

    public Student[] getStudents() {
        return Arrays.copyOf(students, count);  // Return an array with the same length as the number of students
    }

    public void dropStudent(String studentName) {
        for (int i = 0; i < count; i++) {
            if (students[i] != null && students[i].getName().equals(studentName)) {
                students[i] = null;  // Set the student to null and decrement count
                count--;
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void clear() {
        for (int i = 0; i < count; i++) {
            students[i] = null;  // Set each student in the array to null
        }
        count = 0;  // Reset the count to zero
    }

    private boolean isFull() {
        return count == maxSize;  // Return true if the count is equal to maxSize
    }

    private void increaseArraySize() {
        Student[] newStudents = new Student[maxSize * 2];  // Create a new array with double the current size
        System.arraycopy(students, 0, newStudents, 0, count);  // Copy elements from the old array to the new array
        students = newStudents;  // Update the students array with the new larger array
        maxSize *= 2;  // Double the maximum size
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Course course = new Course("Java Programming", 3);

            System.out.println("Enter student name: ");
            String studentName = scanner.nextLine();
            Student student = new Student(studentName);
            course.addStudent(student);

            System.out.println("Enter another student name: ");
            studentName = scanner.nextLine();
            student = new Student(studentName);
            course.addStudent(student);

            System.out.println("List of students:");
            for (int i = 0; i < course.getCount(); i++) {
                if (course.students[i] != null) {
                    System.out.println(course.students[i].getName());
                }
            }

            course.dropStudent("John Doe");

            System.out.println("After dropping John Doe:");
            for (int i = 0; i < course.getCount(); i++) {
                if (course.students[i] != null) {
                    System.out.println(course.students[i].getName());
                }
            }

            course.clear();

            System.out.println("Course is cleared.");
        }
    }

    private int getCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}