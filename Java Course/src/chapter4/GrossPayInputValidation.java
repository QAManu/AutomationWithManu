package chapter4;

import java.util.Scanner;

/* WhileLoop
* Each store employee makes $15 per hour. Write a program that allows the employee to enter
* the number of hours worked for the week. Do not allow overtime.
 */
public class GrossPayInputValidation {
    public static void main(String args[]){
        //Initialize the known variables
        int rate = 15;
        int maxhours = 40;

    //Get input for unknown variables
        System.out.println("How many hours did you work for this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

    //Validate input
        while (hoursWorked > maxhours || hoursWorked < 1){
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again!");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

      //Calculate Gross
        double gross = rate * hoursWorked;
        System.out.println("Gross Pay: $" + gross);
    }
}
