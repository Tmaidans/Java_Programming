package dailyClasses.day22_arrayList.Practice;

/*

Write a program that can find the maximum & minimum numbers from an ArrayList of integers
        Ex:
            list = [1,2,3,4,5];

            output:
                Maximum number is 5
                Minimum number is 1

 */

import java.util.ArrayList;

public class MaxAndMinInArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(3);
        list.add(3);
        list.add(5);

        int max = list.get(0);
        int min = list.get(0);

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) > max) {
                max = list.get(i);
            }
            if (list.get(i) < min) {
                min = list.get(i);
            }

        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }

}
