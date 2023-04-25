package dailyClasses.day21_multiDimentionalArray;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {

        int[] arr1 = {12, 20, 30};
        int[] arr2 = {40, 50, 60, 70, 80};
        int[] arr3 = {90, 100};
        int[] arr4 = {1000, 2000};

        System.out.println("---------------------------------------------------------------------------------");

        int[][] arr2D = {{10, 20, 30}, {40, 50, 60, 70, 80}, {90, 100}, arr4};

        System.out.println(arr2D.length);

    }

}
