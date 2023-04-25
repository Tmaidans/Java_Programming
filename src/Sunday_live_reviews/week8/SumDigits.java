package Sunday_live_reviews.week8;

/*

SumDigits [Wrapper class, ArrayList, loop]

	Create a program that will define an ArrayList of String. The elements in this ArrayList will be number digits like: "123". Calculate the sum of the digits and store them into a new ArrayList of Integers. Print all the sums of the digits at the end.

		Ex:
			Input:
			["123, "52", "513"]
			Output:
			[6, 7, 9]


 */

import java.util.ArrayList;
import java.util.Arrays;

public class SumDigits {

    public static void main(String[] args) {

        ArrayList<String> digits = new ArrayList<>(Arrays.asList("123", "52", "513","1842"));
        ArrayList<Integer> newList = new ArrayList<>();

        for (int i = 0; i < digits.size(); i++) {

            Integer sum = 0;
            String[] eachArr = digits.get(i).split("");

            for (int j = 0; j < digits.get(i).length(); j++) {
                sum+=Integer.valueOf(eachArr[j]);
            }

            newList.add(sum);

        }

            System.out.println(newList);

        }


    }


