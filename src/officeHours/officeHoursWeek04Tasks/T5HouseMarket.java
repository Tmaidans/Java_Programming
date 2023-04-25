package officeHours.officeHoursWeek04Tasks;

/*

T5HouseMarket [switch, variables]

You are buying a new house and need to collect information about the houses in a specific neighborhoods.

	Create a program that will declare and define the neighborhood name and based on the name return a report of the houses in that area. The report should include this information: the average house price, rating of school districts near by(out of 5), if it is a gated community or not, and if pets are allowed

	print the final report in this format:
		$the houses in the $neighborhood_name on average value at $average_price. This neighborhood $is_gated_or_not and the rating of the school distracts near by is $school_rating out of 5. For the pet owners you $are_or_not in luck because pets are $allowed_or_not_allowed

		Note: for simple use you can print true or false in the gated and pets parts, but for a challenge try to print the message with as many dynamic parts as possible

	Data to use:

		name - Hills
		average price - 89,000
		rating - 4.0
		gated - no
		allow pets - yes

		name - Oaks
		average price - 75,000
		rating - 3.5
		gated - no
		allow pets - yes

		name - Highland
		average price - 150,000
		rating - 4.5
		gated - yes
		allow pets - no

		name - Canyon
		average price - 201,000
		rating - 4.8
		gated - yes
		allow pets - yes

 */

public class T5HouseMarket {

    public static void main(String[] args) {

        String neighbourhood = "Highland";

        //REPORTED ITEMS

        double avgPrice = 0;
        double schoolRating = 0;
        String isGated = "";
        String petsAllowed = "";

        switch (neighbourhood) {

            case "Hills":
                avgPrice = 89000;
                schoolRating = 4.0;
                isGated = "is not";
                petsAllowed = "are";
                break;

            case "Oaks":
                avgPrice = 75000;
                schoolRating = 3.5;
                isGated = "is not";
                petsAllowed = "are";
                break;

            case "Highland":
                avgPrice = 150000;
                schoolRating = 4.5;
                isGated = "is";
                petsAllowed = "are not";
                break;

            case "Canyon":
                avgPrice = 201000;
                schoolRating = 4.8;
                isGated = "is";
                petsAllowed = "are";
                break;

        }


        System.out.println("The house in the " + neighbourhood + " on average value at $" + avgPrice +
                ". This neighbourhood " + isGated + " gated and the rating of the school districts near by is " + schoolRating +
                " out of 5. For the pet owners: you " + petsAllowed + " in luck because pets " + petsAllowed + " allowed.");
    }

}
