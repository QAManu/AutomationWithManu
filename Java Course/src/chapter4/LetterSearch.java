package chapter4;

import java.util.Scanner;

/*
* FOR LOOP BREAK
* Search a string to determine if it contains the letter 'A'
 */
public class LetterSearch {
    public static void main(String args[]){
        //Get text
        System.out.println("Enter the text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();
        boolean letterFound = false;
        //search text for letter A
        for (int i = 0; i<text.length(); i++){
            char currentletter = text.charAt(i);
            if (currentletter == 'A' || currentletter == 'a'){
                letterFound = true;
                break;
            }
        }
        if (letterFound){
            System.out.println("The text contains the letter 'A'");
        }
        else {
            System.out.println("This text doesn't contains letter 'A'");
        }
    }
}
