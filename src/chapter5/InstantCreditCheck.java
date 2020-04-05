package chapter5;

/*
*Variable Scope
* Write an 'Instant Credit Check' program that approves anyone who
* makes more than £25,000 and has a credit score of 700 or better.
* Reject all others.
 */

import java.util.Scanner;

public class InstantCreditCheck {

    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        //Initialise what we know


        //Get what we don't know
        getFormData();
        scanner.close();

        //Check if the user is qualified
        isUserQualified();

        //Notify the user

    }

    public static void getFormData(){





    }

    public static double getSalary(){
        System.out.println("Enter your Salary:");
        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditScore(){
        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified(){
        if (creditScore >= requiredCreditScore && salary >= requiredSalary){

        }
    }
}
