package dailyClasses.day39_collections.multiThreading;

public class ThreadHelloWorld extends Thread {

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println("Hello World " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
