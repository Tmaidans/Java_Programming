package utilities;

import java.util.ArrayList;

public class ArrayListUtility {

    public static ArrayList<Integer> convertArrToList (int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int each : arr){
            list.add(each);
        }
        return list;

    } //convert primitive array to List

    public static int[] convertListToArr (ArrayList<Integer> list){
        int[] arr = new int[list.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }

        return arr;

    } //converts Array List to primitive type



}
