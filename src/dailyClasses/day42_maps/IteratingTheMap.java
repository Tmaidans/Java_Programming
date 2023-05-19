package dailyClasses.day42_maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class IteratingTheMap {

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Daniel", 95000);
        map.put("Emily", 100000);
        map.put("Bella", 85000);
        map.put("Aaron", 78000);
        map.put("Tim", 90000);
        map.put("Anastasia", 34000);

        //Iterating the map by the keys
        for (String eachKey : map.keySet()) {
            map.replace(eachKey, map.get(eachKey) * 2);
        } //returns every single key

        System.out.println(map);

        System.out.println("--------------------------------------------------------------------------------");

        //Iterating the map by values
        for (Integer eachValue : map.values()) {
            System.out.println(eachValue);
        }

        System.out.println("--------------------------------------------------------------------------------");

        //Iterating map by entry

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            System.out.println(eachEntry);
        }

        System.out.println("--------------------------------------------------------------------------------");

        System.out.println(map);

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
           String eachKey = eachEntry.getKey();
           Integer eachValue = eachEntry.getValue();
           eachEntry.setValue(eachValue+10000);
            System.out.println(eachKey+ " : " + eachValue);

        }

        System.out.println(map);



    }

}
