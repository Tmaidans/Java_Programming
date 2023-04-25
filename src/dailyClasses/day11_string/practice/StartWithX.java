package dailyClasses.day11_string.practice;

/*

1. Create a class named StartsWithX and write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex


 */

import java.util.Scanner;

public class StartWithX {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input:");

        String word = input.nextLine();

        char firstLetter = word.charAt(0);


        if (firstLetter == 'x') {
            word = word.replaceFirst("x", "a");
        } else if (firstLetter == 'X') {
            word = word.replaceFirst("X", "A");

        }

        System.out.println("Outout is: \n" + word);


        input.close();

    }

}
