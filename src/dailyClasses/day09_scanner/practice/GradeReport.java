package dailyClasses.day09_scanner.practice;

/*

3. Create a class named GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score

 */

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your score: ");

        int score = scan.nextInt();
        String grade = "";


        if (score >= 0 && score <= 100) {

            if (score < 101 && score > 89) {
                grade = "A";
            } else if (score > 79) {
                grade = "B";
            } else if (score > 69) {
                grade = "C";
            } else if (score > 59) {
                grade = "D";
            } else if (score > -1) {
                grade = "F";
            }
        } else {
            grade = "Invalid Score";
        }
        System.out.println("Your score is : "+grade);

        scan.close();
    }




}
