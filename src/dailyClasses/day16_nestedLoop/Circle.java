package dailyClasses.day16_nestedLoop;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Please enter the radius of a circle: ");
            int radius = input.nextInt();

            if (radius == 0 || radius < 0) {
                System.err.println("Invalid Entry for the radius of the circle");
                break;
            }
            System.out.println("Diameter of a circle is: " + (radius * 2));
            System.out.println("Area of a circle is: " + (radius * radius * 3.14));
            System.out.println("Perimeter of a circle is: " + (2 * radius + 3.14));
            System.out.println();

            System.out.println("Would you like to calculate another circle?");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid Entry. Please say yes/no");
                answer = input.next().toLowerCase();
            }

            if (answer.equals("no")) {
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                break;
            }

        }

    }

}


