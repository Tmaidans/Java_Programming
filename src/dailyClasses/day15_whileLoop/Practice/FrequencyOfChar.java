package dailyClasses.day15_whileLoop.Practice;

import java.util.Scanner;

public class FrequencyOfChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter = 0;

        System.out.println("Please enter a sentence or a word");
        String str = input.nextLine().toLowerCase();

        System.out.println("Please enter character");
        char char1 = input.next().charAt(0);

        input.close();

        for (int i = 0; i < str.length(); i++) {

            if (!(str.charAt(i) == char1)) {
                continue;
            }
            counter += 1;
        }

        System.out.println("Counter - " + counter);

    }


}
