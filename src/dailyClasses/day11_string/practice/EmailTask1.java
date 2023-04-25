package dailyClasses.day11_string.practice;

/*

6. Create a class calledEmailTask1.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

    Write a program that can swap first name with last name in the email (Separated by an underscore).
    If the email doesn't contain an underscore print the given input email.

        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com

 */


public class EmailTask1 {

    public static void main(String[] args) {

        String email = "mike_tyson@gmail.com";

        String firstName, lastName, domain;

        int atSign = email.indexOf('@');
        int underSign = email.indexOf('_');

        firstName = email.substring(0, underSign);
        lastName = email.substring(underSign + 1, atSign);
        domain = email.substring(atSign);

        System.out.println(lastName + "_" + firstName + domain);

    }

}
