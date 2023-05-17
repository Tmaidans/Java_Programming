package dailyClasses.day40_collections;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();

        List<Integer> list2 = new LinkedList<>();

        List<Integer> list3 = new Stack<>();

        List<Integer> list4 = new Vector<>();

        System.out.println("--------------------------------------------------------------------");

        Collection<Integer> collection = new ArrayList<>();
        collection.addAll(Arrays.asList(100, 200, 100, 200, 300, 400, 500, 600));

        System.out.println(collection);

        System.out.println(((ArrayList) collection).get(2));

        //System.out.println((Stack)collection.pop());

        System.out.println("--------------------------------------------------------------------");

        Collection<Integer> collection2 = new HashSet<>();
        collection2.addAll(Arrays.asList(100, 200, 100, 200, 300, 400, 500, 600));
        System.out.println(collection2);

        System.out.println(new ArrayList<>(collection2).get(0));

        List<Integer> l = new ArrayList<>(collection2);


    }

}
