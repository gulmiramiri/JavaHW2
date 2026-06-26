package main;


public class Main {

    public static void main(String[] args) {

        rectangle rectangle1 = new rectangle(4, 40);
        rectangle rectangle2 = new rectangle(3.5, 35.9);

        System.out.println("Rectangle 1");
        System.out.println("Width: " + rectangle1.width);
        System.out.println("Height: " + rectangle1.height);
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

        System.out.println();

        System.out.println("Rectangle 2");
        System.out.println("Width: " + rectangle2.width);
        System.out.println("Height: " + rectangle2.height);
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
    }
}