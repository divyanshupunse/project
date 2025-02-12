import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        Random random=new Random();

        int hiddenNum= random.nextInt(100)+1;
        int attempts=5;
        boolean hasWon=false;
        System.out.println("Welcome to the number guessing game ");
        System.out.println("Chose number between 1 to 100");
        System.out.println("You have " +attempts+ " attempts to guess");
        for (int i=1;i<=attempts;i++){
            System.out.println("It's your " + i +" attempt.");
            System.out.println("Enter your number");
            int guess=num.nextInt();
            if (guess==hiddenNum){
                System.out.println("Congratulation you chose correct number" + hiddenNum);
                break;
            }
            else if (guess<hiddenNum){
                System.out.println("you chose lower number ,try higher");
            }
            else {
                System.out.println("you chose higher number ,try lower");
            }

        }
        if (!hasWon){
            System.out.println("You've used all attempts! The correct number is: " + hiddenNum);
        }


    }
}
