package dailyClasses.day21_multiDimentionalArray;

import utilities.ArraysUtility;

import java.util.Arrays;

public class AddElements {

    public static void main(String[] args) {

        int[] array2 = {1, 2, 3, 4, 5};
        int element2 = 6;

        int[] new_array = Arrays.copyOf(array2, array2.length + 1);
        new_array[new_array.length - 1] = element2;

        System.out.println(Arrays.toString(new_array));

        System.out.println("--------------------------------------------------------------------------");

        int[] number = {100, 90, 80, 70, 60};

        System.out.println(Arrays.toString(number));

        number = ArraysUtility.addElement(number, 50);

        System.out.println(Arrays.toString(number));


        char[] array = {'a','b','c','d'};
       char element = 'c';

        System.out.println(ArraysUtility.contains(array,element));




    }


}
