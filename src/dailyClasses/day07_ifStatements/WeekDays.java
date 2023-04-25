package dailyClasses.day07_ifStatements;

/*

1. Create a class named WeekDays.java
2. An integer variable named number is declared and given, Write a
program that can print the name of the day that the number represents.
Ex:
Given:
number = 1
output:
Monday
Note: Assume that the given number is between 1 ~ 7

 */

public class WeekDays {

    public static void main(String[] args) {

        int number =3;

        String day;

        if (number ==1){
            day = "Monday";
        }else if (number == 2){
            day = "Tuesday";
        }else if (number == 3) {
            day = "Wednesday";
        }else if (number == 4) {
            day = "Thursday";
        }else if (number == 5) {
            day = "Friday";
        }else if (number == 6) {
            day = "Saturday";
        }else{
            day = "Sunday";
        }

        System.out.println(day);

    }
}
