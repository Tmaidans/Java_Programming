package dailyClasses.day27_accessModifiers;

public class TestCydeoStudentObj {

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Tim",23,'F');
        CydeoStudent student2 = new CydeoStudent("Anna",25,'F');

        System.out.println(student1);
        System.out.println(student2);

        System.out.println( CydeoStudent.schoolName);
        System.out.println(CydeoStudent.secretCode);

    }

}
