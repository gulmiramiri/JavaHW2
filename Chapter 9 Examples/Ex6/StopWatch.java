package sort;
public class StopWatch {

    private long startTime;
    private long endTime;

    // No-arg constructor
    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    // restart timer
    public void start() {
        startTime = System.currentTimeMillis();
    }

    // stop timer
    public void stop() {
        endTime = System.currentTimeMillis();
    }

    // elapsed time in milliseconds
    public long getElapsedTime() {
        return endTime - startTime;
    }
}