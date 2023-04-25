package dailyClasses.day11_string;

/*

2. Create a class named LogIn
			2.1 Ask the user to enter the username & password
			2.2 print "You are now logged in" If user entered valid username and password
				otherwise print the error message "Incorrect username or password. Please try again"

			Note: Assume that the valid credentials are:
						username: Cydeo
						password: WoodenSpoon

 */

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter username: ");
        String username = input.nextLine();

        System.out.print("Please enter password: ");
        String password = input.nextLine();

        String corrUser = "Cydeo",
                corrPass = "WoodenSpoon";

        if (username.equals(corrUser) && password.equals(corrPass)) {
            System.out.println("You are now logged in!");

        } else {
            System.err.println("Incorrect username or password. Please try again.");
        }


        input.close();

    }

}
