/*
 * Programmer: Christian Kanoa 
 * Date: Sep 27th, 2018
 * Purpose: Find the minimum sales needed to obtain a 30,000 dollar salary based on a graduated commission rate.
*/
package lab5;

public class Problem3 {

    public static void main(String[] args) {
        // Desired salary is 30,000, minus what we make by default (5000), commission on our first 5000 in sales, and commisson our second 5000 in sales.
        double desiredSalary = 30000 - 5000 - (5000 * .08) - (5000 * .1);
        double sales = 0;
        // Count down the remaining commission needed by calculating the commission made on each sales amount we could make, up until we meet our goal. 
        for (double countdown = desiredSalary; countdown > 0; sales += .01) {
            countdown = desiredSalary;
            countdown -= (sales * .12);
        }
        // When we print our sales, we need to account for the initial 10,000 in sales we made earlier. 
        System.out.printf("We need to make $%,-3.2f in sales to reach $30,000 a year.\n", (sales + 10000));
    }
}
