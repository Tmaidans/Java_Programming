package dailyClasses.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8));

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        System.out.println("--------------------------------------------------------");

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Alena","Muhtar","Gadir","Ali","Madiyar","Muhtar","Khashavar","Alena"));

        Collections.sort(names);

        System.out.println(names);

        System.out.println("--------------------------------------------------------");

        Collections.reverse(names); // reverses array list

        System.out.println(names);

        System.out.println("--------------------------------------------------------");

        Collections.swap(names,0,names.size()-1); // swaps character from a collection

        System.out.println(names);
    }

}
