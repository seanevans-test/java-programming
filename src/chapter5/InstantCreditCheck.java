package chapter5;

/*
*Variable Scope
* Write an 'Instant Credit Check' program that approves anyone who
* makes more than £25,000 and has a credit score of 700 or better.
* Reject all others.
 */

import java.util.Scanner;

public class InstantCreditCheck {

    public static void main(String args[]){

        //Initialise what we know
        int requiredSalary = 25000;
        int requiredCreditScore = 700;

        //Get what we don't know

        //Check if the user is qualified

        //Notify the user

    }

    public static void getFormData(){
        System.out.println("Enter your Salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();

        scanner.close();
    }
}
