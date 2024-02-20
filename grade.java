package codesoft;

import java.util.Scanner;

public class grade {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numofsubjects = scan.nextInt();

        int[] marks = new int[numofsubjects];
        int totalMarks = 0;

        for (int i = 0; i < numofsubjects; i++) {
            System.out.print("Enter the marks obtained in subject " + (i + 1) + ": ");
            int mark = scan.nextInt();
            if (mark < 1 || mark > 100) {
                System.out.println("Invalid marks. Please enter marks between 1 and 100 only.");
                i--;
                continue;
            }
            marks[i] = mark;
            totalMarks = totalMarks+mark;
        }

        double averagePercentage = (double) totalMarks / numofsubjects;

        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average percentage: " + averagePercentage + "%");

        char grade;
        if (averagePercentage >= 90)
        {
            grade = 'A';
        }
        else if (averagePercentage >= 80)
        {
            grade = 'B';
        } 
        else if (averagePercentage >= 70) 
        {
            grade = 'C';
        }
        else if (averagePercentage >= 60)
        {
            grade = 'D';
        } else 
        {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);
    }
}
