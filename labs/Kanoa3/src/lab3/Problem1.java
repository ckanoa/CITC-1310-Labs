/*
 * Programmer: Christian Kanoa
 * Date: September 13th, 2018
 * Purpose: To display the roots of an equation based on the user's input of A, B, and C.
 */
package lab3;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args){
        double a = 0;
        double b = 0;
        double c = 0;
        double r1 = 0;
        double r2 = 0;
        double disc = 0;
        //take user input
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the values of a, b, and c...\na = ");
        a = input.nextDouble();
        System.out.println("b = ");
        b = input.nextDouble();
        System.out.println("c = ");
        c = input.nextDouble();
        //find discriminant sign
        disc = (b * b) - (4 * a * c);
        //calculate roots
        r1 = ((-b) + Math.sqrt(disc)) / (2 * a);
        r2 = ((-b) - Math.sqrt(disc)) / (2 * a);
        //print the roots
        if (disc < 0)
            System.out.println("The equation has no roots.");
        else if (disc == 0)
            System.out.println("The equation has one root.\nRoot 1 is: " + r1);
        else
            System.out.println("The equation has two roots.\nRoot 1 is: " + r1 + "\nRoot 2 is: " + r2);
    }
}
