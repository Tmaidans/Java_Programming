package practices.practice;

/*

3. Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator, write a program that can calculate result of n1&n2 based on the given math Operator.

		char operator -> -, +, *, /

		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30

 */


public class Calculator {

    public static void main(String[] args) {

        double n1 = 8,
                n2 = 1;

        char mathOperator = '+';

        if (mathOperator == '+') {
            System.out.println("Answer = " + (n1 + n2));
        }
        if (mathOperator == '-') {
            System.out.println("Answer = " + (n1 - n2));
        }
        if (mathOperator == '*') {
            System.out.println("Answer = " + (n1 * n2));
        }
        if (mathOperator == '/') {
            System.out.println("Answer = " + (n1 / n2));
        }
    }


}
