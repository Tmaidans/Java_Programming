package dailyClasses.day20_forEach;

import java.util.Arrays;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        int[] number = {1, 3, 4, 5, 1, 6, 1, 32, 4};

        for (int each : number) {
            if (each % 2 != 0) {
                System.out.println(each);
            }
        }

        System.out.println("---------------------------------------------------------------------------");

        int[] nums = {100, 50, 20, 30, 100, 500, 30};

        int max = nums[0];
        int min = nums[0];

        for (int each : nums) {
            if (each > max) {
                max = each;
            }

            if (each < min) {
                min = each;
            }

        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("-------------------------------------------------------------");

        int[] a1 = {10, 30, 50, 60};
        int[] a2 = {60, 50, 70, 80, 90};

        int[] a3 = new int[a1.length + a2.length];

        int k = 0;

        for (int each : a1) {
            a3[k++] = each;
        }

        for (int each : a2) { //k will be already updated by the previous loop and will start where it left off index wise
            a3[k++] = each;
        }

        System.out.println(Arrays.toString(a3));

        System.out.println("-------------------------------------------------------------");

        String[] names = {"Mohammad Karimi", "Vasily Dobrianski", "Gabir Ibrahimov", "Abidullah Rahimi"};

        for (String each : names) {
            System.out.println(each.charAt(0) + "." + each.charAt(each.lastIndexOf(" ") + 1));
        }

    }


}