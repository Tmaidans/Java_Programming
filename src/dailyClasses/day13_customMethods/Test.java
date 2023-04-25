package dailyClasses.day13_customMethods;

public class Test {
    public static void main(String[] args) {

        int answer = frequencyOfWord("javaaa javaaaaa jajajajajava", "java");

        System.out.println("answer = " + answer);

    }

    public static int frequencyOfWord(String sentence, String word) {

        int frequencyOfWord=0;

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
        return frequencyOfWord;
    }

}