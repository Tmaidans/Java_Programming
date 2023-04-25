package dailyClasses.day15_whileLoop.Practice;

import java.util.Scanner;

public class DivisibleBy {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String divBy3515 = "",
                divBy3Not15 = "",
                divBy5Not15 = "";

        System.out.print("Please enter ending number: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0) {
                divBy3515 += " " + i;
            }

            if (i % 3 == 0 && i % 15 != 0) {
                divBy3Not15 += " "+ i;
            }

            if (i % 5 == 0 && i % 15 != 0) {
                divBy5Not15 += " " + i;
            }

        }

        System.out.println("Divisible by 15: " + divBy3515);
        System.out.println("Divisible by 5: " + divBy5Not15);
        System.out.println("Divisible by 3: " + divBy3Not15);

    }


}
