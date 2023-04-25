package dailyClasses.day14_forLoop;

public class StringReverse {

    public static void main(String[] args) {

       // String str = "Tim";
        System.out.println(revers("Timurs Maidans Vjaceslavovich"));

    }

    public static String revers(String str){

        String reverse = "";

        for (int i = str.length()-1; i>=0 ; i--) {
            char letter =str.charAt(i);
            reverse+=letter;

        }


        return reverse;

    }
}
