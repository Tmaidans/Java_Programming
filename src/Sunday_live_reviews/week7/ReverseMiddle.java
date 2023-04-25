package Sunday_live_reviews.week7;

/*

ReverseMiddle [array, String, loop]

	Create a program that will have a String consisting of three words. Print the String, but the middle word should be reversed

	Ex:
		input: more java please
		ouput: more avaj please

 */


public class ReverseMiddle {

    public static void main(String[] args) {

        String input = "more java please";

        String[] splitArray = input.split(" ");
        String middle = splitArray[1];

        System.out.println(splitArray[0] + " " + utilities.StringUtility.reverse(middle) + " " + splitArray[2]);

    }

}

