package dailyClasses.day35_polymorphism.transportation;

import dailyClasses.day33_abstraction.employeeTask.Developer;
import dailyClasses.day33_abstraction.employeeTask.Employee;
import dailyClasses.day33_abstraction.employeeTask.Teacher;

import java.sql.Driver;
import java.util.ArrayList;

public class PolymorphismPractice3 {

    public static void main(String[] args) {

        Employee[] employees = {
                new Developer("Lucy", 27, 'F', "A02", "Java Developer", 128000, "Java"),
                new Developer("Yulia", 23, 'F',"A04", "Software Developer", 135000, "Python"),
                new Developer("Gulistan",  26, 'F', "A06", "Web Developer", 130000, "Python"),
                new Developer("Diana",  29, 'F', "A08", "Front-end Developer", 140000, "C#"),
                new Developer("Alena",  26, 'F',"A10", "Back-end Developer", 150000, "Java"),
                new Teacher("James", 45,  'M', "B1", "Math Teacher", 75000)
        };

        for (Employee each:employees) {
            System.out.println(each.getName() + " : " + each.getJobTitle());
        }

        int countDeveloper = 0,
                countTester= 0,
                countTeacher = 0;

        for (Employee each:employees) {

            if (each instanceof Developer){
                countDeveloper++;
            } else if (each instanceof Teacher) {
                countTeacher++;

            }

        }

        System.out.println("countDeveloper = " + countDeveloper);
        System.out.println("countTeacher = " + countTeacher);

        for (Employee each:employees) {

            if (!(each instanceof Developer)){
                System.out.println("Not a developer: " + each.getName());
            }

        }





    }

}
