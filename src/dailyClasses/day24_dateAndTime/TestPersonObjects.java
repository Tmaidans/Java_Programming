package dailyClasses.day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person[] students = {new Person(), new Person(), new Person(), new Person(), new Person()};

        students[0].setInfo("Daniel",'M', LocalDate.of(1989,2,25));
        students[1].setInfo("Tim",'M', LocalDate.of(1983,1,21));
        students[2].setInfo("Amanda",'F', LocalDate.of(2021,4,24));
        students[3].setInfo("Timmy",'M', LocalDate.of(1988 ,3,15));
        students[4].setInfo("Jessica",'F', LocalDate.of(1963,7,2));

        ArrayList<Person> studentsList = new ArrayList<>();
        studentsList.addAll(Arrays.asList(students));

        //Print name and date of birth

        for (Person each : studentsList) {

            System.out.println(each.name + " : " + each.dateOfBirth);


        }

        //remove all the person object that has age over 55

        studentsList.removeIf(person -> person.age>55);

        System.out.println(studentsList);








    }

}
