package dailyClasses.day15_whileLoop;

import java.util.Scanner;

public class Warmup1 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int num, num2;

        System.out.print("Please enter a number: ");
        num = input.nextInt();

        for (int i = 0; i < 4; i++) {

            System.out.print("Please enter a number: ");

            num2 = input.nextInt();

            if (num2 > num) {
                num = num2;
            }

        }
        System.out.println(num);

        input.close();
    }
}