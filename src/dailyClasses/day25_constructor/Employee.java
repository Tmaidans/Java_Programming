package dailyClasses.day25_constructor;

import java.time.LocalDate;

public class Employee {

    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;
    public LocalDate hiredDate;

    public Employee(String name, int age, char gender, String jobTitle, double salary, LocalDate hiredDate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hiredDate = hiredDate;
    } // allows us to set all the instances variables of each object as soon as object is created.

    
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hiredDate=" + hiredDate +
                '}';
    }
}
