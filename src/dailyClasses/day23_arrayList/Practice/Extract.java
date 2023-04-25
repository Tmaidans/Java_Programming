package dailyClasses.day23_arrayList.Practice;

/*

Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}

 */

import utilities.ArraysUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class Extract {

    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";

        char[] strArray = str.toCharArray();

        System.out.println(Arrays.toString(strArray));

        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> special = new ArrayList<>();

        for (char each : strArray) {

            if (Character.isDigit(each)) {
                digits.add(each);

            } else if (Character.isLetter(each)) {
                letters.add(each);
            } else {
                special.add(each);
            }

        }

        System.out.println("special = " + special);
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);

    }

}