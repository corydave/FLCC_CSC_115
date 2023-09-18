/*
 * 
 * @author Dave Ghidiu
 * @since 9/18/23
 * 
 * DESCRIPTION: This program asks the user for a number of inches and then converts
 *              it to FEET and remaining INCHES
 * 
 */

import java.util.Scanner;

public class InchesToFeet {
    public static void main (String args[]) {

        convert();

        // System.out.println("\n\nGAME OVER MAN!!!!");
    }

    public static void convert() {
        
        // Create the scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to type in a number
        System.out.println("Enter the number of inches:");

        // Store whatever they type into `totalInches`
        int totalInches = scanner.nextInt(); // user types in 27

        // DEBUG STATEMENTS
        // System.out.print("Total inches = " + totalInches);
        // System.out.println();

        // Divide by 12 (as in INT) to get the number of feet
        int feet = totalInches / 12;     // 27 divided by 12 is 2

        // MOD by 12 to get the number of inches; the "remainder"
        int inches = totalInches % 12;   // 27 modulo 12 is 3

        // Output the state of the variables
        System.out.println(totalInches + " is " + feet + " feet and " + inches + " inches.");

        scanner.close(); // RIP fluffy
        
    }




}