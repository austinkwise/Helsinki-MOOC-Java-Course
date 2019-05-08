
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        
        int guess = -1;
        int count = 0;
        
        while (numberDrawn != guess) {
                System.out.print("Guess a number: ");
        	guess = Integer.parseInt(reader.nextLine());
                count++;
        	if(guess > numberDrawn) {
        		System.out.println("The number is lesser, guesses made: " + count);
        	}else if(guess < numberDrawn) {
        		System.out.println("The number is greater, guesses made: " + count);
        	}else if(guess == numberDrawn) {
        		System.out.println("Congratulations, your guess is correct!");
                       
        	}
        }
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
