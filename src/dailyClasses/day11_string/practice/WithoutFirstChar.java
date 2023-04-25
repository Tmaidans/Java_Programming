package dailyClasses.day11_string.practice;

/*

4. Create a class named WithoutFirstChar. Ask user to enter two words. Print first word without its first character
    then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana

 */

import java.util.Scanner;

public class WithoutFirstChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your two words");
            String word1 = input.nextLine();
            String word2 = input.nextLine();

        word1= word1.substring(1);
        word2 = word2.substring(1);

        System.out.println(word1+word2);












        input.close();

    }

}
