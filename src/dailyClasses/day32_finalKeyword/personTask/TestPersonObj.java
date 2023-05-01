package dailyClasses.day32_finalKeyword.personTask;

import java.time.LocalDate;

public class TestPersonObj {

    public static void main(String[] args) {

        Person person = new Person("Tim", 'M', LocalDate.of(1991, 1, 25));



        System.out.println(person);
        System.out.println();

        System.out.println("------------------------------------------------------------");

        Employee employee = new Employee("Timmy the Tit", 'M', LocalDate.of(1989, 2, 5), "Developer", 40000);
        System.out.println(employee);


    }
}
