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

public class CombineWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter tow words:");
        String word1 = input.next();
        String word2 = input.next();

        int lengthW1 = word1.length() - 1;
        char lastLetterW1 = word1.charAt(lengthW1);

        char firstLetterW2 = word2.charAt(0);

        String subWord = word1.substring(0, lengthW1) + word2.substring(0);


        if (lastLetterW1 == firstLetterW2) {
            System.out.println(subWord);
        } else {
            System.out.println(word1 + word2);
        }


        input.close();

    }

}
