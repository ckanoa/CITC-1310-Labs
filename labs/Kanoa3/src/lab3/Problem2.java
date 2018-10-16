/*
 * Programmer: Christian Kanoa
 * Date: September 13th, 2018
 * Purpose: To display whether or not the user has won a game of rock paper scissors based on user input,
 * conputer generated numbers, and a switch statement.
 */
package lab3;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args){
        int user = 0;
        int computer = 0;
        
        //take user input
        System.out.println("Choose Rock (0), Paper(1), or Scissors(2).");
        Scanner input = new Scanner(System.in);
        user = input.nextInt();
        
        //generate computer input
        computer = (int) (Math.random() * 3);
        
        //compare user to computer and print results
        switch (user){
            case 0:
                if (computer == 0)
                    System.out.println("Draw. You both chose rock!");
                else if (computer == 1)
                    System.out.println("Lose. Paper covers rock!");
                else
                    System.out.println("Win. Rock breaks scissors!");
                break;
            case 1:
                if (computer == 0)
                    System.out.println("Win. Paper covers rock!");
                else if (computer == 1)
                    System.out.println("Draw. You both chose paper!");
                else
                    System.out.println("Lose. Scissors cuts paper!");
                break;
            case 2:
                if (computer == 0)
                    System.out.println("Lose. Rock breaks scissors!");
                else if (computer == 1)
                    System.out.println("Win. Scissors cuts paper!");
                else
                    System.out.println("Draw. You both chose scissors!");
                break;
            default:
                    System.out.println("Invalid input. Please choose 0, 1, or 2");
        }
    }
}
