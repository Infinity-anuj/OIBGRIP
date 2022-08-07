import java.util.Random;
import java.util.Scanner;

public class Number_Guessing {
    public Number_Guessing()
    {

    }
    public static  void main(String [] args)
    {
        int Answer = 0;
        int User_Guess = 0;
        int Guess_Number = 0;
        final  int Max_Guesses = 7;
        String str, Play_Again = "Y";

        Scanner sc = new Scanner(System.in);
        Random generator = new Random();
        Answer = generator.nextInt(100) + 1;

        while (Play_Again.equals("Y") || Play_Again.equals("Y")) {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("******* HEY ! WELCOME TO THE NUMBER GUESSING GAME ******** ");
            System.out.println("-----------------------------------------------------------------------\n");
            System.out.println("*********************************************************************** ");
            System.out.println(">>>>>>>>>>>>>>>  ! GAME RULES ! <<<<<<<<<<<<<< \n \t 1. Guess a Number Between 1 to 100 " +
                    "\n \t 2. Maximum Attempts = 7 \n \t 3. Press 0 to Quit the Game  ");
            System.out.println("***********************************************************************\n");
            System.out.println("Guess a Number");

            User_Guess = sc.nextInt();
            Guess_Number = 0;
            while (User_Guess != 0)
            {
                Guess_Number++;
                if(User_Guess == Answer)
                {
                    System.out.println("******* Perfect!  You Got the right Answer ********** ");
                    break;
                }
                else if(User_Guess < Answer)
                {
                    System.out.println("Opss ! Your Guess was too LOW, try some Higher Number " );
                }
                else if(User_Guess > Answer)
                {
                    System.out.println("Opss! Your Guess was too High, try some Lower Number ");
                }
                if (Guess_Number == Max_Guesses)
                {
                    System.out.println(" ## MAXIMUM_ATTEMPTS ## -- The Answer was " + Answer + " \n -------- BETTER LUCK NEXT TIME ------------ ");
                    break;
                }
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Enter Your Guess ");;
                User_Guess = sc.nextInt();
                System.out.println("-----------------------------------------------------------------------");
            }
            System.out.println("Want to PLay Again ? (Y/N)");
            Play_Again = sc.next();
        }
        System.out.println(("-------------------- THANKS FOR PLAYING GAME ---------------------- "));
    }
}
