/*
 * Programmer: Christian Kanoa
 * Date: October 11th, 2018
 * Purpose: To write seperate methods that test the sides of a triangle to see if it is truely a triangle, and if so, return the area of that triangle.
 */
package lab6;

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        // Take user input for three numbers.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter three numbers:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        // If the triangle is valid, print the area, if not, print error statement.
        if (isValidTriangle(a, b, c)) {
            System.out.println("The area of the triangle is: " + area(a, b, c) + ".");
        } else {
            System.out.println("Invalid triangle.");
        }
    }
    // Perform the area calculations on the three sides.
    public static double area(double side1, double side2, double side3) {
        double s = 0;
        s = (side1 + side2 + side3) / 2;
        return (Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)));
    }
    // Compare the sum of two sides to the third side to validate it is a triangle.
    public static boolean isValidTriangle(double side1, double side2, double side3) {
        if ((side1 + side2) > side3 && (side1 + side3) > side2 && (side2 + side3) > side1) {
            return (true);
        }
        return (false);
    }

}
