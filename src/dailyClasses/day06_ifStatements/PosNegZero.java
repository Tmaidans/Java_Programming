package dailyClasses.day06_ifStatements;
/*

1. Create a class named PosNegZero.java
2. An integer variable named number is declared and given, Write a
program can identify if the number is positive, negative or zero
Ex:
    number = 20
output:
    Positive

 */
public class PosNegZero {

    public static void main(String[] args) {

        int number = 0;

        if (number >0){

            System.out.println("Positive");
        }

        if (number <0){

            System.out.println("Negative");
        }
        if (number ==0){

            System.out.println("Zero");
        }

    }



}
