package dailyClasses.day11_string;

public class StringMethods3_boolean {

    public static void main(String[] args) {

        String word = "";

        boolean r1 = word.isEmpty();

        System.out.println("r1 = " + r1);

        //---------------------------------------------------------------------------

        String str = "             ";

        boolean r2 = str.isEmpty();
        boolean r3 = str.isBlank();

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("-----------------------------------------------------------------------------");

        String s1 = "JAVA";
        String s2 = "java";

        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true

        System.out.println("-----------------------------------------------------------------------------");

        String students = "Hasan Naran Sumeve Nataliia";
        boolean hasAhmed = students.contains("Ahmed");
        System.out.println("hasAhmed = " + hasAhmed);

        String sentence = "My favorite programming language is JAVA";
        boolean hasJava = sentence.toLowerCase().contains("java"); //way to ignore case sensitivity
        System.out.println("hasJava = " + hasJava);

        System.out.println("-----------------------------------------------------------------------------");

        String name = "Michael";
        boolean l = name.startsWith("Da");//false
        System.out.println("l = " + l);

        String url = "www.cydeo.com";
        boolean isValid = url.startsWith("www."); //true
        System.out.println("isValid = " + isValid);
        boolean t = url.endsWith(".com"); //true
        System.out.println("t = " + t);

        boolean isUrlValid = (isValid && t);
        System.out.println("isUrlValid = " + isUrlValid);

        //--------------------------------------------------

        String email = "CydeoSchool@outlook.com";
        boolean isGmail = email.endsWith("gmail.com");
        boolean isYahoo = email.endsWith("yahoo.com");
        boolean isHotmail = email.endsWith("hotmail.com");

        System.out.println("isYahoo = " + isYahoo);
        System.out.println("isGmail = " + isGmail);
        System.out.println("isHotmail = " + isHotmail);

        System.out.println("-----------------------------------------------------------------------------");

    }

}
