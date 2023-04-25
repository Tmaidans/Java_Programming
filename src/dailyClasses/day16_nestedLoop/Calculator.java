package dailyClasses.day16_nestedLoop;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        double answer = 0;

        while (true) {

            System.out.println("Please enter a number: ");
            double num = input.nextDouble();

            System.out.println("Please enter a math operator: ");
            String operator = input.next();

            while (!(operator.equals("-") || operator.equals("+") || operator.equals("*") || operator.equals("/"))) {
                System.err.println("Invaild entry. Please enter a valid operator: ");
                operator = input.next();
            }
            System.out.println("Please enter a second number: ");
            double num2 = input.nextDouble();

            switch (operator) {

                case "+":
                    answer = num + num2;
                    break;

                case "-":
                    answer = num - num2;
                    break;

                case "*":
                    answer = num * num2;
                    break;

                case "/":
                    answer = num / num2;

            }

            System.out.println("The answer is: " + answer);


            System.out.println("would you like to continue? (Yes/No)");
            String yesNo = input.next().toLowerCase();
            while (!(yesNo.equals("yes") || yesNo.equals("no"))) {
                System.err.println("Invalid entry, please say (Yes/No)");
                yesNo = input.next();
            }

            if (yesNo.equals("no")) {
                break;
            }

        }
    }

}
