package Sunday_live_reviews.week7;

/*

Countries [array, String, loops]

    Create a program that defines an array of countries. Use the countries defined below or create your own array that has different country names. Use the countries to display different information defined in the mini tasks

        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia",  "Colombia",
                "Honduras", "Indonesia", "United States"
                };

	- Find and print all the first and last characters

	- Find the largest and smaller countries based on the length of their names

    - Show all the countries that start with a 'C'

    - Show all the countries that end with an 's'

    - Show the countries names in alphabetical order


 */

import java.util.Arrays;

public class Countries {

    public static void main(String[] args) {

        String[] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia", "Colombia",
                "Honduras", "Indonesia", "United States"};

        for (String each : countries) {
            System.out.print("" + each.charAt(0) + each.charAt(each.length() - 1) + " ");
        }

        System.out.println();
        System.out.println("--------------------------------------------------------------");

        String largest = countries[0];
        String smallest = countries[0];

        for (String each : countries) {

            if (each.length() > largest.length()) {
                largest = each;
            }
            if (each.length() < smallest.length()) {
                smallest = each;
            }
        }


        System.out.println("smallest = " + smallest);
        System.out.println("largest = " + largest);

        System.out.println("--------------------------------------------------------------");

        String withC = "";
        String withS = "";

        for (String each : countries) {

            if (each.charAt(0) == 'C') {
                withC += each + ", ";
            }
            if (each.charAt(each.length() - 1) == 's') {
                withS += each + ", ";
            }
        }

        System.out.println("withS = " + withS);
        System.out.println("withC = " + withC);

        System.out.println("--------------------------------------------------------------");

        Arrays.sort(countries);
        String sorted = "";
        for (String each : countries) {
            sorted += each + ", ";
        }

        System.out.println("sorted = " + sorted);

    }


}
