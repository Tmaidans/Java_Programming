package dailyClasses.day09_scanner;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter number:");

        int number = scan.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        scan.close();


    }

}
