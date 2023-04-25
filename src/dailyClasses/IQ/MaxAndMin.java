package dailyClasses.IQ;

import java.util.Scanner;

public class MaxAndMin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -2147483647,
                min = 2147483647,
                num;


        for (int i = 0; i < 5; i++) {

            System.out.print("Please enter a number: ");
            num = input.nextInt(); //1 2 3 4 5

            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }

        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        input.close();
    }
}