package officeHours.officeHoursWeek06Tasks;

public class T5CharacterOverloaded {

    public static void main(String[] args) {


        System.out.println(characterSet('X','}'));


    }


    public static String characterSet(char first, char second) {

        String characterSet = "";

        for (char i = first; i <=second ; i++) {
            characterSet+=i+" ";
        }

        return characterSet;

    }

}


