package officeHours.officeHoursWeek07Tasks;

/*

T3SortedOrder [loop, String]

    Create a method that accepts a String and returns a boolean.
        return true if the given String is sorted meaning the characters are in alphabetically order
        return false if the given String is not sorted

    Ex:
        input: "abcd"
        output: true

        input: "abzy"
        output: false

 */

public class T3SortedOrder {

    public static void main(String[] args) {

        String str = "eg";



        boolean sorted = true;


        for (int i = 0; i < str.length()-1; i++) {

            int firstChar = str.charAt(i);
            int nextChar = (str.charAt(i + 1)) - 1;
            if (firstChar != nextChar) {
                sorted = false;
            }


        }

        System.out.println(sorted);


    }

}


