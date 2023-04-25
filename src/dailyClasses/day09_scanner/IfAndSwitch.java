package dailyClasses.day09_scanner;

public class IfAndSwitch {

    public static void main(String[] args) {

        int number = 50;

        if (number == 50 || number == 75 || number == 100) {

            switch (number) {

                case 50:
                    System.out.println("20 crew 30 pass");
                    break;

                case 75:
                    System.out.println("24 crew 50 pass");
                    break;

                default:
                    System.out.println("30 crew and 70 pass");
            }

        } else {

            System.out.println("Invalid Number");

        }

    }

}
