package Sunday_live_reviews.week4;

/*

Hotel [scanner, conditional, operators]

	Create a program that will allow you to check into a hotel. When checking in some information will be gathered and used to determine the information about the room and price

	Go through the following flow:

		Welcome to the Java Hotel
		How many days will you stay
		-> read number of days from console
		How many people are in your party
		-> read number of people from console

	In addition declare these variables:
		price, room type

	Use the information gathered to assign a room to the guests and print the information

	Data:
		number of people: 1
		assigned to a single room
		price is: number of days staying * 100

		number of people: 2
		assigned to a double room
		price is: number of days staying * 125

		number of people: 3 or 4
		assigned to a large room
		price is: number of days staying * number of people * 50

		number of people: 5 or 6
		assigned to a suite
		price is: number of days staying * 1000

		any other number of people is invalid and should output:
			sorry $number_of_people is not a valid group size

 */

import java.util.Scanner;

public class Hotel {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Java Hotel\nHow many days will you stay?");
        int days = input.nextInt();

        System.out.println("How many people are in your party?");
        int people = input.nextInt();

        input.close();

        double price = 0;
        String roomType = "";

        if (people > 0 && people < 7) {

            switch (people) {

                case 1:
                    price = days * 100;
                    roomType = "single";
                    break;

                case 2:
                    price = days * 125;
                    roomType = "double";
                    break;

                case 3:
                case 4:
                    price = days * people * 50;
                    roomType = "large";
                    break;

                case 5:
                case 6:
                    price = days * 1000;
                    roomType = "suite";
                    break;
            }

            System.out.println("Number of people: " + people);
            System.out.println("assigned to a " + roomType + " room");
            System.out.println("Total price: " + price);


        } else {
            System.err.println("sorry, " + people + " is not a valid group size");
        }


    }

}
