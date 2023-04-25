package dailyClasses.day03_variables;

/*
1. Create a class named StudentInfo.java
2. Declare the following variables with appropriate data types:
1. students_name
2. age
3. gender
4. school_name
5. student_id
6. grade_level
7. gpa
 */
public class StudentInfo {

    public static void main(String[] args) {

        String student_name = "Tim Maidans";
        int age = 35,
                grade_level = 3;
        char gender = 'M';
        String school_name = "Cydeo",
                student_id = "3311AB";
        double gpa = 4.0;

        System.out.println(student_name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(school_name);
        System.out.println(student_id);
        System.out.println(grade_level);
        System.out.println(gpa);

        System.out.println("--------------------------------------------");

        System.out.println("student_name = " + student_name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("school_name = " + school_name);
        System.out.println("student_id = " + student_id);
        System.out.println("grade_level = " + grade_level);
        System.out.println("gpa = " + gpa);

        System.out.println("----------------------------------------------");


    }
}
