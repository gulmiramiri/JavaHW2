package time31;

import java.util.Date;

public class Time31{

    public static void main(String[] args) {

        Date date = new Date();

        long[] elapsedTimes = {
            10000L,
            100000L,
            1000000L,
            10000000L,
            100000000L,
            1000000000L,
            10000000000L,
            100000000000L
        };

        for (long time : elapsedTimes) {
            date.setTime(time);
            System.out.println(date.toString());
        }
    }
}