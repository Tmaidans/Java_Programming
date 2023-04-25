package dailyClasses.day24_dateAndTime.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIsFirstAndLast {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));

        list.removeIf(p-> p.toLowerCase().startsWith(""+p.charAt(p.length()-1)));

        System.out.println(list);



    }

}
