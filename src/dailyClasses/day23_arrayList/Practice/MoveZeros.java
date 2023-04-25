package dailyClasses.day23_arrayList.Practice;

/*

Write a program that can move all the zeros to the last indexes of ArrayList
            ex:
                list: {1,0,2,0,3,0,4,0}

            output:
                [1, 2, 3, 4, 0, 0, 0, 0]

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveZeros {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {

            if(list.get(i)==0){
                list.add(list.size()-1,list.get(i));
                list.remove(list.get(i));

            }

        }

        System.out.println(list);

    }

}
