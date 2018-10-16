/*
 * Programmer: Christian Kanoa
 * Date: September 6th, 2018
 * Purpose: To use GUI dialogue box to take 2 numbers and display the average
 */
package lab2;

import javax.swing.JOptionPane;

public class Problem2 {
    public static void main(String[] args){
        double x = 0.0;
        double y = 0.0;
        double average = 0.0;
        
        //take user input and store into variable x and y
        String input1 = JOptionPane.showInputDialog("Enter the first number");
        x = Double.parseDouble(input1);
        String input2 = JOptionPane.showInputDialog("Enter the second number");
        y = Double.parseDouble(input2);
        
        average = (x + y) / 2;
        
        String output = ("The average of " + x + " and " + y + " is " + average + ".");
        JOptionPane.showMessageDialog(null, output);
    }
}
