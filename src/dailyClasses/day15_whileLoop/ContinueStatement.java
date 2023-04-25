package dailyClasses.day15_whileLoop;

public class ContinueStatement {

    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {

            if (i == 2) {
                continue;
            }

            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("-------------------------------------------------------------");

        for (int b = 10; b <= 20; b++) {

            if (b % 2 == 0) {// skips all iterations with even numbers
                continue;
            }
            System.out.print(b + " ");
        }

        System.out.println();
        System.out.println("-------------------------------------------------------------");

        for (char i = 'A'; i <= 'G'; i++) {

            if (i == 'B' || i == 'E') { // skips when char is 'B' and then skips when char is 'E'
                continue;
            }

            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("-------------------------------------------------------------");



    }
}
