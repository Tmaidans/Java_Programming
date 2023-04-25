package dailyClasses.day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class Student extends Person {


    public Student(String name, char gender, LocalDate dob, char grade, String studentId) {
        super(name, gender, dob);
        setGrade(grade);
        setStudentId(studentId);
    }

    private char grade;
    private String studentId;

    public void study(){
        System.out.println(getName()+ " is studying");
    }

    public char getGrade() {
        return grade;
    }
    public void setGrade(char grade) {
        this.grade = grade;
    }
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
