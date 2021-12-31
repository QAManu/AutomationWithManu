package chapter3;

import java.util.Scanner;

/*
If statement
All salesmen get a payment of $1000 a week.
Those exceeding more than 10 sales per year will get additional bonus of $250.

 */
public class SalaryCalculator {
    public static void main(String args[]){

        //Initialize the known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //Get values for the unknowns
        System.out.println("Enter the number of sales done by employee in a week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();


        //Quick detours for the bonus earners
        if (sales >quota){
            salary = salary + bonus;
        }
        //Output calculation
        System.out.println("The employee salary is " +salary);
    }
}
