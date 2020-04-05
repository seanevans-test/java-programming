package chapter5;

/*
* First Method
* Write a method that asks a user their name, then greets them by their name.
 */

import java.util.Scanner;

public class Greetings {

    public static void main(String args[]){

        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
    }
}
