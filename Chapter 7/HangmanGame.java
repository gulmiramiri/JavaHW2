import java.util.Scanner;

public class HangmanGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] words = {
                "write", "that", "program", "java",
                "computer", "science", "array", "object"
        };

        char playAgain;

        do {
            String word = words[(int) (Math.random() * words.length)];
            char[] guessed = new char[word.length()];

            for (int i = 0; i < guessed.length; i++) {
                guessed[i] = '*';
            }

            int misses = 0;

            while (!String.valueOf(guessed).equals(word)) {

                System.out.print("(Guess) Enter a letter in word ");

                for (char c : guessed) {
                    System.out.print(c);
                }

                System.out.print(" > ");
                char ch = input.next().charAt(0);

                boolean found = false;
                boolean alreadyGuessed = false;

                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == ch) {
                        if (guessed[i] == ch) {
                            alreadyGuessed = true;
                        } else {
                            guessed[i] = ch;
                            found = true;
                        }
                    }
                }

                if (alreadyGuessed) {
                    System.out.println(ch + " is already in the word");
                } else if (!found) {
                    System.out.println(ch + " is not in the word");
                    misses++;
                }
            }

            System.out.println("The word is " + word +
                    ". You missed " + misses + " time(s).");

            System.out.print("Do you want to guess another word? Enter y or n> ");
            playAgain = input.next().charAt(0);

        } while (playAgain == 'y' || playAgain == 'Y');

        input.close();
    }
}