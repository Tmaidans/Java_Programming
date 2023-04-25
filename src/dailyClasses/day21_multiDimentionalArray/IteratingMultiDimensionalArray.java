package dailyClasses.day21_multiDimentionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {

    public static void main(String[] args) {


        int[][] arr2D = {{10, 20, 30}, {40, 50, 60, 70, 80}, {90, 100}};

        for (int[] each1DArray : arr2D) {
            System.out.println(Arrays.toString(each1DArray));

            for (int each : each1DArray) {
                System.out.println(each);
            }

        }

        System.out.println("-----------------------------------------------------------------------------");


        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.println(arr2D[i][j]);
            }
        }

        System.out.println("-----------------------------------------------------------------------------");

        for (int[] each1DArray : arr2D) {
            for (int eachElement : each1DArray) {
                System.out.println(eachElement);
            }
        }

    }

}
