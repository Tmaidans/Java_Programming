package officeHours.officeHoursWeek07Tasks;

/*

T2CountWords [String, loop]

    Create a method that accepts a String and returns an int
        find how many words are in the given String and return that count
        a word is separated by a space

    Ex:
        input: "today is monday"
        output: 3

 */

public class T2CountWords {

    public static void main(String[] args) {

        System.out.println(wordCount("today is a good day"));

    }

    public static int wordCount (String str){

        int counter=1;
            str=str.trim();
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i)==' '){
                counter++;
            }
        }

        return counter;
    }

}
