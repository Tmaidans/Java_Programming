package dailyClasses.day11_string;

/*

1. Create a class named LongestString
			1.1 Ask the user to enter two strings
			1.2 Write a program that can print the longest string, if both have the same number of characters then print "Equal"

 */

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter first string: ");
        String string1 = input.nextLine();

        System.out.print("Please endter second string: ");
        String string2 = input.nextLine();


        int str1 = string1.length();
        int str2 = string2.length();

        if (str1 > str2) {
            System.out.println(string1 + " - is the longest string");
        }else if (str1<str2){
            System.out.println(string2 + " - is the longest string ");
        }else{
            System.out.println("Both strings are equal in length");
        }


        input.close();

    }


}
