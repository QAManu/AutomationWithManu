package chapter4;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class DiceGame {
    public static void main(String args[]) {
        int space = 20;
        int rolls = 5;


        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= rolls; i++) {
            System.out.println("Enter the number you got on dice in attempt #:" + i);
            int number = scanner.nextInt();
            int j = 0;
            j = j + number;

            if (j == space){
                System.out.println("You won the game. Your score reached " + space + " in roll #" + i);
            }
            else if (i == rolls && j!=space){
                System.out.println("You lost the game. You failed to score " + space + " after availing " + i + " attempts");
            }
        }


        scanner.close();

    }
}
