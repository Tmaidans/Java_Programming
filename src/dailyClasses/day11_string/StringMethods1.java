package dailyClasses.day11_string;

public class StringMethods1 {

    public static void main(String[] args) {

        String str1 = "CYDEO SCHOOL";

        str1 = str1.toLowerCase(); //"cydeo School"

        System.out.println(str1);

        System.out.println("--------------------------------------------------------------------------------");

        String str2 = "java programming";

        String str3 = str2.toUpperCase(); //"JAVA PROGRAMMING"

        System.out.println(str2 + " " + str3);

        System.out.println("--------------------------------------------------------------------------------");

        String word = "Wooden Spoon";

        word = word.toUpperCase(); //"WOODEN SPOON" - new string created

        word = word.toLowerCase(); //wooden spoon - new string created

        System.out.println(word);

        System.out.println("--------------------------------------------------------------------------------");

        String str4 = "                Cydeo School";

        str4 = str4.trim(); //"Cydeo School" - excludes all the white spaces from previous string

        System.out.println("str4 = " + str4);

        System.out.println("--------------------------------------------------------------------------------");

        String sentence1 = "Today is Sunday, and we have Java class";
        //                   0123456789
        int index1 = sentence1.indexOf('w'); //look for first matching character from left to right.

        System.out.println("index1 = " + index1);


        String s1 = "i love Java programming";

        int firstA = s1.indexOf('a');

        System.out.println("firstA = " + firstA);

        int secondA = s1.indexOf("a "); //looking for the first a character

        System.out.println("secondA = " + secondA);


        String s2 = "Java Python JavaScript Cydeo Python";

        int a1 = s2.indexOf('a');
        System.out.println("a1 = " + a1);

        int a2 = s2.indexOf("a Python");
        System.out.println("a2 = " + a2);

        int a3 = s2.indexOf("avaS");
        System.out.println("a3 = " + a3);

        int a4=s2.indexOf("aS");
        System.out.println("a4 = " + a4);

        System.out.println("--------------------------------------------------------------------------------");

        String w = "Java";

        System.out.println(w.indexOf('a')); //1
        System.out.println(w.lastIndexOf('a'));//3

        String w2= "Java Python JavaScript Cydeo Python";
        System.out.println(w2.lastIndexOf('a')); //15

        System.out.println(w2.lastIndexOf('P')); //29 - last uppercase 'P'

        System.out.println(w2.lastIndexOf("Pyth"));













    }

}
