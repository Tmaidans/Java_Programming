package dailyClasses.day16_nestedLoop;

public class FrequencyOfWord {


    public static void main(String[] args) {

        String str = "mama papa sasha majava";
        String word = "java";
        int number =0;


        str=str.toLowerCase();


            while (str.contains(word)){
               str =  str.replaceFirst(word,"");
                number++;
            }

        System.out.println("number = " + number);


    }
}
