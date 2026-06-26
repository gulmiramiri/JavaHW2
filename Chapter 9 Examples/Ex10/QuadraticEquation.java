package quadratic;
public class QuadraticEquation {

    private double a;
    private double b;
    private double c;

    // constructor
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // getters
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // discriminant
    public double getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    // root 1
    public double getRoot1() {
        if (getDiscriminant() < 0) return 0;

        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    // root 2
    public double getRoot2() {
        if (getDiscriminant() < 0) return 0;

        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }
}