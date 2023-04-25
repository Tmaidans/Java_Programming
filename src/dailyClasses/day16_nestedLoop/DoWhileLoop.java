package dailyClasses.day16_nestedLoop;

public class DoWhileLoop {

    public static void main(String[] args) {

        boolean condition = false;

        for (; condition; ) {
            System.out.println("Hello Cydeo ----- for loop");

        }
        System.out.println("----------------------------------");

        while (condition){
            System.out.println("Hellow Cydeo ----- wile loop");
        }

        do{

            System.out.println("Hello Cydeo ------------- do while loop");

        }while (condition);

    }

}
