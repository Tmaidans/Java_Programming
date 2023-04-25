package dailyClasses.day06_ifStatements;

/*

1. Create a class named WeekDays.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the day that the number represents
    Ex:
        Given:
            number = 1
    output:
            Monday
Hint: Assume that a number between 1 ~ 7 is given to the variable

 */

public class WeekDays {

    public static void main(String[] args) {

        int number = 5;

        String day = "";

        if (number == 1){
            day = "Monday";
        }
        if (number == 2){
            day = "Tuesday";
        }
        if (number == 3){
            day = "Wednesday";
        }
        if (number == 4){
            day = "Thursday";
        }
        if (number == 5){
            day = "Friday";
        }
        if (number == 6){
            day = "Saturday";
        }
        if (number == 7){
            day = "Sunday";
        }
        System.out.println(day);
    }
}
