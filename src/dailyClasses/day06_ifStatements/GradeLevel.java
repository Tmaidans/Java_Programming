package dailyClasses.day06_ifStatements;

/*

1. Create a class named GradeLevel.java
2. An integer variable named gradeLevel is declared and given, Write
a program to determine and print which school type someone is in
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
Assume that the given number is 1 ~ 18

 */

public class GradeLevel {

    public static void main(String[] args) {

        int gradeLevel = 13;
        Boolean elementary = gradeLevel >= 1 && gradeLevel <= 5,
                middle = gradeLevel >= 6 && gradeLevel <= 8,
                high = gradeLevel >= 9 && gradeLevel <= 12,
                college = gradeLevel >= 13 && gradeLevel <= 16,
                gradSchool = gradeLevel >= 17 && gradeLevel <= 18;

        if (elementary) {

            System.out.println("Elementary School");
        }

        if (middle) {

            System.out.println("Middle School");

        }
        if (high) {

            System.out.println("High School");

        }
        if (college) {

            System.out.println("College");

        }
        if (gradSchool) {

            System.out.println("Grad School");

        }

    }
}

