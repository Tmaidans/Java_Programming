package dailyClasses.day19_array;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArraysLiteral {

    public static void main(String[] args) {

        int[] numbers = new int[5];

        int[] nums = {10, 20, 30, 40, 50}; //Array Literal

        System.out.println(numbers.length);
        System.out.println(nums.length);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(nums));

        System.out.println("------------------------------------------------");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int selection = 1;

        System.out.println(days[selection - 1]);

        System.out.println("------------------------------------------------");

        String[] months = {"January","February","March", "April", "May", "June","July", "August","September","October","November","December"};

        System.out.println(Arrays.toString(months));

        System.out.println("------------------------------------------------");

        for (int i = months.length - 1; i >= 0; i--) {
            System.out.print(months[i]+" ");
        }

    }

}
