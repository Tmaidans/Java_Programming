package dailyClasses.day21_multiDimentionalArray;

import java.util.Arrays;

public class SameLetters {

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";



        char[] str1Char = str1.toCharArray();
        char[] str2Char = str2.toCharArray();

        Arrays.sort(str1Char);
        Arrays.sort(str2Char);

        System.out.println(Arrays.toString(str1Char));
        System.out.println(Arrays.toString(str2Char));

        Boolean osAnagram = Arrays.equals(str1Char,str2Char);

        System.out.println("osAnagram = " + osAnagram);
    }

}
