package dailyClasses.day21_multiDimentionalArray;

import java.util.Arrays;

public class SameLetters2 {

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        Boolean anagram = true;

        char[] str1Char = str1.toCharArray();
        char[] str2Char = str2.toCharArray();
        int counter = 0;

        for (char each : str1Char) {

            for (char each2 : str2Char) {
                if (each == each2) {
                    counter += 1;
                    break;
                }

            }

        }

        if (!(counter == str1.length()) || str1Char.length != str2Char.length) {
            anagram = false;

        }

        System.out.println(anagram);
    }

}