package chapter3;

import java.util.Scanner;

public class ChangeForADollar {

    public static void main(String args[]){

        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        int dollar = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to 'change for a Dollar'! " + "Your goal is to make exactly $1.00");

        System.out.println("Enter your number of pennies");
        int numOfPennies = scanner.nextInt();

        System.out.println("Enter your number of nickels");
        int numOfNickels = scanner.nextInt();

        System.out.println("Enter your number of dimes");
        int numOfDimes = scanner.nextInt();

        System.out.println("Enter your number of quarters");
        int numOfQuarters = scanner.nextInt();

        scanner.close();

    }
}
