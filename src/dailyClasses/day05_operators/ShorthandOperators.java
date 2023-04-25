package dailyClasses.day05_operators;

public class ShorthandOperators {

    public static void main(String[] args) {

        int a = 20;

        System.out.println(a); // 20

        System.out.println(a); // 20

        a = 40;

        System.out.println(a); // 40

        a = 90;

        System.out.println(a); // 90

        System.out.println("-------------------------------------------------------------------");

        double balance = 100;

        balance += 1000; // balance = 100 + 1000 = 1100

        System.out.println("balance = " + balance);

        balance += 500; // balance = 500 + 1100

        System.out.println("balance = $" + (int) balance);

    }


}
