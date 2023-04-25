package Sunday_live_reviews.week8;

/*

CountChar [ArrayList, String, loop]

	Create a program that defines an ArrayList of Strings and a char letter. Find how many times the given char letter is found in the words defined in the ArrayList

		Ex:
		Input:
			"java", "html", "css", "java", "javascript", "selenium"
			letter: ‘a’
		Output:
			6

 */

import java.util.ArrayList;
import java.util.Arrays;


public class CountChar {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript", "selenium"));
        char letter = 'v';

        int counter = 0;

        for (String each : list) {

            for (int i = 0; i < each.length(); i++) {

                if (each.charAt(i) == letter) {
                    counter++;
                }

            }


        }

        System.out.println("counter = " + counter);


    }

}
