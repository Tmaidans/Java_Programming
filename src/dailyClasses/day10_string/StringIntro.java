package dailyClasses.day10_string;

import java.util.Scanner;
import java.lang.String; // String class import
import java.lang.System; // system class import

public class StringIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = "Java";

        System.out.println("------------------------------------------------");

        input.close();

        String s1 = "Cat";
        String s2 = "Dog";

        String s3 = "Cat";
        String s4 = "Cat";

        System.out.println(s1 == s3);

        System.out.println("------------------------------------------------");

        String str1 = new String("Java"); // Creates two objects, one is in string pool, second opens new memory in the heap.

        String str2 = new String("Java");

        System.out.println(str1==str2);

        System.out.println("------------------------------------------------");


        String t1= "Python";
        String t2 = new String ("Python");

        System.out.println(t1==t2);


    }
}
