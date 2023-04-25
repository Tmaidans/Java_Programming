package dailyClasses.day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {

        int[] a1 = {10, 20, 30, 40, 50, 60};
        int[] a2 = {70, 80, 90};

        int[] a3 = utilities.ArraysUtility.merge(a1, a2);

        System.out.println(Arrays.toString(a3));

        System.out.println("----------------------------------------------------------------");

        double[] b1 = {10.5, 5.5, 3.5, 6.5};
        double[] b2 = {20.5, 15.5, 13.5};

        double[] b3 = ArraysUtility.merge(b1, b2);


        System.out.println(Arrays.toString(b3));

        System.out.println("----------------------------------------------------------------");

        char[] ch1 = {'b', 'a', 'c', 'D'};
        char[] ch2 = {'X', 'y', 'z'};

        char[]ch3 = ArraysUtility.merge(ch1,ch2);

        System.out.println(Arrays.toString(ch3));

        System.out.println("----------------------------------------------------------------");


    }


}
