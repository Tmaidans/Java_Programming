package dailyClasses.day26_statics;

public class ConstructorCalls {

    public ConstructorCalls(){
        System.out.println("Default");
    }

    public ConstructorCalls(int a){
        this();
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls(double a){

        System.out.println("Constructor with double argument");
    }

    public ConstructorCalls(String a){
        this(2.5);
        System.out.println("Constructor with String argument");
    }


    public static void main(String[] args) {

        method1();

        System.out.println("--------------------------------------------------");

        method2();

    }















    public static void method1(){
        System.out.println("Method1");
    }

    public static void method2(){
        method1();
        System.out.println("Method2");
    }

}
