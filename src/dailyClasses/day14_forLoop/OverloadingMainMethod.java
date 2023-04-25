package dailyClasses.day14_forLoop;

public class OverloadingMainMethod {

    public static void main(String[] args) {

        System.out.println("a");

    }


    public static void main (int[] args){

        System.out.println("b");
    }

    public static void main (double[] args){
        System.out.println("c");
    }
    public static void main (boolean[] args){
        System.out.println("d");
    }

}
