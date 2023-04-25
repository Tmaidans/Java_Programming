package officeHours.officeHoursWeek06Tasks;

public class T4CharacterSet {

    public static void main(String[] args) {

        System.out.println(characterSet("uppercase"));

        System.out.println("--------------------------------------------------");

        System.out.println(characterSet('7','P'));

    }

    public static String characterSet(String str) {

        String characterSet = "";

        char start = ' ';
        char end = ' ';

        switch (str.toLowerCase()) {

            case "uppercase":
                start = 'A';
                end = 'Z';
                break;

            case "lowercase":
                start = 'a';
                end = 'z';
                break;

            case "digit":
                start = '1';
                end = '9';
                break;

            case "special":
                start='!';
                end='.';
                break;

            default:
                return "Invalid Entry";

        }

        for (char i = start; i <= end; i++) {
            characterSet += " " + i;
        }

        return characterSet;

    }

    public static String characterSet(char start,char end) {

        String characterSet = "";

        for (char i = start; i <= end; i++) {
            characterSet += " " + i;
        }

        return characterSet;

    }
}
