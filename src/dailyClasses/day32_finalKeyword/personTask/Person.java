package dailyClasses.day32_finalKeyword.personTask;

import java.time.LocalDate;

public class Person {

    private String name;
    private final char gender;
    private final int age;
    private final LocalDate DOB;


    public static final int numberOfHeads;

    static {
        numberOfHeads = 1;
    }

    public Person(String name, char gender, LocalDate DOB) {
        setName(name);
        if (!(gender=='M'|| gender=='F')){
            System.err.println("Invalid gender " + gender);
            System.exit(1);
        }
        this.gender = gender;
        this.age = LocalDate.now().getYear() - DOB.getYear();
        this.DOB = DOB;
    }

    public String getName() {
        return name;
    }
    public char getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
    public LocalDate getDOB() {
        return DOB;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat (){
        System.out.println(name + " is eating");
    }
    public void drink (){
        System.out.println(name + " is drinking");
    }
    public void sleep (){
        System.out.println(name + " is sleeping");
    }

    public final void breath (){
        System.out.println(name + " is breathing");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", DOB=" + DOB +
                '}';
    }
}
