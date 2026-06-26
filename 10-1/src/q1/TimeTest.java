package q1;


public class TimeTest {
    public static void main(String[] args) {
        // Create three Time objects using different constructors and displaying their hour, minute, and second.
        Time time1 = new Time();
        Time time2 = new Time(555550000);
        Time time3 = new Time(5, 23, 55);

        System.out.println("Time 1: " + time1);
        System.out.println("Time 2: " + time2);
        System.out.println("Time 3: " + time3);    }
    
}
