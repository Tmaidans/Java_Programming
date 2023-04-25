package dailyClasses.day04_concatenation;

public class PrimitiveTypeCastings {

    public static void main (String[] args){

        //----------Implicit Casting-----------

        byte a = 15;

        short b = (short)a;

        //    short b = (short)a; - No need for cast operator when done implicitly

        System.out.println(b);

        int c = a; // implicit casting

        long d = 3000l;

        float f = d;

        System.out.println(f);

        short sh = 1128;
        byte bt = (byte) sh;

        System.out.println(bt);

        float z = 34.5f;

        short q = (short) z; // z = 34.5

        System.out.println(q);

        double n1 = 2.5;

        byte n2 = (byte) n1; // n1 = 2.5

        System.out.println(n2);

        System.out.println("------------------------------------------------------------");

        int num = 500;

        byte result = (byte) num; // explicit casting

        System.out.println(result);

        int r = 50000;

        short t = (short) r;

        System.out.println(t);

        System.out.println("------------------------------------------------------------");

        double u = 3000.5;

        int p = (int) u;

        System.out.println(p);

        int o = 100;

        double d1 = o;

        System.out.println(d1);







    }


}
