package dailyClasses.day06_ifStatements;

/*

1. Create a class named OddOrEven, and write a program that can identify if the given number is odd or even
			Ex:
				number = 20

			output:
				20 is an even number: true
				20 is an odd number: false

		Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)


 */

public class OddOrEven {

    public static void main(String[] args) {

        double number = 12;

        boolean even = number % 2 == 0, //When we divide a number by 2, if the remainder is 0, means the number is even
                odd = !even; //output is false if the expression is opposite of even

        System.out.println("\nGiven number: " + number + "\n");
        System.out.println("\tOutput:");

        System.out.println(number + " is an even number: " + even );
        System.out.println(number + " is and odd number: " + odd);





    }


}
