package dailyClasses.day39_collections.multiThreading;

public class TestMultiThreads {

    public static void main(String[] args) {

        Thread thread1 = new ThreadHelloWorld();
        Thread thread2 = new ThreadHelloWorld();

        thread1.start();
        thread2.start();

    }

}
