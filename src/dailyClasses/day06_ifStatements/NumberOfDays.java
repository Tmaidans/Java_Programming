package dailyClasses.day06_ifStatements;

/*

1. Create a class named NumberOfDays.java
2. An integer variable named month is declared and given, Write a
program that can print the number of days in the given month
    Ex:
        Given:
            number = 1
    output:
        31 days
Hints:
    Months that has 31 days are: 1, 3, 5, 7, 8, 10, 12
    Months that has 30 days are: 4, 6, 9, 11
    Month that has 28 days: 2

 */

public class NumberOfDays {

    public static void main(String[] args) {

        int month = 4;

        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11,
                days28 = month == 2,
                days31 = !days30 && !days28; //Remainder of the months
        String days = "";

        if (days31) {
            days = "31";
        }
        if (days30) {
            days = "30";
        }
        if (days28) {
            days = "28";
        }
        System.out.println(days + " days");

    }
}
