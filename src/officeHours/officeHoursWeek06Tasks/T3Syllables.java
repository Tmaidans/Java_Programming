package officeHours.officeHoursWeek06Tasks;

public class T3Syllables {

    public static void main(String[] args) {

        System.out.println(syllable("ap-ple"));

    }

    public static int syllable(String word) {

        int syllable = 1;

        for (int i = 0; i < word.length(); i++) {

            if (("" + word.charAt(i)).equals("-")) { //(str.charAt(i)=='-')

                syllable += 1;
            }

        }

        return syllable;

    }


}
