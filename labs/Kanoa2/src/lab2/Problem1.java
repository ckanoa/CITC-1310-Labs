/*
 * Programmer: Christian Kanoa
 * Date: September 6th, 2018
 * Purpose: To find the area and perimeter of a rectangle given its length and width from the console.
 */
package lab2;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args){
        double length = 0.0;
        double width = 0.0;
        double area = 0.0;
        double perimeter = 0.0;
        
        System.out.println("Enter the length: ");
        Scanner input1 = new Scanner(System.in);
        length = input1.nextDouble();
        
        System.out.println("Enter the width: ");
        Scanner input2 = new Scanner(System.in);
        width = input2.nextDouble();
        
        area = length * width;
        perimeter = 2 * (length + width);
        
        System.out.println("The rectangle has...\nArea:      " + area + "\nPerimeter: " + perimeter);
    }
}
