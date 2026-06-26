import java.util.Random;

public class CountingOccurrenceOfEachLetter {

    public static void main(String[] args) {

        char[] chars = new char[100];
        int[] counts = new int[26];

        Random random = new Random();

        // Generate 100 random letters
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) ('a' + random.nextInt(26));
        }

        // Count letters
        for (int i = 0; i < chars.length; i++) {
            counts[chars[i] - 'a']++;
        }

        // Display letters
        System.out.println("Letters:");
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }

        // Display counts
        System.out.println("\n\nCounts:");
        for (int i = 0; i < counts.length; i++) {
            System.out.print((char) (i + 'a') + ":" + counts[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}