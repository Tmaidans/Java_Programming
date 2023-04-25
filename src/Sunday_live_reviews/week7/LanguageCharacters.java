package Sunday_live_reviews.week7;

import java.util.Arrays;

public class LanguageCharacters {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(characters("braille")));

    }

    public static char[] characters(String language) {

        language.toLowerCase();
        char[] characters = new char[0];

        switch (language) {

            case "english":
                characters = new char[94];
                for (int i = 33, j = 0; i <= 126; i++, j++) {
                    characters[j] = (char) i;
                }
                break;

            case "greek":
                characters = new char[128];
                for (int i = 884, j = 0; i <= 1011; i++, j++) {
                    characters[j] = (char) i;
                }
            break;

            case "arabic":
                characters = new char[243];
                for (int i = 1548, j = 0; i <= 1790; i++, j++) {
                    characters[j] = (char) i;
                }
            break;

            case "braille":
                characters = new char[256];
                for (int i = 10240, j = 0; i <= 10495; i++, j++) {
                    characters[j] = (char) i;
                }
            break;
        }

        return characters;

    }
}







