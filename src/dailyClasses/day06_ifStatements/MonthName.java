package dailyClasses.day06_ifStatements;

/*

1. Create a class named MonthName.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the month that the number
represents
    Ex:
        Given:
            number = 10
    output:
        October

 */

public class MonthName {

    public static void main(String[] args) {

        int number = 12;
        String month =""; // assigned temp value, which later get assigned a different value by "="

        if (number == 1){
            month = "January";
        }
        if (number == 2){
            month = "February";
        }
        if (number == 3){
            month = "March";
        }
        if (number == 4){
            month = "April";
        }
        if (number == 5){
            month = "May";
        }
        if (number == 6){
            month = "June";
        }
        if (number == 7){
            month = "July";
        }
        if (number == 8){
            month = "August";
        }
        if (number == 9){
            month = "September";
        }
        if (number == 10){
            month = "October";
        }
        if (number == 11){
            month = "November";
        }
        if (number == 12){
            month = "December";
        }
        System.out.println(month);
    }
}
