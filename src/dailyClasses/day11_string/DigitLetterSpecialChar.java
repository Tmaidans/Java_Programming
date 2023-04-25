package dailyClasses.day11_string;

/*

3. Create a class named DigitLetterSpecialChar and wirte a program that can ask the user to enter a word
	        - if the word starts with digits, print "first character is digit"
	        - if the word starts with uppercase letters, print "first character is lowercase letter"
	        - if the word starts with lowercase letters, print "first character is uppercase letter"
	        - if the word starts with special characters, print "first character is special character"


        	HINT: You need to check the ascii table

 */

import java.util.Scanner;

public class DigitLetterSpecialChar {

    public static void main(String[] args) {

        System.out.print("Please enter a word: ");

        String word = new Scanner(System.in).nextLine();

        if (word.length() >=1) {

        char firstChar = word.charAt(0);

                if (firstChar >= '0' && firstChar <= '9') {
                    System.out.println("First character is a number");
                } else if (firstChar >= 'A' && firstChar <= 'Z') {
                    System.out.println("First character is Upper Case");
                } else if (firstChar >= 'a' && firstChar <= 'z') {
                    System.out.println("First character is Lower Case");
                } else {
                    System.out.println("First character is a special number");
                }
            }else{
                System.err.println("Invalid Input");
            }




    }


}
