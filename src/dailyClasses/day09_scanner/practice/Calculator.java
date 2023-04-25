package dailyClasses.day09_scanner.practice;

import java.util.Scanner;

/*

9. Create a class named Claculator:
		- Ask the user to enter the first number (double)
		- Ask user to enter a math operator (char)
		- Ask user to enter the second number

		- print the calculation result,
		- if the operator is not a vliad math operator (+, -, *, /), then print "Invalid entry"


 */

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String result="Your result is :";

        System.out.print("Please enter first number: ");
        double n1 = scan.nextDouble();

        System.out.print("Please enter math operator: ");
        char operator = scan.next().charAt(0);

        System.out.print("Please enter second number: ");
        double n2 = scan.nextDouble();


        switch (operator) {

            case '+':
                result += n1 + n2;
                break;

            case '-':
                result += n1 - n2;
                break;

            case '*':
                result += n1 * n2;
                break;

            case '/':
                result += n1 / n2;
                break;

            default:
                result = "Invalid Entry";
        }

        System.out.println(result);

        scan.close();

    }

}
