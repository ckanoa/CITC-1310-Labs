/*
 * Programmer: Christian Kanoa 
 * Date: Sep 27th, 2018
 * Purpose: Display two tables side by side converting kilograms to pounds, and pounds to kilograms at differing increments.
*/
package lab5;

public class Problem2 {

    public static void main(String[] args) {
        // Starting point on the table for kilograms and pounds matches initialization.
        double kilograms = 1;
        double pounds = 20;
        // Prints the header
        System.out.printf("%-16s%-16s%-10s%-16s%-16s\n", "Kilograms", "Pounds", "|", "Pounds", "Kilograms");
        for (int count = 1; count <= 100; count++) {
            // Accurate kilogram to pound conversion is *2.220462.
            // Accurate pound to kilogram conversion is *.453592. I used these instead of matching the PDF with approval.
            System.out.printf("%-16.0f%-16.1f%-10s%-16.0f%-16.2f\n", kilograms, (kilograms * 2.220462), "|", pounds, (pounds * 0.453592));
            // Increment both base values respectively.
            kilograms += 2;
            pounds += 5;
        }
    }
}
