package dailyClasses.day19_array.practice;

import java.util.Arrays;

public class ReverseIntegers {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int[] reversedArr = new int [arr.length];

        System.out.println(Arrays.toString(arr));

        for (int i = 0, j=arr.length-1; i < arr.length; i++, j--) {

        reversedArr[i] = arr[j];

        }

        System.out.println(Arrays.toString(reversedArr));

    }
}

