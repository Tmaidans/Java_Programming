package officeHours.officeHoursWeek05Tasks;

/*

2BeginningAtEnd [String, indexes]

	Create a program that will check if the first two characters of a given String are also the last two characters of the String. Print true if they are the same and false if they are not the same

	ex:
		educated -> true
		java -> false
		eraser for the computer -> true
		panda giftwrap -> false


 */

public class T2BeginningAtEnd {

    public static void main(String[] args) {

        String given = "paparoapa";

        String beginning = given.substring(0, 2);
        String ending = given.substring(given.length() - 2);

       // boolean isEven = beginning.equalsIgnoreCase(ending);
        boolean isTrue = given.endsWith(beginning);

        System.out.println(isTrue);
    }

}
