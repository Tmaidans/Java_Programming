package dailyClasses.day05_operators;

public class RelationalOperators2 {

    public static void main(String[] args) {

        // ==: equal operator

        System.out.println(1000 == 2000); // can apply two values with same dataType

        System.out.println("Java" == "Java"); //true

        System.out.println("Java" == "java"); //false - case sensitive language

        System.out.println("Muhtar" == "Good Guy"); //false - does not have same string of text

        System.out.println("Boolean - " + (10 < 9 == 11 < 4)); // true

        System.out.println("----------------------------------------------------------------");

        // !=: not equal operator


        System.out.println(1000 != 2000); // can apply two values with same dataType

        System.out.println("Java" != "Java"); //false

        System.out.println("Java" != "java"); //true - case sensitive language

        System.out.println("Muhtar" != "Good Guy"); //true - does not have same string of text

        System.out.println("Boolean - " + (10 < 9 != 11 < 4)); // false

    }


}
