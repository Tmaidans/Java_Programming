package dailyClasses.IQ;

/*

[IQ] Second Biggest Number [ArrayList, loop, conditional]

	Create a program that will have an ArrayList of Integers. Find the second biggest number in the list.
	Note: the 2nd biggest should be unique meaning it should be different from the max number

Example:
	Input:
		[4,3,1,4,5,2,4,8,4,8]
	Output:

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondBiggestNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,3,1,4,5,2,4,8,4,8));
        Collections.sort(list);
        Collections.reverse(list);

        Integer min = list.get(0);

        System.out.println(list);

        for (Integer each : list) {

            if (each<min){
                System.out.println(each);
                break;
            }

        }

    }

}
