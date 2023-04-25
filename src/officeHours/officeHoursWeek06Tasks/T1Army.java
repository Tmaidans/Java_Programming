package officeHours.officeHoursWeek06Tasks;

public class T1Army {

    public static void main(String[] args) {

        army(21, true, true);

    }


    public static void army(int age, boolean hsDiploma, boolean citizen) {

        boolean ageRange = age >= 18 && age <= 35;

        if (ageRange && citizen && hsDiploma) {
            System.out.println("You are qualified to join the Army");
        }else{
            System.out.println("You are NOT qualified to join the Army:");
        }
        if (!citizen){
            System.out.println("You must be a citizen");

        }if (!hsDiploma){
            System.out.println("You must have a high school diploma");
        }
        if (age<18){
            System.out.println(age + " is lower than our maximum age");
        }
        if (age>35){
            System.out.println(age + " is higher than our maximum age");
        }
    }

}
