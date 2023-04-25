package Sunday_live_reviews.week5;

public class CountHi {

    public static void main(String[] args) {


        System.out.println(frequencyOfWord("hello world", "hi"));

    }

    public static int frequencyOfWord(String sentence, String word) {

        int frequencyOfWord = 0;

        //check for the first matching word and update the counter by1
        if (sentence.toLowerCase().contains(word)) {
            sentence = sentence.substring(0).replaceFirst(word, "");
            frequencyOfWord += 1;

        }

        for (int number = 0; number != frequencyOfWord; number++) {

            if (sentence.toLowerCase().contains(word)) {
                sentence = sentence.substring(0).replaceFirst(word, "");
                frequencyOfWord += 1;

            }
        }

       // System.out.println("\"" + word + "\" was found " + frequencyOfWord + " times");
        return frequencyOfWord;
    }

}
