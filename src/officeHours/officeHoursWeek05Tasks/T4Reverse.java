package officeHours.officeHoursWeek05Tasks;

public class T4Reverse {

    public static void main(String[] args) {


        String word = "javac";

        String result = ""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0);

        int index = word.length()-1; // index = 4

        String reverse2 = ""+word.charAt(index--)+word.charAt(index--)+word.charAt(index--)+word.charAt(index--)+word.charAt(index--);

        System.out.println("word = " + word);
        System.out.println("result = " + result);

        System.out.println("reverse2 = " + reverse2);



    }



}
