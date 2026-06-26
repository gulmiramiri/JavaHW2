
public class LockerPuzzle {
    public static void main(String[] args) {
        boolean[] lockers = new boolean[100]; // false = closed

        // Students 1 through 100
        for (int student = 1; student <= 100; student++) {
            for (int locker = student; locker <= 100; locker += student) {
                lockers[locker - 1] = !lockers[locker - 1];
            }
        }

        // Display open lockers
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i]) {
                System.out.print((i + 1) + " ");
            }
        }
    }
}