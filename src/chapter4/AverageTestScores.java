package chapter4;

/*
* NESTED LOOPS:
* Find the average of each student's test scores
 */

import java.util.Scanner;

public class AverageTestScores {
    public static void main(String args[]){

        //Initialise what we know
        int numberOfStudents = 24;
        int numberOfTests = 4;

        Scanner scanner = new Scanner(System.in);

        //Process all students
        for (int i=0; i< numberOfStudents; i++){

            double total = 0;
            for (int j=0; j< numberOfTests; j++){
                System.out.println("Enter the score for the test #" + (j+1));
            }
        }
        scanner.close();
    }
}
