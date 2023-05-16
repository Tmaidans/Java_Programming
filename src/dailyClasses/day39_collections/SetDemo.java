package dailyClasses.day39_collections;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(); // order is random
        set1.addAll(Arrays.asList(10,300,500,90,30,14));
        set1.addAll(Arrays.asList(10,300,500,90,30,14));

        System.out.println(set1);

        System.out.println("--------------------------------------------------------------------------------");

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.addAll(Arrays.asList(10,300,500,90,30,14));
        set2.addAll(Arrays.asList(10,300,500,90,30,14));

        System.out.println(set2);

        System.out.println("--------------------------------------------------------------------------------");

        Set<Integer> set3 = new TreeSet<>();
        set3.addAll(Arrays.asList(10,300,500,90,30,14));
        System.out.println(set3);

        System.out.println("--------------------------------------------------------------------------------");

        String[] words = {"Java","Java","Java","Python","C#","C++","Ruby","C#","C#"};
        LinkedHashSet<String> result = new LinkedHashSet<>();
        result.addAll(Arrays.asList(words));

        System.out.println(result);

        for (String each:result) {
            System.out.println(each);
        }

        System.out.println("--------------------------------------------------------------------------------");

        System.out.println(new ArrayList<>(result).get(1));

        words = result.toArray(new String [0]); // convert collection back to array - the fastest data structure
        System.out.println("Words Array " + Arrays.toString(words));

        System.out.println("--------------------------------------------------------------------------------");

        List<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(10,10,10,20,30,40,40,50,50,6,1,1,2,3,3,4,5,6,6)); // best way to sort and remove dupes, is to convert list to Tree set which organizes and removes dupes.
        Set<Integer> sortedList = new TreeSet<>(numbers);
        System.out.println(sortedList);


    }

}
