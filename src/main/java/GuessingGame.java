import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        int secretNumber = 11;

//        Prompt user to enter a number
        System.out.println("Enter a number: ");

//        Collect user input
        Scanner reader = new Scanner(System.in);
        int guessNumber = reader.nextInt();

//        if the number guessed is the same as the secret number, print "THAT'S RIGHT!"
        if (guessNumber == secretNumber){
            System.out.println("THAT'S RIGHT!");
        }
//        if the number guessed is more than the secret number, print "TOO HIGH!"
        else if (guessNumber > secretNumber){
            System.out.println("TOO HIGH!");
        }
//        if the number guessed is less than the secret number, print "TOO LOW!"
        else if (guessNumber < secretNumber){
            System.out.print("TOO LOW!");
        }
        else {
            System.out.println("ERROR!");
        }
    }
}