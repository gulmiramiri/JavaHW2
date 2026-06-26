package q1;
public class Time {
    
    private int hour;
    private int minute;
    private int second;

    // No-arg constructor that creates a Time object for the current time.
    public Time() {
        this(System.currentTimeMillis());
    }

    // Constructor that constructs a Time object with a specified elapsed time since midnight, January 1, 1970, in milliseconds.
    public Time(long elapseTime) {
        hour = (int) ((elapseTime / 3600000) % 24);
        minute = (int) ((elapseTime % 3600000) / 60000);
        second = (int) ((elapseTime % 60000) / 1000);
    }

    // Constructor that constructs a Time object with the specified hour, minute, and second.
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Method named setTime(long elapseTime) that sets a new time for the object using the elapsed time.
    public void setTime(long elapseTime) {
        this.hour = (int) ((elapseTime / 3600000) % 24);
        this.minute = (int) ((elapseTime % 3600000) / 60000);
        this.second = (int) ((elapseTime % 60000) / 1000);
    }

    @Override
    public String toString() {
        return String.format("%d:%02d:%02d", hour, minute, second);
    }
}