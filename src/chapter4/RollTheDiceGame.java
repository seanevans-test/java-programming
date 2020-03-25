package chapter4;

/*
*Create a game where the objective is to travel across the board of 20 spaces
* in 5 dice rolls.
 */

import java.util.Random;

public class RollTheDiceGame {

    public static void main(String args[]){
        int lastSpace = 20;
        int currentSpace = 0;
        int maxRolls = 5;
        Random random = new Random();

        System.out.println("Welcome to roll the dice, let's begin ");

        for (int i=1; i<maxRolls; i++){

            int dice = random.nextInt(6) + 1;
            currentSpace = currentSpace + dice;

            System.out.print(String.format("Roll #%d: You have rolled a %d. ", i, dice));

            if (currentSpace == lastSpace){
                System.out.print("You are on space" + currentSpace + ". Congrats! you win.");
                break;
            }
            else if (currentSpace > lastSpace){
                System.out.print("Unfortunately, that takes you past " + lastSpace + " spaces. You lose!");
                break;
            }
            else if (i==maxRolls && currentSpace< lastSpace){
                System.out.println("You are on space " + currentSpace + ".");
                System.out.println("Unfortunately you did not make it to all" + lastSpace + " spaces. You lose!");
            }
            else{
                int spacesToGo = lastSpace - currentSpace;
                System.out.print("You are now on space " + currentSpace + " you have " + spacesToGo + " more to go.");
            }
            System.out.println();
        }
    }
}
