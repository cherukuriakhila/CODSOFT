package codesoft;

import java.util.Scanner;

public class quiz {
    private static final int No_Of_QUESTIONS = 5; 
    private static final int LIMIT_SECONDS = 5; 

    private static String[] questions = {
            "1. Which historical figure is associated with the ancient city of Ayodhya?",
            "2. Which upcoming technology is poised to revolutionize the World?",
            "3. Which of the following is considered one of the biggest achievements of ISRO (Indian Space Research Organisation)?",
            "4. What type of virus causes COVID-19?",
            "5. Which Indian film garnered numerous awards and accolades, including international recognition?"
    };

    private static String[][] options = {
            {"A. Sita", "B. Hanuman", "C. Lord Rama", "D. Ravana"},
            {"A. Quantum Computing", "B. Neural lace", "C. Molecular Nanotecchnology", "D. Fusion Energy"},
            {"A. Launching the Mars Orbiter Mission (Mangalyaan)", "B. Launching the Chandrayaan-1 lunar mission", 
             "C. Developing the Polar Satellite Launch Vehicle (PSLV)", "D. Launching the South Asia Satellite (GSAT-9)"},
            {"A. Influenza virus", "B. Corona virus", "C. Rhinovirus", "D. Adenovirus"},
            {"A. Slumdog Millionaire", "B. Lagaan: Once Upon a Time in India", "C. Dangal", "D. Gully Boy"}
    };

    private static char[] Rightoption = {'C', 'A', 'A', 'B', 'A'};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Quiz Game!");

        for (int i = 0; i < No_Of_QUESTIONS; i++) 
	{
            System.out.println("\n" + questions[i]);
            for (String option : options[i])
	    {
                System.out.println(option);
            }

            System.out.print("Your answer (A/B/C/D): ");
            char chooseAnswer = scan.next().toUpperCase().charAt(0);

            if (chooseAnswer == Rightoption[i])
            {
                System.out.println("Hey,Your Answer is Correct!");
                score++;
            } 
            else 
            {
                System.out.println("Oops,Your Answer is Incorrect! The correct answer is " + Rightoption[i]);
            }

            try 
           {
                Thread.sleep(LIMIT_SECONDS * 1000);
            } 
	  catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nQuiz completed! Your final score is: " + score + "/" + No_Of_QUESTIONS);
    }
}
