package dailyClasses.day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class Teacher extends Employee {


    public Teacher(String name, char gender, LocalDate dob, double salary, String employeeId, String jobTitle) {
        super(name, gender, dob, salary, employeeId, jobTitle);
    }

    public void teach (){
        System.out.println(getName() + " is teaching");
    }

}
