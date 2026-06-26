
public class CouponCollectorProblem {

    public static void main(String[] args) {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {
                "Ace", "2", "3", "4", "5", "6", "7",
                "8", "9", "10", "Jack", "Queen", "King"
        };

        boolean[] foundSuit = new boolean[4];
        String[] pickedCards = new String[4];

        int suitCount = 0;
        int picks = 0;

        while (suitCount < 4) {
            int card = (int) (Math.random() * 52);

            int suit = card / 13;
            int rank = card % 13;

            picks++;

            if (!foundSuit[suit]) {
                foundSuit[suit] = true;
                pickedCards[suit] = ranks[rank] + " of " + suits[suit];
                suitCount++;
            }
        }

        System.out.println("Cards picked:");

        for (String card : pickedCards) {
            System.out.println(card);
        }

        System.out.println("Number of picks: " + picks);
    }
}