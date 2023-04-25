package dailyClasses.day18_garbageCollection;

public class GarbageCollection {

    public static void main(String[] args) {

        String s1 = "JAva";
        s1=null; //"java" will be eligible for the garbage collection
        System.out.println(s1);

    }

}
