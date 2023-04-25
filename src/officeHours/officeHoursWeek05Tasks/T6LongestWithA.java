package officeHours.officeHoursWeek05Tasks;

import java.util.Scanner;

public class T6LongestWithA {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter a character:");
        String letter = input.next();

        input.nextLine();

        System.out.println("Please enter first word:");
        String word1 = input.nextLine();


        System.out.println("Please enter second word:");
        String word2 = input.nextLine();


        System.out.println("Please enter third word:");
        String word3 = input.nextLine();


        String longest = "";

        if (word1.contains(letter) && word1.length() > longest.length()) {
            longest = word1;
        }
        if (word2.contains(letter) && word2.length() > longest.length()) {
            longest = word2;
        }
        if (word3.contains(letter) && word3.length() > longest.length()) {
            longest = word3;
        }
        if (longest.isEmpty()) {

            System.out.println("None of the words contain " + letter);
        } else {
            System.out.println(longest);
        }
    }

}
