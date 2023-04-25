package dailyClasses.day24_dateAndTime.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));

        list.removeIf(p-> Collections.frequency(list,p)>1);

        System.out.println(list);



    }

}
