package officeHours.officeHoursWeek03Tasks;

public class T3AnalyzeCode {
    public static void main(String[] args) {
        int a = 8;
        int b = a--;
        /*
         int b = a;
         a--;
         */

        System.out.println(a);
        System.out.println(b);
        //what is a?
        //what is b?

        int c = 10;
        int d = c-- + 3; // 10 + 3 = 13 | next 13 is assigned to d | c to subtract 1 -> 9

        /*
        int d = c-- + 3;
        can be written as
        int d = c + 3
        c--
         */

        System.out.println("c = " + c);
        System.out.println("d = " + d);

        int z = 9; // z = 8
        int y = --z * 2; // 8 * 2 = 16
        System.out.println("z = " + z);
        System.out.println("y = " + y);


        // --------------------------------------------
        float speed = 20.5f;

        byte num1 = (byte)speed;
        short num2 = (short)speed;
        int num3 = (int)speed; // (short)speed -> works because short is smaller than int, so it will automatically match the type
        long num4 = (long)speed;
        float num5 = speed;
        double num6 = speed;

    }
}