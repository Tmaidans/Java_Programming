package dailyClasses.day22_arrayList;

public class WrapperClassesIntro {

    public static void main(String[] args) {

        String str = "Java";

        int a = 10;
        Integer a2 = 10;

        System.out.println("------------------------------------------------------------------");

        int b1 = 100;
        Integer b2 = b1; // auto boxing

        char ch = 'A';
        Character ch2 = ch; // auto boxing

        double d1 = 5.5;
        Double d2 = d1; // auto boxing

        System.out.println("------------------------------------------------------------------");

        Integer n1 = 20;
        int n2 = n1; //best practice for unboxing
        //long n3 = n1; //unboxing
        //double n4 = n1; //unboxing

        Character e1 = 'z';
        char e2 = e1; //unoxing


    }

}
