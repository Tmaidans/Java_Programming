package dailyClasses.day41_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {

    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();
        map.put("C02", " Josh");
        map.put("B03","Nora");
        map.put("A02", " Dingus");
        map.put("A04","Tatiana");
        map.put("A05","Abudila");
        map.put("A06","Abudila");
        map.put("A07","Abudila");

        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.get("A04"));

        map.put("A04","Lucy");
        System.out.println(map);

        map.replace("C02","Tim");
        System.out.println(map);

        map.remove("A06");
        System.out.println(map);

        System.out.println(map.containsKey("A06"));

    }

}
