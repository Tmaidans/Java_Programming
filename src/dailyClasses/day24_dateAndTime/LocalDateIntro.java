package dailyClasses.day24_dateAndTime;


import java.time.LocalDate;


public class LocalDateIntro {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println(today);

        LocalDate birthDay = LocalDate.of(86, 12, 7);
        System.out.println("birthDay = " + birthDay);


        System.out.println("----------------------------------------------------");

        //                                 METHODS

        System.out.println(today.getYear()); // gets a year from created object

        System.out.println(today.getMonth()); // returns month from specified object

        System.out.println(today.getDayOfWeek()); // returns name of the day of the week

        System.out.println(birthDay.getDayOfWeek()); // I WAS BORN SAT

        System.out.println(today.getDayOfYear());

        System.out.println("----------------------------------------------------");

        System.out.println("today = " + today);

        today = today.plusYears(1); // adds one yer to specified object

        System.out.println("today = " + today);

        System.out.println("----------------------------------------------------");

        LocalDate graduationDate = LocalDate.of(2025, 6, 4);

        LocalDate updatedGraduationDate = graduationDate.plusYears(2);

        System.out.println("graduationDate = " + graduationDate);
        System.out.println("updatedGraduationDate = " + updatedGraduationDate);

        updatedGraduationDate = updatedGraduationDate.plusMonths(7);

        System.out.println("updatedGraduationDate = " + updatedGraduationDate);

        updatedGraduationDate = updatedGraduationDate.plusWeeks(7);

        System.out.println("updatedGraduationDate = " + updatedGraduationDate);

        updatedGraduationDate = updatedGraduationDate.plusDays(100);

        System.out.println("updatedGraduationDate = " + updatedGraduationDate);

        System.out.println("----------------------------------------------------");

        LocalDate yourBirthday = LocalDate.of(1986, 6, 7);
        LocalDate brothersBirthday = yourBirthday.minusYears(2).minusMonths(3);

        System.out.println("yourBirthday = " + yourBirthday);
        System.out.println("brothersBirthday = " + brothersBirthday);

        System.out.println("----------------------------------------------------");

        LocalDate birthDay1 = LocalDate.of(1994, 6, 7);
        LocalDate birthDay2 = LocalDate.of(1994, 6, 7);

        boolean r1 = birthDay1.isEqual(birthDay2);

        System.out.println(r1);

        System.out.println("----------------------------------------------------");

        LocalDate grad_date = LocalDate.of(2023, 1, 1);

        System.out.println(grad_date.isBefore(LocalDate.of(2022, 12, 31)));
        System.out.println(grad_date.isAfter(LocalDate.of(2022, 12, 31)));

        System.out.println("----------------------------------------------------");

        System.out.println(LocalDate.of(2022,16,6).isLeapYear());
    }
}
