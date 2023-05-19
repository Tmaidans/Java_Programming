package dailyClasses.day42_maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice4_mapOfMaps {

    public static void main(String[] args) {

        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000.5);
        person1.put("married", true);
        person1.put("hire_date", LocalDate.now());

        Map<String, Object> person2 = new LinkedHashMap<>();
        person2.put("name", "Nora");
        person2.put("gender", 'F');
        person2.put("age", 22);
        person2.put("job_title", "Back end developer");
        person2.put("salary", 98000.5);
        person2.put("married", true);
        person2.put("hire_date", LocalDate.of(2022, 2, 1));

        Map<String, Object> person3 = new LinkedHashMap<>();
        person3.put("name", "Tim");
        person3.put("gender", 'M');
        person3.put("age", 36);
        person3.put("job_title", "SDET");
        person3.put("salary", 120000.5);
        person3.put("married", true);
        person3.put("hire_date", LocalDate.of(2023, 2, 4));

        Map<String, Object> person4 = new LinkedHashMap<>();
        person4.put("name", "James");
        person4.put("gender", 'M');
        person4.put("age", 24);
        person4.put("job_title", "full stack SDET");
        person4.put("salary", 88000.5);
        person4.put("married", true);
        person4.put("hire_date", LocalDate.now());

        Map<Integer,Map<String,Object>> mapOfMaps = new LinkedHashMap<>();

        mapOfMaps.put(1,person1);
        mapOfMaps.put(2,person2);
        mapOfMaps.put(3,person3);
        mapOfMaps.put(4,person4);

        System.out.println(mapOfMaps);

        System.out.println("-----------------------------------------------------------------------------------");

        System.out.println(mapOfMaps.get(2));

        for (Map<String, Object> eachMap : mapOfMaps.values()) { //iterates each smaller map
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                if(eachEntry.getKey().equals("salary")){
                    eachEntry.setValue(((Double)eachEntry.getValue())+666); //raise salary of each employee by "n" ammount
                    System.out.println(eachMap);
                }
            }
        }
    }

}
