package dailyClasses.day13_customMethods;

public class ReturnMethodIntro {

    public static void main(String[] args) {

        System.out.println(sum(3, 4));

        System.out.println("cube(5) = " + cube(5));
        System.out.println("square(5) = " + square(5));

    }

    public static int sum(int n1, int n2) {
        return n1 + n2;
    }

    public static int square(int num) {
        return num * num;
    }

    public static int cube(int num) {
        return square(num) * num;    }

}
