package dailyClasses.day37_exceptions;

import dailyClasses.day35_polymorphism.transportation.Car;

public class MultiCatchBlock {

    public static void main(String[] args) {

        System.out.println("Program 1 started");

        Car car = null;

        try {
            car.drive();
        }catch (ArithmeticException e){
            System.out.println("First catch block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("Second catch block");
            e.printStackTrace();
        }catch (NullPointerException e) {
            System.out.println("Third catch block");
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Forth catch block");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("Fifth catch block");
            e.printStackTrace();
        }
        System.out.println("Program 1 ended");


    }

}
