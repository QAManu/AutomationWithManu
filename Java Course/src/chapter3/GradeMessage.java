package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String args[]){

        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message;
        switch (grade){
            case "A":
                message = "Excellent Job!";
                break;
            case "B":
                message = "Need Improvement";
                break;
            case "C":
                message = "Hard work needed";
                break;
            case "F":
                message = "Not satisfactory!";
                break;
            default:
                message = "Invalid grade!";
                break;
        }
    System.out.println(message);
    }
}
