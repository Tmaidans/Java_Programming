package dailyClasses.day09_scanner;

import java.util.Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the day of the week: ");

        int day = input.nextInt();
        String answer;

        switch (day) {

            case 1:
                answer = "Monday";
                break;
            case 2:
                answer = "Tuesday";
                break;
            case 3:
                answer = "Wednesday";
                break;
            case 4:
                answer = "Thursday";
                break;
            case 5:
                answer = "Friday";
                break;
            case 6:
                answer = "Saturday";
                break;
            case 7:
                answer = "Sunday";
                break;
            default:
                answer = "Sorry, no such day";
        }

        System.out.println(answer);

        input.close();

    }
}
