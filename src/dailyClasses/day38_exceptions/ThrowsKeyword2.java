package dailyClasses.day38_exceptions;

import java.io.FileInputStream;

public class ThrowsKeyword2 {

    public static void main(String[] args) throws InterruptedException {

        method1();

    }

    public static void pauseFor5Seconds() throws InterruptedException {

        Thread.sleep(5000);

    }

    public static void method1() throws InterruptedException {
        System.out.println("Hello World");
        pauseFor5Seconds();
        System.out.println("Hello Cydeo");
    }

    public static void method2() throws  Exception{ //when you have multiple exceptions in one code block

        System.out.println("First Program started");

        Thread.sleep(3000);

        System.out.println("first program ended");

        new FileInputStream( " ");

        Thread.sleep(4000);
    }


}
