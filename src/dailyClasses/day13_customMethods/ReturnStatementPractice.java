package dailyClasses.day13_customMethods;

import java.util.Scanner;

public class ReturnStatementPractice {

    public static void main(String[] args) {

        int grade = new Scanner(System.in).next().charAt(0);

        boolean isValid = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F';

        if (!isValid) {
            System.out.println("Invalid Grade");
            return; // terminates the main method and exit the program
        }

        System.out.println(grade == 'A' ? "Excellent" : (grade == 'B') ? "Great Job" : (grade == 'C') ? "Good"
                : (grade == 'D') ? "Passed" : "Failed");

    }

}
