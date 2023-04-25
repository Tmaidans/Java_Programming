package dailyClasses.day24_dateAndTime.Practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDates {

    public static void main(String[] args) {

        ArrayList<LocalDate> list = new ArrayList<>();

        list.addAll(Arrays.asList(LocalDate.now(),LocalDate.of(2020,2,3),LocalDate.of(1954,3,5)));

        System.out.println(list);

        list.removeIf(p-> p.isBefore(LocalDate.of(2016,8,15)));

        System.out.println(list);

    }

}
