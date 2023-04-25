package officeHours.officeHoursWeek03Tasks;

/*

T1BasicCalculator [variables, operators, concatenation]

    Create a program that will define two double variables. Take the two numbers are perform all the mathematical operations on them ( + - * / % )
    Output in this format:
        num1 operator num2 = result

    Ex:
        num1 = 5
        num2 = 2

        output:
        5 + 2 = 7
        5 - 2 = 3

 */

public class T1BasicCalculator {

    public static void main(String[] args) {

        double num1 = 3,
                num2 = 2;

        System.out.println("Number one = " + num1 + "\nNumber two = " + num2 + "\n\nOutput:\n" + num1 + " + " + num2 + " = " +
                (num1 + num2) + "\n" + num1 + " - " + num2 + " = " + (num1 - num2) + "\n" + num1 + " * " + num2 + " = " +
                (num1 * num2) + "\n" + num1 + " / " + num2 + " = " + (num1 / num2) + "\n");

    }


    }


