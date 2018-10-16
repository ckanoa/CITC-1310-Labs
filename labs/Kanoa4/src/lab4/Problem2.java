/*
 * Programmer: Christian Kanoa
 * Date: September 20th, 2018
 * Purpose: A program that prompts the user for a phone number then checks to see if it is valid input.
 */
package lab4;

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        int i = 0;
        //Prompt input, and store it as a String
        System.out.println("Please enter a valid phone number:\nExample: (xxx)-xxx-xxxx or xxx-xxx-xxxx");
        Scanner input = new Scanner(System.in);
        String phone = input.nextLine();
        //Find length of the input
        int len = phone.length();
        //Check cases for valid inputs based on length
        switch (len) {
            case 12:
                //If phone number is valid and formatted, print valid
                if (Character.isDigit(phone.charAt(0))
                        && Character.isDigit(phone.charAt(1))
                        && Character.isDigit(phone.charAt(2))
                        && phone.charAt(3) == '-'
                        && Character.isDigit(phone.charAt(4))
                        && Character.isDigit(phone.charAt(5))
                        && Character.isDigit(phone.charAt(6))
                        && phone.charAt(7) == '-'
                        && Character.isDigit(phone.charAt(8))
                        && Character.isDigit(phone.charAt(9))
                        && Character.isDigit(phone.charAt(10))
                        && Character.isDigit(phone.charAt(11))) {
                    System.out.println("Valid phone number input.");
                } //Otherwise print invalid input
                else {
                    System.out.println("Error: Invalid input. Please enter (xxx)-xxx-xxxx or xxx-xxx-xxxx");
                }
                break;
            //Do the same for the other possible case
            case 14:
                if (phone.charAt(0) == '('
                        && Character.isDigit(phone.charAt(1))
                        && Character.isDigit(phone.charAt(2))
                        && Character.isDigit(phone.charAt(3))
                        && phone.charAt(4) == ')'
                        && phone.charAt(5) == '-'
                        && Character.isDigit(phone.charAt(6))
                        && Character.isDigit(phone.charAt(7))
                        && Character.isDigit(phone.charAt(8))
                        && phone.charAt(9) == '-'
                        && Character.isDigit(phone.charAt(10))
                        && Character.isDigit(phone.charAt(11))
                        && Character.isDigit(phone.charAt(12))
                        && Character.isDigit(phone.charAt(13))) {
                    System.out.println("Valid phone number input.");
                } else {
                    System.out.println("Error: Invalid input. Please enter (xxx)-xxx-xxxx or xxx-xxx-xxxx");
                }
                break;
            //If neither correct length, the input is invalid and prints an error
            default:
                System.out.println("Error: Invalid input. Please enter (xxx)-xxx-xxxx or xxx-xxx-xxxx");
        }
    }
}
