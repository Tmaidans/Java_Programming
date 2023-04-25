package dailyClasses.day08_ternaries_switch.practice;

/*

Create a class called BiggerNum, write a program that checks for the bigger of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"

         NOTE: MUST USE TERNARY

 */

public class BiggerNumber {

    public static void main(String[] args) {

        int n1 = 6,
                n2 = 4,
                n3 = 3;

        String biggerNumber;

            biggerNumber = (n1>n2 && n1>n3)? n1 + " is bigger" :(n2>n1 && n2>n3) ? n2 + " is bigger" : n3 + " is bigger";

        System.out.println(biggerNumber);

    }
}
