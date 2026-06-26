
public class FindTheNumberOfUppercaseLettersInaString {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No string provided.");
            return;
        }

        String str = String.join(" ", args);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                count++;
            }
        }

        System.out.println("Number of uppercase letters: " + count);
    }
}