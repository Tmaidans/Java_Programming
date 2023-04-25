package dailyClasses.day27_accessModifiers;

public class StaticBlock_vs_InstanceBlock_vs_Constructor {

    public StaticBlock_vs_InstanceBlock_vs_Constructor(){
        System.out.println("Constructor");
    }

    {
        System.out.println("Instance Block"); //gets executed when an object is created by constructor. Runs before the constructor.
    }

    static{
        System.out.println("Static Block"); //gets executed once, does not depend on object. Excuted first
    }

    public static void main(String[] args) {

        System.out.println("Main method");

        new StaticBlock_vs_InstanceBlock_vs_Constructor();


    }

}
