package dailyClasses.day15_whileLoop.Practice;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String username = "";
        String password = "";

        for (int i = 1; i < 4; i++) {

            System.out.println("Please enter username: ");
            username = input.next();

            System.out.println("Please enter password: ");
            password = input.next();

            if ((username.equals("Cydeo")) && (password.equals("Cydeo123"))) {
                System.out.println("Logged in");
                break;
            }
            if (!(username.equals("Cydeo")) || !(password.equals("Cydeo123"))) {

                if (i != 3) {
                    System.out.println("Your credentials are invalid.\n\t You have " + (3 - i) + " attempts left\n");
                } else {
                    System.out.println("Your account is locked");
                }


            }


        }
    }

}