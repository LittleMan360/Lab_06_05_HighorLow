import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args)
    {

        //Variables
        int guessedNumber = 0;
        int correctNumber;
        String wrongInput;

        Scanner in = new Scanner(System.in);

        //random number generator
        Random rand = new Random();
        correctNumber = rand.nextInt(10);

        //input prompt
        System.out.println("Guess the number between 1 to 10 ");

        //if input is correct between 1 and 10
        if(in.hasNextInt())
        {
            guessedNumber = in.nextInt();
            in.nextLine();
        }
        else
        {
            //if input isn't number between 1 and 10
            wrongInput = in.nextLine();
            System.out.println("You entered " + wrongInput);
            System.out.println("Please enter a number between 1 and 10");
            System.exit(0);
        }

        //if number guessed is lower than the correct number
        if (guessedNumber < correctNumber)
        {
            System.out.println("The random number was " + correctNumber);
            System.out.println("Your guess was low");
        }
        //if number guessed is greater than the correct number
        else if (guessedNumber > correctNumber)
        {
            System.out.println("The random number was " + correctNumber);
            System.out.println("Your guess was high");
        }
        //if number guessed is the guessed number
        else
        {
            System.out.println("The random number was " + correctNumber);
            System.out.println("You guessed right on the money!");
        }
    }
}