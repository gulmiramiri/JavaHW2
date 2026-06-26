import java.util.Scanner;
public class DeckOfCards {
    public static void main(String[] args) {

        /*The problem is to write a program that picks four cards randomly
        from a deck of 52 cards. All the cards can be represented
        using an array named deck, filled with initial values 0 to 51*/


        String[] ranks = {"Ace","2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};

       int[] cards = new int[52];

       for (int i = 0; i <cards.length ; i++)
       {
           cards[i] = i;
       }

       for  (int i = 0; i <cards.length ; i++)
       {
           int j = (int) (Math.random() * cards.length);
           int temp = cards[i];
           cards[i] = cards[j];
           cards[j] = temp;
    }

    for   (int i = 0; i < 4 ; i++)
    {
        String suit = (suits[cards[i] / 13]);
        String rank = (ranks[cards[i] % 13]);
        System.out.println(rank + " of " + suit);
    }

    }
}
