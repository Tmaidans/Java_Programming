package dailyClasses.day41_maps;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>(); //Random order, ACCEPTS NULL key and value

        hashMap.put("Daniel", 95000);
        hashMap.put("Emily", 100000);
        hashMap.put("Bella", 85000);
        hashMap.put("Aaron", 78000);
        hashMap.put("Chris", null);
        hashMap.put("Breanna", null);
        hashMap.put(null, 12000);

        System.out.println("hashMap = " + hashMap);

        System.out.println("----------------------------------------------------------------------------------------");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(); //maintains insertion order, ACCEPTS NULL in key and value

        linkedHashMap.put("Daniel", 95000);
        linkedHashMap.put("Emily", 100000);
        linkedHashMap.put("Bella", 85000);
        linkedHashMap.put("Aaron", 78000);
        linkedHashMap.put("Chris", null);
        linkedHashMap.put("Breanna", null);
        linkedHashMap.put(null, 12000);

        System.out.println("linkedHashMap = " + linkedHashMap);

        System.out.println("----------------------------------------------------------------------------------------");

        Map<String, Integer> treeMap = new TreeMap<>(); //sorted order by key, DOES NOT accept NULL as key, only value

        treeMap.put("Daniel", 95000);
        treeMap.put("Emily", 100000);
        treeMap.put("Bella", 85000);
        treeMap.put("Aaron", 78000);
        treeMap.put("Chris", null);
        treeMap.put("Breanna", null); //value can be null in tree map
        //treeMap.put(null, 12000); - key cannot be NULL in tree map

        System.out.println("treeMap = " + treeMap);

        System.out.println("----------------------------------------------------------------------------------------");

        Map<String, Integer> hashTable = new Hashtable<>(); //random order, DOES NOT accept NULL as key or value "SYNCED"

        hashTable.put("Daniel", 95000);
        hashTable.put("Emily", 100000);
        hashTable.put("Bella", 85000);
        hashTable.put("Aaron", 78000);
       // hashTable.put("Chris", null);
      // hashTable.put("Breanna", null);
       // hashTable.put(null, 12000);
        
        

        System.out.println("----------------------------------------------------------------------------------------");


    }

}
