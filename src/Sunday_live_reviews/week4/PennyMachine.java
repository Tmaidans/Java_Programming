package Sunday_live_reviews.week4;

/*

PennyMachine [scanner, if, operators]

	Create a program that will ask the user to enter the number of pennies they have. Use the number of cents they give and convert them to dollars, quarters, dimes, nickles, and left over pennies. This machine can only handle from 1-1200 cents at a type

	-> if the given cents is not in our defined range (1-1200) print "Sorry we cannot process your request"

	-> if the cents are valid print the result in the following format:
		$initial_cents was converted to $dollars, $quarters, $dimes, $nickles, and $pennies

	Extra challenge: If there is 0 of a specific type do not include it in the final output

 */

import java.util.Scanner;

public class PennyMachine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter number of cents: ");
        int cents = input.nextInt(); //246

        if (cents > 0 && cents <= 1200) {

            int dollars, quarters, nickles, dimes;
            String message = cents + " was converted to: ";

            dollars = cents / 100; // 246 / 100=2
            cents %= 100; // 246 % 100 = 46

            if (dollars>0){
                message+= dollars + " dollars, "; // option 2
            }
            //message+=dollars >0 ? dollars + " dollars, " : ""; - option 2

            quarters = cents / 25; // 46 / 25 = 1
            cents %= 25; // 46 % 25 =21

            message+=quarters >0 ? quarters + " quarters, " : ""; //- option 2

            dimes = cents / 10; //21 / 10 = 2
            cents %= 10; // 21%10 = 1

            message+=dimes >0 ? dimes + " dimes, " : ""; //- option 2

            nickles = cents / 5; // 1 / 5 = 0
            cents %= 5; //1%5 = 1

            message+=nickles >0 ? nickles + " pennies, " : ""; //- option 2


            System.out.println(message);

        } else {
            System.err.println("Invalid entry");
        }


        input.close();

    }


}

