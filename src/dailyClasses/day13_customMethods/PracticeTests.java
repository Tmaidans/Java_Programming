package dailyClasses.day13_customMethods;


public class PracticeTests {

    public static void main(String[] args) {

    int answer = frequencyOfWord("computer", "computer");

        System.out.println(answer);



    }//---------------------------------------------------

    public static String wordsCombined(String word1, String word2) {

        String finalWord;

        if (word1.charAt(word1.length() - 1) == word2.charAt(0)) {

            finalWord = word1.substring(0, word1.length()) + word2.substring(1);
        } else {
            finalWord = word1.substring(0) + word2.substring(0);
        }

        return finalWord;

    }

    public static int frequencyOfWord (String sentence, String word){

        int frequencyOfWord=0;


        if (sentence.toLowerCase().contains(word)){
            sentence = sentence.substring(0).replaceFirst(word,"");
            frequencyOfWord+=1;
        }
        if (sentence.toLowerCase().contains(word)){
            sentence = sentence.substring(0).replaceFirst(word,"");
            frequencyOfWord+=1;
        }
        if (sentence.toLowerCase().contains(word)){
            sentence = sentence.substring(0).replaceFirst(word,"");
            frequencyOfWord+=1;
        }
        if (sentence.toLowerCase().contains(word)){
            sentence = sentence.substring(0).replaceFirst(word,"");
            frequencyOfWord+=1;
        }
        if (sentence.toLowerCase().contains(word)){
            sentence = sentence.substring(0).replaceFirst(word,"");
            frequencyOfWord+=1;
        }



        return frequencyOfWord;

    }

    public static String capitalize (String word){

        return word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();

    }
}

//--------------------------------------------------------
