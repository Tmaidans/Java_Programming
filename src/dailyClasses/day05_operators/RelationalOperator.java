package dailyClasses.day05_operators;

public class RelationalOperator {

    public static void main(String[] args) {

        int a = 1000,
                b = 100;

       // System.out.println(a > b); // true

        boolean aIsGreater = a > b;

        System.out.println(aIsGreater);

        System.out.println("----------------------------------------------------------");

        int score = 59;

        boolean result = score >=60;

        System.out.println("result = " + result);

        int age = 20;

        boolean canBuyAlcohol = age >=21;

        System.out.println("canBuyAlcohol = " + canBuyAlcohol);

        boolean eligibleToVote = age >=18;

        System.out.println("eligibleToVote = " + eligibleToVote);

        System.out.println("------------------------------------------------------------");

        //System.out.println("Java" <= "C#"); // <, >, <=, >= can only be applicable for numbers


    }

}
