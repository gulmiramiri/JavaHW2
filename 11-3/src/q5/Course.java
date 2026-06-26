package q5;
import java.util.ArrayList;
import java.util.List;

// Define the Course class
public class Course {
    // Private members
    private String name;
    private List<String> students; // Using ArrayList to store students

    // Constructor that accepts a name and an ArrayList of student names
    public Course(String name, List<String> students) {
        this.name = name;
        this.students = students;
    }

    // Getter for the course name
    public String getName() {
        return name;
    }

    // Setter for the course name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for the list of students
    public List<String> getStudents() {
        return students;
    }

    // Method to add a student to the list
    public void addStudent(String student) {
        students.add(student);
    }

    // Method to remove a student from the list
    public boolean removeStudent(String student) {
        return students.remove(student);
    }

    // Method to print all students in the course
    public void printStudents() {
        System.out.println("Course Name: " + name);
        System.out.println("List of Students:");
        for (String student : students) {
            System.out.println(student);
        }
    }
}