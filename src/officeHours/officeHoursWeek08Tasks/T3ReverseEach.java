package officeHours.officeHoursWeek08Tasks;

/*

T3ReverseEach [array, loop, String]

    Create a program that will define a String array with some words. Reverse each given element and assign them to a new array for all the reverse words

    Ex:
        {can, you, join, the, team} -> [nac, uoy, nioj, eht, meat]

    Note: We will use reverse logic in the next task too, so make a reusable method that can help with that part


 */

import java.util.Arrays;

public class T3ReverseEach {

    public static void main(String[] args) {

        String[] string = {"can","you","join","the","team"};

        String[] reversedString = new String[string.length];

        for (int i = 0; i < string.length; i++) {
            String each = string[i];
            reversedString[i] = utilities.StringUtility.reverse(each);

        }

        System.out.println(Arrays.toString(reversedString));

    }

}
