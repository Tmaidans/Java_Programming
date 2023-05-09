package dailyClasses.day37_exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        try {
            System.out.println(9/0); 
        }catch (RuntimeException e){
            System.out.println("Runtime exception had been cought");
            e.printStackTrace();
        }finally{
            System.out.println("Finally block");

        }

    }

}
