package Sunday_live_reviews.week6;



public class Palindrome {

    public static void main(String[] args) {

        String word = "Annba";
      boolean palindrome = word.equalsIgnoreCase(reverse(word));

        System.out.println(palindrome);

    }

public static String reverse (String word){

    String reverse = "";

    for (int i = word.length()-1; i >=0 ; i--) {
        reverse+=word.charAt(i);
    }

    return reverse;
}

}
