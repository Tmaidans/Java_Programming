package dailyClasses.day06_ifStatements;

public class SingleIfStatementPractice {

    public static void main(String[] args) {

        double number = 13;

        boolean even = number % 2 == 0; //When we divide a number by 2, if the remainder is 0, means the number is even


        System.out.println("\nGiven number: " + number + "\n");
        System.out.println("\tOutput:");

        if (even) {

            System.out.println(number + " is an even number");

        }

        if (!even) {

            System.out.println(number + " is and odd number");

            System.out.println("----------------------------------------------");

            if (number % 2 == 0) {

                System.out.println(number + " is an even number");
            }

            if (number % 2 != 0) {

                System.out.println(number + " is and odd number");
            }
        }
    }

}
