import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");
        
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            
            attempts++;
            
            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
            } else if (guess < secretNumber) {
                System.out.println("Try higher!");
            } else if (guess > secretNumber) {
                System.out.println("Try lower!");
            } else {
                System.out.println("Congratulations! You guessed the number " + secretNumber + " in " + attempts + " attempts.");
                break;
            }
        }
        
        scanner.close();
    }
}
