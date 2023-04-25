package dailyClasses.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.addAll(number);

        System.out.println(list);

        System.out.println("----------------------------------------------------------");

        ArrayList<Integer> scores = new ArrayList<>();

        scores.addAll(Arrays.asList(75, 85, 94, 70, 80));

        System.out.println(scores);

        System.out.println("----------------------------------------------------------");

        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8};

        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(nums));

        // option 2
        // l1.addAll(Arrays.asList(nums)); // as long as arrays is non-primitive "Integer", "Character"...we can convert to Array List


        System.out.println(l1);

        System.out.println("----------------------------------------------------------");

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Alena","Muhtar","Gadir","Ali"));

        System.out.println(employees);

        boolean hasAlena = employees.contains("Alena");

        boolean hasAlenaGadir = employees.containsAll(Arrays.asList("Alena","Gadir"));

        System.out.println("hasAlena = " + hasAlena);
        System.out.println("hasAlenaGadir = " + hasAlenaGadir);

        System.out.println("----------------------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10,20,30,40,50,60,70,80,20,20,10,20));

        System.out.println(list1);

        list1.removeAll(Arrays.asList(10,20)); //removes all matching elements

        System.out.println(list1);

        System.out.println("----------------------------------------------------------");

        ArrayList<String> developers = new ArrayList<>();
        developers.addAll(Arrays.asList("Alena","Muhtar","Gadir","Ali","Madiyar","Muhtar","Khashavar","Alena"));


        developers.retainAll(Arrays.asList("Alena","Gadir","Muhtar"));

        System.out.println(developers);


    }

}
