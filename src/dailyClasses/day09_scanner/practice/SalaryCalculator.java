package dailyClasses.day09_scanner.practice;

import java.sql.SQLOutput;
import java.util.Scanner;

/*

10. Crreate a class named SalaryCalculator:
		- Ask the user to enter his/her hourlyRate
        - Ask the user how many hours he/she works in a week
        - Ask the user to enter state tax (in percentage)
        - Ask the user to enter federal tax (in percentage)

         -Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome

 */

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your hourly rate: ");
        int rate = scan.nextInt();

        System.out.print("How many hours you work a week: ");
        int hours = scan.nextInt();

        System.out.print("Please enter your state tax: ");
        int stateTax = scan.nextInt();

        System.out.print("Please enter your federal tax: ");
        int federalTax = scan.nextInt();

        int salary = rate * hours;
        int totalTax = (salary*stateTax/100)+(salary*federalTax/100);

        System.out.println("Here is a break down of your salary:" +
                "\n Salary = " + salary +
                "\n State Tax paid = " + salary*stateTax/100 +
                "\n Federal Tax Paid = " + salary*federalTax/100 +
                "\n Total Tax Paid = " + totalTax +
                "\n Your NET income = " + (salary - totalTax));

        scan.close();
    }

}
