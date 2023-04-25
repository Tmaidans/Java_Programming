package dailyClasses.day20_forEach;

import java.util.Arrays;

public class ArrayUtilityMethods {

    public static void main(String[] args) {

        int[] score = {70, 100, 80, 90, 65};

        System.out.println(Arrays.toString(score));

        String result = Arrays.toString(score);

        System.out.println(result);

        System.out.println("------------------------------------------------------------------------------");

        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {1, 2, 3, 4, 5};

        boolean r1 = Arrays.equals(a1, a2);

        System.out.println(r1);

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'A', 'B', 'C'};

        boolean r2 = Arrays.equals(ch1, ch2);

        System.out.println(r2);

        System.out.println("------------------------------------------------------------------------------");

        int[] nums = {100, 90, 80, 75, 33, 5, 2, 0, 500};

        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));
        System.out.println("Minimum number: " + nums[0]);
        System.out.println("Maximum number: " + nums[nums.length - 1]);

        System.out.println("------------------------------------------------------------------------------");

        String[] b1 = {"A", "B", "C"};
        String[] b2 = {"A", "C", "B"};

        System.out.println(Arrays.toString(b2));

        Arrays.sort(b1);
        Arrays.sort(b2);

        System.out.println(Arrays.toString(b2));

        System.out.println(Arrays.equals(b1, b2));

        System.out.println("------------------------------------------------------------------------------");

        char[] ch3 = {'A', 'B', 'C'};
        char[] ch4 = {'C', 'B', 'A'};
        System.out.println(Arrays.toString(ch4));
        Arrays.sort(ch4);
        System.out.println(Arrays.toString(ch4));

        System.out.println("------------------------------------------------------------------------------");

        String[] students = {"Madiva", "Ali", "Abidullah", "Alena", "Yaxier"};
        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("------------------------------------------------------------------------------");

        int[] array = {10, 20, 30, 40, 60, 70, 90};

        int[] array2 = Arrays.copyOf(array, 4);

        System.out.println(Arrays.toString(array2));

        int[] n1 = {1, 2, 3, 4, 5};
        int[] n2 = {6, 7, 8, 9, 10, 11};

        int[] n3 = Arrays.copyOf(n1, n1.length + n2.length);

        for (int i = 0, j = n1.length; i < n2.length; i++, j++) {

            n3[j] = n2[i];

        }

        System.out.println(Arrays.toString(n3));

        System.out.println("------------------------------------------------------------------------------");

        char[] ch = {'A','B','C','D','E','F','G'};
        //index:      0   1   2   3   4   5   6
        char[] result2 = Arrays.copyOf(ch,20);

        System.out.println(Arrays.toString(result2));

        char[] result1 = Arrays.copyOfRange(ch,2,5);

        System.out.println(Arrays.toString(result1));

    }

}
