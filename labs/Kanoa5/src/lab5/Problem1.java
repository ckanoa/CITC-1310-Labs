/*
 * Programmer: Christian Kanoa 
 * Date: Sep 27th, 2018
 * Purpose: Prompt the user to enter 1-10 integers and display the number of even and odd integers, the largest integer, 
 * average of even, and average of odd integers. 
 */
package lab5;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        int largest = 0;
        double evenSum = 0;
        double oddSum = 0;
        // Take input as the number of integers to be generated.
        System.out.println("Specify an amount of integers to generate:");
        Scanner input = new Scanner(System.in);
        int intTotal = input.nextInt();
        // Loop counts up to the number of integers specified.
        for (int count = 1; count <= intTotal; count++) {
            // Generates a random number 1 - 10 inclusive.
            int num = 1 + (int) (Math.random() * 10);
            System.out.printf("%-1d ", num);
            // Checks for even numbers, increments our count of even numbers, and adds their sums.
            if (num % 2 == 0) {
                even++;
                evenSum += num;
            // This does the same for odd numbers.
            } else {
                odd++;
                oddSum += num;
            }
            // Check to see if our current number is greater than any number we've generated so far. If so, the larger number replaces it as "largest".
            if (num > largest) {
                largest = num;
            }
        }
        // Print results, accounting for no even or no odd entries.
        System.out.println("\nNumber of even integers: " + even);
        System.out.println("Number of odd integers: " + odd);
        System.out.println("The largest integer: " + largest);
        if (even == 0) {
            System.out.println("Average of even integers: 0");
        } else {
            System.out.printf("Average of even integers: %-3.2f\n", (evenSum / even));
        }
        if (odd == 0) {
            System.out.println("Average of odd integers: 0");
        } else {
            System.out.printf("Average of odd integers: %-3.2f\n", (oddSum / odd));
        }
    }
}
