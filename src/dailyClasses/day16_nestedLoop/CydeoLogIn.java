package dailyClasses.day16_nestedLoop;

import java.util.Scanner;

public class CydeoLogIn {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String username = "";
        String password = "";

        for (int i = 1; i < 5; i++) {

            System.out.println("Please enter username: ");
            username = input.next();

            System.out.println("Please enter password: ");
            password = input.next();

            if ((username.equals("Cydeo")) && (password.equals("WoodenSpoon"))) {
                System.out.println("Logged in");
                break;
            } else {

                if (i != 4) {
                    System.out.println("Your credentials are invalid.\n\t You have " + (4 - i) + " attempts left\n");
                } else {
                    System.out.println("Your account is locked");
                }


            }


        }

        input.close();

    }

}