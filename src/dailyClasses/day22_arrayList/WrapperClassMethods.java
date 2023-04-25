package dailyClasses.day22_arrayList;

import java.sql.SQLOutput;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "20";

        Integer.parseInt(str);

        int num = Integer.parseInt(str);

        System.out.println(num);

        Integer.valueOf(str);
        Integer num2 = Integer.valueOf(str);

        System.out.println("----------------------------------------------------------");

        String s = "20.5";
        double num3 = Double.parseDouble(s);

        Double num4 = Double.valueOf(s);

        System.out.println("----------------------------------------------------------");

        String x = "true";

        boolean r1 = Boolean.parseBoolean(x);//is case-sensitive
        Boolean r2 = Boolean.valueOf(x); //is not case-sensitive

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("----------------------------------------------------------");

        char ch = '@';
        boolean isDigit = Character.isDigit(ch);

        boolean isLetter =  Character.isLetter(ch);

        boolean isLowerCaseLetter = Character.isLowerCase(ch);

        boolean isUpperCaseLetter = Character.isUpperCase(ch);

        boolean isSpecialChar = !Character.isLetterOrDigit(ch); //opposite of letter or number

        System.out.println("isDigit = " + isDigit);
        System.out.println("isLetter = " + isLetter);
        System.out.println("isLowerCaseLetter = " + isLowerCaseLetter);
        System.out.println("isUpperCaseLetter = " + isUpperCaseLetter);
        System.out.println("isSpecialChar = " + isSpecialChar);

        System.out.println("----------------------------------------------------------");

        String string = "a1b2c3d4e5";

        int sum = 0;

        for (char each : string.toCharArray()) {

            if(Character.isDigit(each)){
                sum+= Integer.parseInt(""+each);
            }

        }

        System.out.println("sum = " + sum);

    }

}
