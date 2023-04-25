package Sunday_live_reviews.week9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class HolidaysMethod {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M/d/y");

        System.out.println(holidays());

        LocalDate today = LocalDate.now();
        LocalDate date2 = LocalDate.of(2022,2,1);

        ArrayList<String> editedDates = new ArrayList<>(Arrays.asList(today.format(dtf),date2.format(dtf)));
        String todayStr = today.format(dtf);

        System.out.println(todayStr);
        System.out.println(editedDates);
    }




    public static ArrayList<LocalDate> holidays() {

        ArrayList<LocalDate> holidays = new ArrayList<>();

        LocalDate today = LocalDate.now();
        holidays.add(LocalDate.now());

        holidays.addAll(Arrays.asList(LocalDate.of(2023, 1, 1), LocalDate.of(2023, 1, 16),
                LocalDate.of(2023, 2, 20), LocalDate.of(2023, 4, 9)));

        return holidays;
    }


}
