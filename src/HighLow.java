import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args)
    {

        //Variables
        int guessedNumber;
        int correctNumber;
        int maxNumber = 10;

        String wrongInput;

        Scanner in = new Scanner(System.in);



        System.out.println("Enter a number between 1 to 10 ");

        if(in.hasNextInt())
        {
            guessedNumber = in.nextInt();
            in.nextLine();
        }
        else
        {
            wrongInput = in.nextLine();
            System.out.println("You entered " + wrongInput);
            System.out.println(" Please enter a number between 1 to 10");
            System.exit(0);
        }

        Random rand = new Random();
        correctNumber = rand.nextInt();

    }
}