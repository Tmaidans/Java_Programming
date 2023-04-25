package dailyClasses.day23_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.add("Eggs");
        groceriesList.add("Paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking oil");

        System.out.println(groceriesList);

        System.out.println("-------------------------------------------------------------------------");

        groceriesList.set(2, "Oranges"); //set new element at index

        System.out.println(groceriesList);

        System.out.println("-------------------------------------------------------------------------");

        groceriesList.add(2, "Chicken"); // add new element

        System.out.println(groceriesList);

        System.out.println("-------------------------------------------------------------------------");

        groceriesList.remove(0);//removes element at index, or a designated element

        System.out.println(groceriesList);

        groceriesList.remove("Paper Towels"); // removes first matchin object

        System.out.println(groceriesList);

        System.out.println("-------------------------------------------------------------------------");

        ArrayList<Integer> number = new ArrayList<>();
        number.add(10); //0
        number.add(20); //1
        number.add(30); //2
        number.add(40); //3
        number.add(50); //4

        boolean r1 = number.remove(Integer.valueOf(10));

        System.out.println(number);

        System.out.println(r1);

        System.out.println("-------------------------------------------------------------------------");

        number.clear(); // size set to 0

        System.out.println(number);

        System.out.println("-------------------------------------------------------------------------");

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        System.out.println(names.indexOf("Vasyl")); //returns index number of FIRST MATCHING object.

        System.out.println(names.lastIndexOf("Sumeye"));// returns index number of LAST MATCHING object.

        System.out.println("-------------------------------------------------------------------------");

        boolean hasMuhtar = names.contains("Muhtar");
        boolean hasAli = names.contains("Ali");

        System.out.println("hasAli = " + hasAli);
        System.out.println("hasMuhtar = " + hasMuhtar);

    }

}
