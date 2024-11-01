import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int guessCount = 0;

        int randomNumber = random.nextInt(1,11);
        int guess = 0;

        while (randomNumber != guess) {
            System.out.println("Enter a guess between 1 and 10: ");
            guess = input.nextInt();

            if (guess > randomNumber) {
                System.out.println("Guess is too high.");
            } else if (guess == randomNumber) {
                System.out.println("Congratulations you guessed it.");
            }
            else {
                System.out.println("Guess is too low.");
            }

            guessCount++;
        }
        System.out.println("You guessed " + guessCount + " times.");
        
        input.close();

    }

}
