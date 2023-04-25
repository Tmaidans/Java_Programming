package dailyClasses.day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class Employee extends Person {

    private double salary;
    private String employeeId;
    private String jobTitle;

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Employee(String name, char gender, LocalDate dob, double salary, String employeeId, String jobTitle) {
        super(name, gender, dob);
        setSalary(salary);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
    }

    public void work (){
        System.out.println(getName() + " is working");
    }



}
