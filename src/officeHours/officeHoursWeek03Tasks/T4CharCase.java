package officeHours.officeHoursWeek03Tasks;

/*

T4CharCase [variables, if statement, relational operator]

    Create a program that will define a char variable, which will only be defined as a letter (a-z). The character can be defined in uppercase or lowercase and we want to determine which one it is

    Output in this format:
        $character is $uppercase_or_lowercase

 */

public class T4CharCase {

    public static void main(String[] args) {

        char givenCharacter = 'z';

           /* String upper = " is uppercase",
                    lower = " is lowercase";

            if (givenCharacter >= 65 && givenCharacter <= 90){
                System.out.println(givenCharacter + upper);
            }

            if (givenCharacter >= 97 && givenCharacter <=172){
                System.out.println(givenCharacter + lower);
            }


            */

        boolean upper = givenCharacter >= 65 && givenCharacter <= 90,
                lower = givenCharacter >= 97 && givenCharacter <= 172;

        String answer = "";

        if (upper){
            answer = givenCharacter + " is uppercase";
        }
        if (lower){
            answer = givenCharacter + " is lowercase";
        }
        System.out.println(answer);

    }


}
