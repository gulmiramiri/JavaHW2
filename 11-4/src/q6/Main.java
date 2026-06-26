
package q6;

import java.util.ArrayList;



import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList to store various types of objects
        ArrayList<Object> list = new ArrayList<>();

        // Add Loan object
        Loan loan = new Loan(1000.0, "Personal Loan");
        list.add(loan);

        // Add Date object
        Date currentDate = new Date();
        list.add(currentDate);

        // Add String object
        String greeting = "Hello, World!";
        list.add(greeting);

        // Add Circle object
        Circle circle = new Circle(5.0);
        list.add(circle);

        System.out.println("Displaying all elements in the ArrayList:");

        for (Object obj : list) {
            System.out.println(obj.toString());
        }
    }
}

class Loan {
    private double amount;
    private String description;

    public Loan(double amount, String description) {
        this.amount = amount;
        this.description = description;
    }

    // Getter for the loan amount
    public double getAmount() {
        return amount;
    }

    // Setter for the loan amount
    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Getter for the loan description
    public String getDescription() {
        return description;
    }

    // Setter for the loan description
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "amount=" + amount +
                ", description='" + description + '\'' +
                '}';
    }
}

class Date {
    private int year, month, day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    Date() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Getter for the date components
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for the circle radius
    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}