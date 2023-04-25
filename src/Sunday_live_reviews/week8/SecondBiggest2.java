package Sunday_live_reviews.week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondBiggest2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,3,1,4,5,2,4,8,4,8));
        Collections.sort(list);
        Collections.reverse(list);

        int min = list.get(0);

        System.out.println(list);

        for (Integer each : list) {

            if (each<min){
                System.out.println(each);
                break;
            }

        }

    }

}
