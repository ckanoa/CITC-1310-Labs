/*
 * Programmer: Christian Kanoa
 * Date: September 20th, 2018
 * Purpose: To compute the sines, cosines, and tangents of specified angles, and display them in a specified format.
 */
package lab4;

public class Problem1 {

    public static void main(String[] args) {
        //convert and store the angles to raidans for later computation
        double ang0 = Math.toRadians(0);
        double ang30 = Math.toRadians(30);
        double ang45 = Math.toRadians(45);
        double ang60 = Math.toRadians(60);

        //compute, format, and print the table
        System.out.println("==============================================");
        System.out.println("Angle     0         30        45        60");
        System.out.println("==============================================");
        System.out.printf("Sin       %-10.3f%-10.3f%-10.3f%-10.3f\n", Math.sin(ang0), Math.sin(ang30), Math.sin(ang45), Math.sin(ang60));
        System.out.printf("Cos       %-10.3f%-10.3f%-10.3f%-10.3f\n", Math.cos(ang0), Math.cos(ang30), Math.cos(ang45), Math.cos(ang60));
        System.out.printf("Tan       %-10.3f%-10.3f%-10.3f%-10.3f\n", Math.tan(ang0), Math.tan(ang30), Math.tan(ang45), Math.tan(ang60));
        System.out.println("==============================================");
    }
}
