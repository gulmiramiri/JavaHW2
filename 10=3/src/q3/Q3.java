package q3;

public class Q3 {

    public static void main(String[] args) {

        // Create an instance of MyInteger using the constructor
        MyInteger myInt = new MyInteger(10);

        // Test the methods
        System.out.println("Value: " + myInt.getValue());
        System.out.println("Is even: " + myInt.isEven());
        System.out.println("Is odd: " + myInt.isOdd());
        System.out.println("Is prime: " + myInt.isPrime());

        // Test the static methods
        System.out.println("parseInt('123'): " + MyInteger.parseInt("123"));
        System.out.println("parseInt(\"456\"): " + MyInteger.parseInt("456"));

        // Compare with another MyInteger object
        MyInteger otherInt = new MyInteger(10);
        System.out.println("Equals to otherInt: " + myInt.equals(otherInt));    
        
    }
    
}
