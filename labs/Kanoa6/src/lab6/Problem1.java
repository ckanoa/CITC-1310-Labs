/*
 * Programmer: Christian Kanoa
 * Date: October 11th, 2018
 * Purpose: To write a method that displays 3 input numbers in ascending order.
 */
package lab6;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        // Take user input for three numbers.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter three numbers:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        displaySortedNumbers(a, b, c);
    }

    // Compare and swap values of the numbers in logical order, largest numbers at the end, smallest at the beginning.
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double temp = 0;
        if (num1 > num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println("In ascending order: " + num1 + ", " + num2 + ", " + num3);
    }

}
