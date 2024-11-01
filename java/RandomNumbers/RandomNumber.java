import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int guess = 0;

        int number1 = random.nextInt(1,16);

        while (number1 != guess) {
            System.out.println("Enter a guess");
            guess = input.nextInt();

            if (guess > number1) {
                System.out.println("Too high");
            } else if (guess == number1) {
                System.out.println("Correct");
            } else {
                System.out.println("Too low");
            }
        }

        


        
    }

}
