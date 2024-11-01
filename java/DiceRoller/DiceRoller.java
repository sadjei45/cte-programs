import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        

        System.out.println("Enter a number of roll: ");
        int numberOfRoll = input.nextInt();

        for (int i = 0; i < numberOfRoll; i++) {
            int randomNumber = random.nextInt(1,7);
            System.out.println("Roll " + i + " is " + randomNumber);
        }


    }

}
