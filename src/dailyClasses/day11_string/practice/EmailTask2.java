package dailyClasses.day11_string.practice;

import java.sql.SQLOutput;

/*

7. Create a class called EmailTask2.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

   Write a program that will print out information about user based on email. Print first name, last name, and domain.

   First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

           Ex:
               input:
                   craig_federighi@apple.com

            Output:
                First name: Craig
                Last name: Federighi
                Domain: apple

 */
public class EmailTask2 {

    public static void main(String[] args) {

        String email = "craig_federighi@apple.com";

        String firstName, lastName, domain;

        int atSign, underScore, dot;

        atSign = email.indexOf('@');
        underScore = email.indexOf('_');
        dot = email.indexOf('.');

        firstName = email.toUpperCase().charAt(0) + (email.substring(1, underScore));

        lastName = email.toUpperCase().charAt(underScore + 1) + email.substring(underScore + 2, atSign);

        domain = email.substring(atSign + 1, dot);


        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain : " + domain);


    }

}
