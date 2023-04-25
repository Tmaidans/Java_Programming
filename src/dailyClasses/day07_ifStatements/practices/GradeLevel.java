package dailyClasses.day07_ifStatements.practices;

/*

1. Create a class named GradeLevel.java
2. An integer variable named gradeLevel is declared and given, Write a
program to determine and print which school type someone is in.
Ex:
gradeLevel = 2
output:
Elementary School
The grade level and types are:
1 ~ 5: Elementary school
6 ~ 8: Middle school
9 ~ 12: High school
13 ~ 16: College
17 ~ 18: Grad School
Note: Assume that the given number is between 1 ~ 18

 */

public class GradeLevel {

    public static void main(String[] args) {

        int gradeLevel = 6;

        String classLevel = "Your class level is: ";

        if (gradeLevel < 6) {
            classLevel += "Elementary School";
        } else if (gradeLevel < 9) {
            classLevel += "Middle School";
        } else if (gradeLevel < 13) {
            classLevel += "High School";
        } else if (gradeLevel < 17) {
            classLevel += "College";
        } else {
            classLevel += "Grad School";
        }

        System.out.println(classLevel);
    }
}