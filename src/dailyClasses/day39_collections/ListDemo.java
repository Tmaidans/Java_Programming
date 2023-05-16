package dailyClasses.day39_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(); //array based class ==> retrieving element faster (can randomly access elements at specified indexes
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);

        arrayList.remove(0);

        arrayList.get(0);


        LinkedList<Integer> linkedList = new LinkedList<>(); //node based class (doubly linked list) ==> add(), allAll(), remove(), removeAll(), removeIf(), retainAll()
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);

        linkedList.remove(0);

        linkedList.get(0);

        System.out.println("linkedList = " + linkedList);
        System.out.println("arrayList = " + arrayList);

        System.out.println("------------------------------------------------------------------------------------------------------------");



    }

}
