package codesoft;
import java.util.Random;
import java.util.Scanner;

public class guessingnumber {
		    private static final int minnumber = 1;
		    private static final int maxnumber= 100;
		    private static final int maxattempts = 5;

		    private Random random;   
		    private Scanner scan;
		    public guessingnumber()
		    {
		    		  random = new Random();
		    	      scan  = new Scanner(System.in);
		    }

		    public void startGame() {
		        int score = 0;
		        boolean playagain = true;

		        while (playagain) {
		            int secretNum = generateRandomNumber();
		            int attempts = maxattempts;

		            System.out.println("There  is a number between " + minnumber + " to " + maxnumber + ".");
		            System.out.println("Can you guess it? You have " + attempts + " attempts to try this .");
		            

		            while (attempts > 0)
		            {
		                int guess = getUserGuess();
		                if (guess == secretNum) {
		                    System.out.println("Congratulations! You have guessed the correct number");
		                    score++;
		                    break;
		                } else if (guess < secretNum) {
		                    System.out.println("Too low! Try again.");
		                } else {
		                    System.out.println("Too high! Try again.");
		                }
		                attempts--;
		                System.out.println("Attempts left: " + attempts);
		            }

		            if (attempts == 0)
		            {
		                System.out.println("Sorry, you have run out of attempts." );
		                System.out.println("The correct number was " + secretNum);
		            }

		            System.out.println("Your current score: " + score);
		            System.out.println("Do you want to play again? (yes/no)");
		            String playagaininput = scan.next();
		            playagain = playagaininput.equalsIgnoreCase("yes");
		        }

		        System.out.println("Thanks for playing! Your final score is: " + score);
		        scan.close();
		    }

		    private int generateRandomNumber() 
		    {
		        return random.nextInt(maxnumber - minnumber + 1) +minnumber;
		    }
		    private int getUserGuess()
		    {
		        System.out.print("Enter your guess: ");
		        return scan.nextInt();
		    }
		    

		    public static void main(String[] args) {
		    	guessingnumber game = new guessingnumber();
		        game.startGame();
		   



	}

}
