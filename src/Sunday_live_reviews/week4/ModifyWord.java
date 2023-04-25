package Sunday_live_reviews.week4;

/*

ModifyWord [indexes, conditional]

	Create a program that will ask the user to enter a word. Check if the word starts and ends with the same character. If they are the same delete those characters

	if the characters we not the same replace the first charter to be '*' and the last character to be #

	print the results

 */

import java.util.Scanner;

public class ModifyWord {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word:");
        String word = input.nextLine();

        char firstChar = word.charAt(0);
        int length = word.length();
        char lastChar = word.charAt(length - 1);
        String middle = word.substring(1, length - 1);

        if (firstChar == lastChar) {
            System.out.println(middle);
        } else {
            System.out.println("*" + middle + "#");
        }


        input.close();
    }
}
