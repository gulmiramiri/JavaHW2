package q9;


public class Student {
    private String name;
    private int grade;

    // Constructor to initialize a student with a name and grade
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    Student(String name) {
        this.name = name;
    }

    // Getters for name and grade

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    // Override the toString method to provide a string representation of the student
    @Override
    public String toString() {
        return "Student{name='" + name + "', grade=" + grade + "}";
    }
}