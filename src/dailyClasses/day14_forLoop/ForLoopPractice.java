package dailyClasses.day14_forLoop;

public class ForLoopPractice {

    public static void main(String[] args) {

        for (int i = 10; i <= 10; i++) {
            System.out.println("Hello Cydeo");
        }

        System.out.println("Hello World");

        System.out.println("------------------------------------------------------");


        int sum = 0;

        for (int num = 1; num <= 100; num++) {

            sum += num;

        }

        System.out.println(sum);

        System.out.println("------------------------------------------------------");


        for (char l = 'A'; l <= 'Z'; l++) {

            System.out.print(l + " ");
        }

        System.out.println();
        System.out.println("------------------------------------------------------");


        for (char l2 = 90; l2 >= 65; l2--) {


            System.out.print(l2 + " ");
        }
    }
}
