package dailyClasses.day14_forLoop;

import java.util.Scanner;

public class ForLoopPractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int sum =0;

        for (int i = 1; i < 6; i++) {

            System.out.println("Please enter number " + i);
               int number = input.nextInt();
               sum+=number;

        }

        System.out.println("sum = " + sum);

    }

}
