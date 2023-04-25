package dailyClasses.day05_operators;

public class UnaryOperators {

    public static void main(String[] args) {

        // pre increment/decrement

        int x = 10;

        System.out.println(++x); // x = 11
        System.out.println(--x); // x = 10 - because previous result was 11, so 11-1=10

        int y = 100;

        System.out.println(--y); // y = 99

        System.out.println("--------------------------------------------------------------");

        // post increment/decrement

        int a = 50;

        System.out.println("a = " + a++); // a = 50
        System.out.println("a = " + a); // a = 51

        int b = 10;

        System.out.println("b = " + b--); // b = 10
        System.out.println("b = " + b); // b = 9

        System.out.println("-----------------------------------------------------------------");

        int n =30;

        int m = n++; // m = 30, n = 31

        System.out.println(n);

        int z = 20;


        System.out.println("z = " + z);

        int t = ++z; //t =21, z = 20
    }


}
