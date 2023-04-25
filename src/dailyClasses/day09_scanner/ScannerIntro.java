package dailyClasses.day09_scanner;


import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        // Scanner input = new Scanner(System.in); // for reading user input

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");

        byte num1 = input.nextByte();

        System.out.print("Enter second number: ");

        short num2 = input.nextShort();

        System.out.print("Enter third number: ");

        int num3 = input.nextInt();

        System.out.print("Enter fourth number: ");

        long num4 = input.nextLong();

        input.close(); // scanner is closed, cannot use it to get user input again

        System.out.println("enter 5th number: ");

        int num5 = input.nextInt();

        System.out.println("First number is: " + num1 + "\nSecond number is: " + num2 + "\nThird number is: " + num3
                + "\nFourth number is: " + num4 + "\nFourth number is: " + num5);


    }

}
