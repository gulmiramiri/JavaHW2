public class PickFourCards {

    public static void main(String[] args) {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {
                "Ace", "2", "3", "4", "5", "6", "7",
                "8", "9", "10", "Jack", "Queen", "King"
        };

        int picks = 0;
        int sum = 0;

        while (sum != 24) {
            sum = 0;
            picks++;

            for (int i = 0; i < 4; i++) {
                int card = (int) (Math.random() * 52);
                int rank = card % 13;

                sum += rank + 1;
            }
        }

        System.out.println("Number of picks needed to get a sum of 24: " + picks);
    }
}