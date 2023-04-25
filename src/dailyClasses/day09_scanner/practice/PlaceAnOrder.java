package dailyClasses.day09_scanner.practice;

import java.util.Scanner;

/*

7. Create a class named PlaceAnOrder:
                Ask User to enter the prodcut name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.

 */


public class PlaceAnOrder {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.print("Please enter product name: ");
        String productName = scan.nextLine();

        System.out.print("Please enter price: ");
        double price = scan.nextDouble();

        System.out.print("Please enter quantity: ");
        int quantity = scan.nextInt();

        scan.nextLine();

        System.out.print("Please enter your first name: ");
        String firstName = scan.nextLine();

        System.out.println(firstName + ", your order for " + quantity + " " + productName + " has been placed. Your " +
                "total is " + price);

        scan.close();
    }
}
