package dailyClasses.day42_maps;

import java.time.LocalDate;
import java.util.*;

public class MapPractice2 {

    public static void main(String[] args) {

        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000.5);
        person1.put("married", true);
        person1.put("hire_date", LocalDate.now());

        System.out.println(person1);

        Map<String, Object> person2 = new LinkedHashMap<>();
        person2.put("name", "Nora");
        person2.put("gender", 'F');
        person2.put("age", 22);
        person2.put("job_title", "Back end developer");
        person2.put("salary", 98000.5);
        person2.put("married", true);
        person2.put("hire_date", LocalDate.of(2022, 2, 1));

        System.out.println(person2.get("age"));

        System.out.println("-----------------------------------------------------------------------------");

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
        person4.put("job_title", "SDET");
        person4.put("salary", 120000.5);
        person4.put("married", true);
        person4.put("hire_date", LocalDate.now());

        Map<String, Object> person5 = new LinkedHashMap<>();

        List<Map<String, Object>> listOfMap = new ArrayList<>(); //list of map
        listOfMap.add(person1);
        listOfMap.add(person2);
        listOfMap.add(person3);
        listOfMap.add(person4);

        //  listOfMap.addAll(Arrays.asList(person3,person4,person5));

        System.out.println(listOfMap);

        System.out.println("-----------------------------------------------------------------------------");

        for (Map<String, Object> each : listOfMap) {
            System.out.println(each);
            for (Map.Entry<String, Object> eachEntry : each.entrySet()) {
                System.out.println(eachEntry);
            }
        }

        System.out.println("-----------------------------------------------------------------------------");

        //display the names of employees that were hired in 2023

        for (Map<String, Object> eachMap : listOfMap) {
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) { //iterates through every entry in the given map
                if (eachEntry.getKey().equals("hire_date")) {
                    if (((LocalDate) eachEntry.getValue()).getYear() == 2023) {
                        System.out.println(eachMap.get("name"));
                    }
                }

            }


        }

        System.out.println("-----------------------------------------------------------------------------");

        System.out.println(listOfMap);

        listOfMap.get(0).replace("name", "Dingus");
        listOfMap.get(listOfMap.size() - 1).replace("salary", ((Double)listOfMap.get(listOfMap.size() - 1).get("salary")) + 50_000);//map is always returns an object, so it needs to be down cast to needed type Integer, String...

        System.out.println(listOfMap);

        System.out.println("-----------------------------------------------------------------------------");

        Map<String,Object> car1 = new LinkedHashMap<>();
        car1.put("brand", "BMW");
        car1.put("model", "X5");
        car1.put("year", 2023);
        car1.put("color", "Black");
        car1.put("price", 45000.50);

        Map<String,Object> car2 = new LinkedHashMap<>();

        Map<String,Object> car3 = new LinkedHashMap<>();

        Map<String,Object> car4 = new LinkedHashMap<>();

        List<Map<String,Object>> listOfCars = new ArrayList<>();
        listOfCars.addAll(Arrays.asList(car1,car2,car3,car4));

        System.out.println(listOfCars);




    }

}
