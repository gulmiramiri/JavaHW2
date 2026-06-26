package q2;

public class BMI {
    
    private String name;
    private int age;
    private double weight;
    private double heightInCentimeters;

   
    public BMI(String name, int age, double weight, double feet, double inches) {
        this.name = name;
        this.age = age;
        this.weight = weight;

        // Convert feet and inches to centimeters
        double totalInches = feet * 12 + inches;
        this.heightInCentimeters = totalInches * 2.54;
    }

   
    public double calculateBMI() {
        // Calculate BMI using the formula: BMI = weight (kg) / (height in m)^2
        double heightInMeters = this.heightInCentimeters / 100;
        return weight / Math.pow(heightInMeters, 2);
    }

    // Other methods and properties can be added here
}