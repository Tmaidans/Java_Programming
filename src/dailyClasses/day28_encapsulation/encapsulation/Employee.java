package dailyClasses.day28_encapsulation.encapsulation;

import java.rmi.ServerError;

public class Employee {

    private String name;
    private int age;
    private String jobTitle;
    private double salary;

    public Employee() {
   }
    public Employee(String name) {
        this();
        setName(name);
    }
    public Employee(String name, int age) {
        this(name);
        setAge(age);
    }
    public Employee(String name, int age, String jobTitle) {
        this(name, age);
        setJobTitle(jobTitle);
    }
    public Employee(String name, int age, String jobTitle, double salary) {
        this(name, age, jobTitle);
        setSalary(salary);
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public String getName() {

        if (name == null) {
            name = "Unknown"; //option 1 - netter to have any string other than null
            System.err.println("Name of the employee was not given");
            System.exit(1);

            return "Unknown"; //better to have a string rather tha null
        }

        return name;
    }
    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            System.err.println("Employee name cannot be empty or blank");
            System.exit(1);
        }
        this.name = name;
    }
    public double getSalary() {

        return salary;
    }
    public void setSalary(double salary) {
        if (salary < 0) {
            System.err.println("Wrong salary given: " + salary);
            System.exit(1);
        }
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }
}
