package dailyClasses.day06_ifStatements;

/*

2. Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

			Ex:
				number = 200

			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false


 */

public class IdentifyNumber {

    public static void main(String[] args) {

        double number = 12;

        boolean positive = number > 0,
                negative = number <0;
               // zero = number == 0;

        boolean zero = !positive && !negative; // if the number is NOT positive AND NOT negative then it's 0

        System.out.println("Output: ");
        System.out.println("\t" + number + " is a positive number: " + positive);
        System.out.println("\t" + number + " is a negative number: " + negative);
        System.out.println("\t" + number + " is a zero: " + zero);

    }
}
