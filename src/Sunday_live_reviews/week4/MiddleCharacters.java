package Sunday_live_reviews.week4;

/*

MiddleCharacters [indexes, cases, length]

	Create a program that will ask the user to enter a word. Return the word in lowercase expect for the middle character/s in uppercase

	Note: based on if the word is even or odd there will be either two middle characters(even length) or one middle character (odd length)

	Ex:
		input:
			apple
		output:
			apPle

		input:
			JavA
		output:
			jAVa

 */

import java.util.Scanner;

public class MiddleCharacters {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word: ");
        String word = input.nextLine(); //input.nextLine().toLower.Case();


        int lenth = word.length();

        if (lenth % 2 != 0) {

            word = word.toLowerCase();
            String half1 = word.substring(0, lenth / 2),
                    half2 = word.substring(lenth / 2),
                    firstChar = half2.substring(0, 1), //""+charat - to convert char to String
                    firstUpper = firstChar.toUpperCase();
            half2 = half2.replaceFirst(firstChar, firstUpper);

            System.out.println(half1 + half2);


        } else {

            word = word.toLowerCase();
            String half1 = word.substring(0, lenth / 2 - 1),
                    half2 = word.substring(lenth / 2 - 1),
                    firstChar = half2.substring(0, 2),
                    firstUpper = firstChar.toUpperCase();
            half2 = half2.replaceFirst(firstChar, firstUpper);

            System.out.println(half1 + half2);


        }


        input.close();

    }

}
