package dailyClasses.day13_customMethods;

import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {

        String str =" Java";

        str = str.toUpperCase();

        System.out.println(str);

        int month = new Scanner(System.in).nextInt();

        if (month < 1 || month > 12) {
            System.err.println("Invalid Month Given: " + month);
            return;
        }
        switch (month) { // month 1~12

            case 2:
                System.out.println("28 days");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 Days");
                break;

            default:
                System.out.println("31 days");
        }

    }

}
