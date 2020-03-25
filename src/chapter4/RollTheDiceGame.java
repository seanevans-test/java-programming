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
        }
    }
}
