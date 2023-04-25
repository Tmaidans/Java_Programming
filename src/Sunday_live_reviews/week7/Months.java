package Sunday_live_reviews.week7;

/*

Months [array]

	Create a program that will define an array with all the months in order. Use this array to help print the full name of a month by giving a number

	Ex:
		input: 1
		output: January

		input: 11
		output: November

	Other variations of this task we have done before: word to number, number to word

 */

public class Months {

    public static void main(String[] args) {

        int selection = 11;


        String[] months = {"January", "February","March","April","May","June","July","August","Septermber",
        "October","November","December"};

        String output = months[selection-1];


        System.out.println(output);
            }

    }


