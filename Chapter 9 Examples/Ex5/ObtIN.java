package obtin;
import java.util.GregorianCalendar;

public class ObtIN {

    public static void main(String[] args) {

        // 1. Current date
        GregorianCalendar calendar = new GregorianCalendar();

        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH) + 1; // months start from 0
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Current Date:");
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);

        // 2. Set specific time in milliseconds
        calendar.setTimeInMillis(1234567898765L);

        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH) + 1;
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("\nDate for 1234567898765L:");
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }
}