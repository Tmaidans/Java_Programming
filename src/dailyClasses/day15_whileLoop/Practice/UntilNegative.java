package dailyClasses.day15_whileLoop.Practice;

import java.util.Scanner;

public class UntilNegative {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num = 0,
                sum = 0;

        while (num >= 0) {

            System.out.println("Please enter a number: ");

            num = input.nextDouble();

            if (num < 0) {
                break;
            }
            sum += num;
        }

        System.out.println("sum = " + sum);
    }

}
