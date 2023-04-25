package dailyClasses.day15_whileLoop;

import java.util.Scanner;

public class WholeLoopPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = input.nextInt();

        while (!(age >= 1 && age <= 150)) { // while the age is invalid, the statement will get repeated

            System.err.println("Invalid Age. Re-enter your age");
            age = input.nextInt();
        }

        if (age >= 21) {
            System.out.println("You are now eligible to buy alcohol");
        } else {
            System.out.println("You are NOT eligible");
        }

        input.close();

    }
}
