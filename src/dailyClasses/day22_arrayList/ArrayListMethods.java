package dailyClasses.day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10); //0
        list.add(20); //1
        list.add(30); //2
        list.add(10); //3

        System.out.println(list);

        list.add(1,15);

        System.out.println(list);

        list.add(2,25);

        System.out.println(list);

        System.out.println("---------------------------------------------------------------");

        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("Mohammad");
        studentList.add("Abdurasul");
        studentList.add("Abidullah");
        studentList.add("Tatiana");

        System.out.println("Size: " + studentList.size());

        String firstStudent =  studentList.get(0);

       String lestStudent =  studentList.get(studentList.size()-1);

        System.out.println("firstStudent = " + firstStudent);
        System.out.println("lestStudent = " + lestStudent);


    }

}
