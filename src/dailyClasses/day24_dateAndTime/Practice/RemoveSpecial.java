package dailyClasses.day24_dateAndTime.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveSpecial {

    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));

        list.removeIf(p -> !Character.isDigit(p) && !Character.isLetter(p));

        System.out.println(list);

    }

}
