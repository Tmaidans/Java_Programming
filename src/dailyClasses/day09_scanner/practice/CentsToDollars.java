package dailyClasses.day09_scanner.practice;

/*

5. Create a class named CentsToDollars, write a program that can convert cents to dollars
	if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents

 */

import java.util.Scanner;

public class CentsToDollars {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Cents");

        int cents = scan.nextInt();

        int dollars = cents / 100,
                centLeftover = cents % 100;

        System.out.println(cents + " cents equal to: " + dollars + " dollars and " + centLeftover + " cents");


    }

}

