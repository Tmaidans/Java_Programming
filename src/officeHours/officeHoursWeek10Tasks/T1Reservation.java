package officeHours.officeHoursWeek10Tasks;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class T1Reservation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int year = 2022;
        int month = 1;
        int day = 1;
        int hour = 1;

        System.out.println(LocalDateTime.now());

        System.out.println("Please enter year of your reservation: ");
        year = input.nextInt();

        LocalDate resDate = LocalDate.of(year,month,day);
        LocalTime resTime = LocalTime.of(hour,00);

        LocalDateTime reservation = LocalDateTime.of(year, month, day, hour, 0);

        if (resDate.getYear() != LocalDate.now().getYear()) {

            System.out.println("We are accepting reservations for only 2023");
            return;
        }

        System.out.println("Please enter month of the reservation");
        month = input.nextInt();

        System.out.println("Please enter day of the reservation");
        day = input.nextInt();
        resDate = LocalDate.of(year,month,day);

        if (resDate.isBefore(LocalDate.now())) {

            System.out.println("Sorry this date has already passed");
            return;
        } else if ((resDate.getMonthValue() == 11 && resDate.getDayOfMonth() == 23) || (resDate.getMonthValue() == 12 && resDate.getDayOfMonth() == 24)) {

            System.out.println("Sorry this date is all booked");
            return;

        }

        System.out.println(resDate.getDayOfWeek());

        System.out.println("Please enter the hour of reservation");
        hour = input.nextInt();
        resTime = LocalTime.of(hour,00);

        String dayOfWeek = ""+resDate.getDayOfWeek();
        dayOfWeek = dayOfWeek.substring(0);

        //boolean dayInWeek = resDate.getDayOfWeek().getValue() = returns an int number for the day of the week 1~7


        if (dayOfWeek.equals("FRIDAY")||dayOfWeek.equals("SATURDAY")||dayOfWeek.equals("SUNDAY")){
            System.out.println("Sorry we only have availability on weekends");
            return;
        }

        System.out.println("Your reservation is set for: " + reservation);

    }

}
