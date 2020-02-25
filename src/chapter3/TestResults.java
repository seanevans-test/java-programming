package chapter3;

import java.util.Scanner;

public class TestResults {

    public static void main (String args[]){

        //Get the test score
        System.out.println("Enter your test score here:");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();

        //Determine the letter grade
        char grade;

        if(score < 60){
            grade = 'F';
        }

    }
}
