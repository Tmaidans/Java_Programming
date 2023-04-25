package dailyClasses.day15_whileLoop;

public class BreakStatement {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            System.out.print(i + " ");

            if (i == 6) { //if i's reaches 6, "break" statement terminates the loop
                break;
            }

        }
        System.out.println();
        System.out.println("-----------------------------------------------------------------");

        for (char i = 'A'; i <= 'Z'; i++) {

            System.out.print(i + " ");

            if (i == 'J') { //loops gets terminated after char 'J'.
                break;
            }

        }

        System.out.println();
        System.out.println("-----------------------------------------------------------------");

        for (; ; ) {
            System.out.println("Hello");
            break;
        }

    }


}
