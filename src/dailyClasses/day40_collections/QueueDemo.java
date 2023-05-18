package dailyClasses.day40_collections;

import java.util.*;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<Integer> queue1 = new PriorityQueue<>();//order is random, does not accept null
        queue1.addAll(Arrays.asList(10,200,300,40,90));
        queue1.addAll(Arrays.asList(10,200,300,40,90));
        queue1.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println(queue1);

       int num1 = queue1.poll(); //==>First in first out (FIFO)
        System.out.println(queue1);
        queue1.poll();
        queue1.poll();
        queue1.poll();

        System.out.println(queue1);



        Queue<Integer> queue2 = new ArrayDeque<>();


        Queue<Integer> queue3 = new LinkedList<>();



    }

}
