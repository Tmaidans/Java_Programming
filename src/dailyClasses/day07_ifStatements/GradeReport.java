package dailyClasses.day07_ifStatements;

/*

1. Create a class named GradeReport.java
2. An integer variable named score is declared and given, Write a
program that can print the grade of the student
Ex:
score = 95
output:
Your grade is A
Note: Assume that the given score is between 0 ~ 100

 */

public class GradeReport {

    public static void main(String[] args) {

        int score = 65;

        String result = "Your grade is: ";


        if (score >= 85) {
            result += "A";
        } else if (score >= 75) {
            result += "B";
        } else if (score >= 65) {
            result += "C";
        } else if (score >= 55) {
            result += "D";
        } else {
            result = "YOU HAVE FAILED";
        }

        System.out.println(result);

    }
}
