package dailyClasses.day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class Person {

    private String name;
    private int age;
    private char gender;
    private LocalDate dob;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age<=0){
            System.err.println("Age cannot be negative or zero");
            return;
        }
        this.age = age;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Person(String name, char gender, LocalDate dob) {
        setName(name);
        setAge(LocalDate.now().getYear() - dob.getYear());
        setGender(gender);
        setDob(dob);
    }

    public void eat(){
        System.out.println(name +" is eating");
    }
    public void drink (){
        System.out.println(name + " is drinking");
    }

    public String toString() {
        return getClass().getSimpleName() +"|" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dob=" + dob +
                '|';
    }
}
