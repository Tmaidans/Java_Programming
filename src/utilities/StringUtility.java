package utilities;

public class StringUtility {

    public static String reverse(String str) {

        String reverse = ""; //so that we can later concatenate characters one by one when we get them

        for (int i = str.length() - 1; i >= 0; i--) { //start from last index moving to first which is index 0. (Last index is length -1)
            char letter = str.charAt(i); // get characters starting from last index moving to index 0
            reverse += letter; // adds char one by one to the empty string at the beginning

        }


        return reverse;

    } //reverses the string. Can assign result to a variable.

    public static String capitalize(String str) {

        String[] eachWord = str.toLowerCase().trim().split(" ");
        String result = "";

        for (String each : eachWord) {
            result += each.substring(0, 1).toUpperCase() + each.substring(1) + " ";


        }

        return result.trim();
    } //capitalizes all words in the string


}





