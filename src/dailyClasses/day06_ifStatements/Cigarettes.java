package dailyClasses.day06_ifStatements;


/*
1. Create a class named Cigarettes.java
2. A variable named age is declared and given, Write a program that
can check if the person is eligible to buy cigarettes
    Ex:
    age = 20
    output:
    You are not eligible to buy Cigarettes
 */

public class Cigarettes {

    public static void main(String[] args) {

        int age = 30;

        if (age >= 21 && age < 100) {

            System.out.println("ELIGIBLE");
        }

        if (age < 21 || age > 100) {

            System.err.println("NOT ELIGIBLE");;

        }

    }


}



