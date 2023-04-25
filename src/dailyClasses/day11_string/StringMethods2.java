package dailyClasses.day11_string;

public class StringMethods2 {

    public static void main(String[] args) {

        String sentence = "I love Python, Python is the biggest programming language, and Python is in high demand";

        sentence = sentence.replace("Python", "Java");

        System.out.println(sentence);

        //----------------------------------------

        String word = "java";

        // word = word.replace('a','e');

        word = word.replace("a", "e"); // replace all a characters to e character

        System.out.println(word);

        System.out.println("----------------------------------------------------------------------------------------");

        String sentence2 = "I love Java, Java is cool";

        // sentence2 = sentence2.replace("Java","Python");

        sentence2 = sentence2.replaceFirst("Java", "Python"); // replaces FIRST "Java" with "Python

        System.out.println(sentence2);

        //----------------------------------

        String sentence3 = "Java is fun, Java is cool, Java is amazing";

        sentence3 = sentence3.replaceFirst(", Java", ", Python");
        System.out.println(sentence3);

        System.out.println("----------------------------------------------------------------------------------------");

        String sentence4 = "I love Java Programming";
        //                  0123456789
        String languageName = sentence4.substring(7, 10 + 1); //Java - last digit is excluded, so we need to add +1 to include that.
        System.out.println("languageName = " + languageName);

        String sentence5 = "Today is Sunday, Tomorrow is Monday";
        String today = sentence5.substring(9, 14 + 1);

        System.out.println("today = " + today);

        //----------------------------------

        String email = "CydeoSchoolJavaProgramming@gmail.com";

        int beginning = email.indexOf('@') + 1;
        //int ending = email.indexOf(".com") ;
        int ending = email.lastIndexOf('.'); //'.' will be excluded from the substring, because last index is always excluded

        String domain = email.substring(beginning, ending);

        System.out.println("domain = " + domain);

        //----------------------------------

        String sentance6 = "I love Java programming";
        String r1 = sentance6.substring(7);
        System.out.println("r1 = " + r1);

        String sentence7 = "Today is Sunday, Tomorrow is Monday";
        String tomorrow = sentence7.substring(sentence7.lastIndexOf(' ') + 1);
        System.out.println("tomorrow = " + tomorrow);

        String sentence8 = "I study at Cydeo School";
        String school = sentence8.substring(sentence8.indexOf('C'));
        System.out.println("school = " + school);

        System.out.println("----------------------------------------------------------------------------------------");

        String str = "Python";

        String result = (str+"\n").repeat(10);
        System.out.println("result = " + result);
    }

}
