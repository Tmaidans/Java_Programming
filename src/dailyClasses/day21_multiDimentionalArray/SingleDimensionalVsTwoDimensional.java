package dailyClasses.day21_multiDimentionalArray;

import java.util.Arrays;

public class SingleDimensionalVsTwoDimensional {

    public static void main(String[] args) {

        int[] arra1D = new int[10];

        System.out.println(Arrays.toString(arra1D));

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8};
        int[] arr3 = {9, 10};
        int[] arr4 = {11, 21, 12, 31, 13};
        int[] arr5 = {22, 23, 34, 545, 56, 66};

        int[] arr6 = {30,40,50,60,70,80,90}; // not possible to add

        int[][] arr2D = new int[5][]; // Index 0~4

        arr2D[0] = arr2;
        arr2D[1] = arr1;
        arr2D[2] = arr3;
        arr2D[3] = arr4;
        arr2D[4] = arr5;

        System.out.println(Arrays.deepToString(arr2D));
    }
}
