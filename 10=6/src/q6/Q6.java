package q6;

import java.util.Stack;

public class Q6 {

    public static void main(String[] args) {


       findPrimes();
    }

    public static void findPrimes() {
        Stack<Integer> primes = new Stack<>();

        // Check for the smallest prime numbers (2, 3)
        for(int i = 2; i < 10; i++) {
            if(isPrime(i)) {
                primes.push(i);
            }
        }

        // Retrieve and display the primes from the stack in reverse order
        while (!primes.isEmpty()) {
            System.out.println(primes.pop());
        }
    }

    public static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }
        for(int i = 2; i < Math.sqrt(n) + 1; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;

    }
    
}
