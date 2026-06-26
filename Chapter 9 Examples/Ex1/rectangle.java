package main;

public class rectangle {

    double width;
    double height;

    // No-arg constructor
    public rectangle() {
        width = 1;
        height = 1;
    }

    // Constructor with specified width and height
    public rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Return area
    public double getArea() {
        return width * height;
    }

    // Return perimeter
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
