package dailyClasses.day23_arrayList.Practice;

/*

1. write a program that can set the last element of the Integer arraylist to zero
            ex:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,0];


 */


import utilities.ArraysUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class LastElement {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,7,8));

        System.out.println(list);

        list.set(list.size()-1,0);

        System.out.println(list);






    }

}
