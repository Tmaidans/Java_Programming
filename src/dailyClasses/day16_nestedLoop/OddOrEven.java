package dailyClasses.day16_nestedLoop;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {


            System.out.println("Please enter a number");
            int num = input.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " an even number");
            } else {
                System.out.println(num + " an odd odd");
            }

            System.out.println("Would you like to enter another number? yes/no ");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid entry. Would you like to enter another number? yes/no ");
                answer = input.next().toLowerCase();
            }

            if (answer.equals("no")) {
                break;
            }

        }


    }

}
