package dailyClasses.day25_constructor;

import com.sun.jdi.LongValue;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("y/MMMM/d/EEEE");

        LocalDate today = LocalDate.now();

        System.out.println(today.format(dtf));

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a");

        LocalTime tim1 = LocalTime.of(17,5);

        System.out.println(tim1.format(tf));

        System.out.println("---------------------------------------------------------------");

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE MM/dd/y  hh:mm a"); // a is responsible for AM or PM.

        LocalDateTime starts = LocalDateTime.now();

        System.out.println(starts.format(dtf2));



    }

}
