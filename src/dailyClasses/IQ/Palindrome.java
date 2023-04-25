package dailyClasses.IQ;

import utilities.StringUtility;

public class Palindrome {

    public static void main(String[] args) {

        String word = "Level";

            boolean palindrome = word.equalsIgnoreCase(StringUtility.reverse(word));

        System.out.println(palindrome);

    }

}
