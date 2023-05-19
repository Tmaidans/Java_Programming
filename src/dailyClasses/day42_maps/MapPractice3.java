package dailyClasses.day42_maps;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice3 {

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
        person4.put("salary", 88000);
        person4.put("married", true);
        person4.put("hire_date", LocalDate.now());

        Map<String, Object>[] arrayOfMap = new Map[4];
        arrayOfMap[0] = person1;
        arrayOfMap[1] = person2;
        arrayOfMap[2] = person3;
        arrayOfMap[3] = person4;

        arrayOfMap[1].replace("salary", ((Double) arrayOfMap[1].get("salary")) + 666);

        System.out.println(Arrays.toString(arrayOfMap));

        System.out.println("-------------------------------------------------------------------------------------------");

    }

}
