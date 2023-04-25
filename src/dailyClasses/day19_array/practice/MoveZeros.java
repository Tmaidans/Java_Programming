package dailyClasses.day19_array.practice;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {

        int[] arrayExample = {10, 0, 0, 5, 0, 1, 0, 15, 22, 0, 3, 5, 1, 10, 0};
        //
        System.out.println(Arrays.toString(arrayExample));

        for (int i = 0; i < arrayExample.length; i++) {

            if (arrayExample[i] == 0) {

                for (int j = i; j < arrayExample.length; j++) {
                    if (arrayExample[j] != 0) {
                        arrayExample[i] = arrayExample[j];
                        arrayExample[j] = 0;
                        break;
                    }
                }
            }

        }

        System.out.println(Arrays.toString(arrayExample));

    }


}


