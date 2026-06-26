package rgular;
public class Reqular {

    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    // no-arg constructor
    public Reqular() {
    }

    // constructor with n and side (center at 0,0)
    public Reqular(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    // constructor with all fields
    public Reqular(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    // getters and setters
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // perimeter
    public double getPerimeter() {
        return n * side;
    }

    // area formula
    public double getArea() {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }
}