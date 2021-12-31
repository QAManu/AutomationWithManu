package chapter3;

/*
IF ELSE
* All sales people are expected to make atleast 10 sales a week.
* For those who do, they receive a congratulatory message.
* For those who don't, they will be informed that how many sales they were short
 */

import java.util.Scanner;


//Declare variables
public class QuotaCalculator {
    public static void main(String args[]){
    int quota = 10;

//Get values for the unknowns
System.out.println("Enter the number of sales done by employee");
Scanner scanner = new Scanner(System.in);
int sales = scanner.nextInt();
scanner.close();

if (sales >= quota){
    System.out.println("Congratulations you exceeds the sales target!!");
}
else {
    int dif = quota - sales;
    System.out.println("You lack behind sales target by " +dif);
}
}
}
