package chapter2extra;

import java.util.Scanner;

public class additionalchapter2 {

    public static void main(String arg[]){

        Scanner scanner = new Scanner(System.in);

        //1.Ask the user for a month of the year
        System.out.println("Enter a month of the year.");
        String season = scanner.next();

        //2.Ask the user for a whole number
        System.out.println("Enter a whole number.");
        int number = scanner.nextInt();

        //3.Ask the user for an adjective
        System.out.println("Enter an adjective.");
        String adjective = scanner.next();

        scanner.close();

        //4.Display result in order
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");

    }
}
