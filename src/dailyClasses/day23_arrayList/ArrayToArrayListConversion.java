package dailyClasses.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayListConversion {

    public static void main(String[] args) {

        String[] arr = {"A","B","C","D"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        char[] arr2 = {'A','B','C','D'};

       // ArrayList<Character> list2 = new ArrayList<>(Arrays.asList(arr2));

        System.out.println(list);
        //System.out.println(list2);


        System.out.println("----------------------------------------------------------");

       // ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Java","Python","C#"));

       // String[] languages = list2.toArray(new String[0]);

       // System.out.println(Arrays.toString(languages));

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

        Integer[] n = nums.toArray(new Integer[0]);

        System.out.println(Arrays.toString(n));



    }

}
