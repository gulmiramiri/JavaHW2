import java.util.*;
public class LottoNumbers {
    public static void main(String[] args) {

//        It is a program that checks whether the numbers you enter
//        include every number from 1 to 99 at least once.



        Scanner scanner = new Scanner(System.in);

        boolean[] seen = new boolean[100];
        System.out.print("Enter numbers between 1 and 99 (0 to stop) :");

        while (true){
            int number = scanner.nextInt();
            if (number == 0){
                break;
            }
            if (number > 1 && number <= 99){
                seen[number] = true;
            }
            }
                boolean AllCovered = true;

            for (int i = 1; i <= 99; i++ ) {
                if (seen[i] == false){
                    AllCovered = false;
                }
            }
            if (AllCovered == true){
                System.out.println("All covered!");
            }
            else{
                System.out.println("Not all covered!");
            }

        }

    }
