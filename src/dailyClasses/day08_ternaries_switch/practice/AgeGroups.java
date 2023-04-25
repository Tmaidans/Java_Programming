package dailyClasses.day08_ternaries_switch.practice;


/*

3. Create a class called AgeGroups
		write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)

        Note: MUST use ternary

 */

public class AgeGroups {

    public static void main(String[] args) {

        int age = 18;

        String result;

        result = (age >= 1 && age < 3) ? "infant" : (age < 6) ? "Toddler" : (age < 10) ? "Kid" : (age < 13) ? "Pre-Teen" : (age < 18) ? "Teenager"
                : (age < 21) ? "Young Adult" : "adult";

        System.out.println(result);
    }

}
