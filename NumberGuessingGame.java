import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;

        int count = 0;

        System.out.println("Welcome to Number Guessing Game");
        System.out.println("Guess a number between 1 and 100.....");

        int num = scan.nextInt();
            count++;
            while(num != secretNumber){
         if(num > secretNumber){ 
            System.out.println("Too High!");
         }else{
            System.out.println("Too Low!");
         }
                   System.out.print("Guess Again: ");
            num = scan.nextInt();
            count++;
        }

        System.out.println("Congratulations!");
        if(count <= 5){
    System.out.println("Excellent!");
}
else if(count <= 10){
    System.out.println("Good Job!");
}
else{
    System.out.println("Keep Practicing!");
}
        System.out.println("You guessed the number in " + count + " attempts.");
System.out.println("Do you want to play again? (Y/N)");
        scan.close();
    }
}

