package chapter3;

import java.util.Scanner;

/*
* LOGICAL OPERATORS
* To qualify for a loan, a person must make at least $30000
* and have been working at their current job for atleast 2 years
 */
public class LogicalOperatrLoanQualifier {
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
        if (salary >= requiredsalary && years >= requiredyears){
                System.out.println("Congrats! you qualified for loan");
            }

        else {
            System.out.println("Sorry! you haven't qualified for loan");
        }
    }
}
