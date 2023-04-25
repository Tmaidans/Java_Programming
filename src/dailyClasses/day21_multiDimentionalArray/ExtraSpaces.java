package dailyClasses.day21_multiDimentionalArray;

public class ExtraSpaces {

    public static void main(String[] args) {

        String str = "  Hello world      I      love      Java    ";
            String[] strArray = str.split(" ");
            String newStr="";
            String eachWord;
        for (String each : strArray) {
            eachWord=each.trim();
            if (eachWord.isBlank()){
                continue;
            }
            newStr+=eachWord+" ";

        }

        System.out.println(newStr.substring(0,newStr.length()-1));



    }

}
