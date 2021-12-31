package chapter3;

import java.util.Scanner;

/*
* NESTED IF STATEMENT
* To qualify for a loan, a person must make at least $30000
* and have been working at their current job for atleast 2 years
 */
public class LoanQualifier {
    public static void main(String args[]){
        // Initialize what we know
        int requiredsalary = 30000;
        int requiredyears = 2;

        //Get what we don't
        System.out.println("Enter your salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter number of years in current job");
        double years = scanner.nextDouble();
        scanner.close();

        //Make decision
        if (salary >= requiredsalary){
            if (years >= requiredyears){
                System.out.println("Congrats! you qualified for loan");
            }
            else {
                System.out.println("Sorry! you must have worked for " + requiredyears + " years");
            }

        }
        else {
            System.out.println("Sorry! your salary must be $" + requiredsalary + " to qualify for loan");
        }
    }
}
