
public class RandomNumberChooser {

    public static int getRandom(int start, int end, int... numbers) {
        while (true) {
            int random = start + (int) (Math.random() * (end - start + 1));

            boolean excluded = false;

            for (int num : numbers) {
                if (random == num) {
                    excluded = true;
                    break;
                }
            }

            if (!excluded) {
                return random;
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 45; i++) {
            System.out.printf("%4d", getRandom(1, 100, 4, 8, 95, 93));

            if (i % 15 == 0) {
                System.out.println();
            }
        }
    }
}