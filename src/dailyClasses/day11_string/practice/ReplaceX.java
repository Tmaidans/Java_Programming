package dailyClasses.day11_string.practice;

/*

2. Create a class named ReplaceX, and write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea

 */

import java.util.Scanner;

public class ReplaceX {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input:");

        String word = input.nextLine();

        word = word.replaceFirst("x", "a");
        word = word.replaceFirst("x", "a");
        word = word.replaceFirst("x", "a");
        word = word.replaceFirst("x", "a");

        word = word.replaceFirst("X", "A");
        word = word.replaceFirst("X", "A");
        word = word.replaceFirst("X", "A");
        word = word.replaceFirst("X", "A");

        System.out.println("Output is: \n" + word);


        input.close();

    }

}
