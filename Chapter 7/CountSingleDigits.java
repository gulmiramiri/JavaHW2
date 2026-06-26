
public class CountSingleDigits {
    public static void main(String[] args) {
        int[] counts = new int[10];

        // Generate 100 random integers between 0 and 9
        for (int i = 0; i < 100; i++) {
            int number = (int) (Math.random() * 10);
            counts[number]++;
        }

        // Display the counts
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + " occurs " + counts[i] + " times");
        }
    }
}
