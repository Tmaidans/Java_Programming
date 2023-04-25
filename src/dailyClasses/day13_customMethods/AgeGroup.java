package dailyClasses.day13_customMethods;

        /*

        2. Create a method named ageGroup that can print the age group of the person

	        age groups are:
	                Teenager (< 21)
	                Adult   (>=21 && <55 )
	                Senior  ( > 55 )

         */

public class AgeGroup {

    public static void main(String[] args) {

        ageGroup(20);

        sum(10,2);










    }







    public static void ageGroup(int age) {

        if (age < 21) {

            System.out.println("Teenager");
        } else if (age >= 21 && age < 55) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }

    }

    public static void sum(int num1, int num2){

        int result = num1+num2;
        System.out.println(result);

    }

}
