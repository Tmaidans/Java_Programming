package dailyClasses.day07_ifStatements;

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

        String answer;

        if (number > 0) {
            answer = "Positive";
        } else if (number < 0) {
            answer = "Negative";
        } else {
            answer = "Zero";
        }

        System.out.println(answer);

    }
}
