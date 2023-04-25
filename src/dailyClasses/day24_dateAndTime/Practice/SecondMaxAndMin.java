package dailyClasses.day24_dateAndTime.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondMaxAndMin {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8));

        int secondMax = 0;
        int secondMin = 0;


        list.removeIf(p -> p == Collections.min(list));
        list.removeIf(p -> p == Collections.max(list));

        secondMin=Collections.min(list);
        secondMax=Collections.max(list);

        System.out.println("secondMin = " + secondMin);
        System.out.println("secondMax = " + secondMax);

    }

}
