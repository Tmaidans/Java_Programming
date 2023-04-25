package Sunday_live_reviews.week4;

/*

Name [Scanner, String methods]

	Create a program that will ask the user to enter their name. The name should be accepted as (first name + space + last name). The program will not be able to handle any other format

	Take the name and do two things:
		1) Print the name in correct formatting meaning the first letter of the first name and last name would be uppercase and the rest will be lowercase

		2) Print the initials of the person

 */

import java.util.Scanner;

public class Name {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = input.nextLine();
        name = name.toLowerCase();

        if (name.contains(" ")) {

            int space = name.indexOf(' ');
            String firstName = name.substring(0, space);
            String firstIn = firstName.substring(0, 1);
            String firstUpper = firstIn.toUpperCase();
            firstName = firstName.replaceFirst(firstIn, firstUpper);

            //firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);


            String lastName = name.substring(space);
            String lastIn = lastName.substring(1, 2);
            String lastUpper = lastIn.toUpperCase();
            lastName = lastName.replaceFirst(lastIn, lastUpper);


            System.out.println("Correct Name: " + firstName + "" + lastName);
            System.out.println("Initials: " + (firstUpper + lastUpper));


        } else {
            System.err.println("Invalid name");
        }


        input.close();
    }
}
