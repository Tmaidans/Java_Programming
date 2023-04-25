package dailyClasses.day23_arrayList.Practice;

/*

2. Write a program that can remove all the names "Ahmed" from an arraylist of String
			ex:
                list = ["John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"];

            output:
            	["John", "Daniel", "James", "Muhammed"];

 */


import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAll {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"));

        System.out.println(names);

        names.removeAll(Arrays.asList("Ahmed"));

        System.out.println(names);


    }

}
