package dailyClasses.day07_ifStatements;

/*

1. Create a class named MonthName.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the month that the number
represents.
Ex:
Given:
number = 10
output:
October
Note: Assume that the given number is between 1 ~ 12

 */


public class MonthName {

    public static void main(String[] args) {

        int monthNumber = 3;

        String monthName;


        if (monthNumber >= 1 && monthNumber <= 12)

            if (monthNumber == 1) monthName = "December";
            else if (monthNumber == 2) monthName = "January";
            else if (monthNumber == 3) monthName = "February";
            else if (monthNumber == 4) monthName = "March";
            else if (monthNumber == 5) monthName = "April";
            else if (monthNumber == 6) monthName = "May";
            else if (monthNumber == 7) monthName = "June";
            else if (monthNumber == 8) monthName = "July";
            else if (monthNumber == 9) monthName = "August";
            else if (monthNumber == 10) monthName = "September";
            else if (monthNumber == 11) monthName = "October";
            else monthName = "November";


        else monthName = "Invalid Input";


        System.out.println("monthName = " + monthName);

    }
}
