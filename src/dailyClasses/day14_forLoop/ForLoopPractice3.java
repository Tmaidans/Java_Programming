package dailyClasses.day14_forLoop;

import java.util.Scanner;

public class ForLoopPractice3 {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int number = 0;

        for (int i = 1; i < 6; i++) {

            System.out.println("Please enter number " + i);
            int num1 = input.nextInt();

            if (num1 > number) {
                number = num1;
            }


        }

        System.out.println("The highest number is: " + number);

    }


}
