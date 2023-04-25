package dailyClasses.day14_forLoop;

public class Warmup {

    public static void main(String[] args) {

        String result = combine2 ("theeno", "one");

        System.out.println("result = " + result);
    }

    public static String combine(String word1, String word2) {

        char char1 = word1.charAt(word1.length() - 1);
        char char2 = word2.charAt(0);
        String combine;

        if (char1 == char2) {
            combine = word1 + word2.substring(1);
        } else {
            combine = word1 + word2;
        }

        return combine;
    }

    public static String combine2(String word1, String word2) {

        String combine2;
        String word2Char = "" + word2.charAt(0);

        if (word1.endsWith(word2Char)) {
            combine2 = word1 + word2.substring(1);
        } else {
            combine2 = word1 + word2;
        }

        return combine2;
    }

    public static int sumOf2Numbers(int num1, int num2) {

        return num1 + num2;

    }

    public static int sumOf3Numbers(int num1, int num2, int num3) {

        return sumOf2Numbers(num1, num2) + num3;

    }

    public static int sumOf4Numbers(int num1, int num2, int num3, int num4) {

        return sumOf3Numbers(num1, num2, num3) + num4;

    }
}

