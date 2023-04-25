package Sunday_live_reviews.week6;

import java.util.Scanner;

public class ShoppingList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String list = "";
        String answer;
            do {

                System.out.println("Please enter the item you would to purchase:");
                String item=input.nextLine();
                list+=item+"\n";

                System.out.println("Would you like to enter another number?");
                answer = input.nextLine().toLowerCase();

            } while (answer.equals("yes"));

        System.out.println("Thank you for using our app for your shopping list. Below is your list:");
        System.out.println(list);

    }

}
