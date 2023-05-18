package dailyClasses.day40_collections;

import java.util.*;

public class IterableExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 4, 5, 5, 2, 3, 4, 5, 6, 7, 10));

        /*
        for (Integer each : list) {
            if (each<5){
                list.remove(each);
            }
        }



        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)<5){
                list.remove(i);
            }
        }

         */

        System.out.println("-----------------------------------------------------------------");


        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 4, 5, 5, 2, 3, 4, 5, 6, 7, 10));

        Iterator<Integer> it = list2.iterator();

        while (it.hasNext()) {
            Integer each = it.next();
            if (each < 5) {
                it.remove();
            }
        }

        System.out.println(list2);

        System.out.println("----------------------------------------------------------------");

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 4, 5, 5, 2, 3, 4, 5, 6, 7, 10));

        list3.removeIf(each -> each < 5);

        System.out.println(list3);

        System.out.println("----------------------------------------------------------------");

        List<Integer> list5 = new LinkedList<>();
        list5.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 4, 5, 5, 2, 3, 4, 5, 6, 7, 10));

        list5.removeIf(p -> p < 5);

        System.out.println("----------------------------------------------------------------");
    }

}
