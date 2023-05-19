package dailyClasses.day42_maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {

    public static void main(String[] args) {

        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary",100000.5);
        person1.put("married", true);
        person1.put("hire_date", LocalDate.now());

        System.out.println(person1);

        Map<String, Object> person2 = new LinkedHashMap<>();
        person2.put("name", "Nora");
        person2.put("gender", 'F');
        person2.put("age", 22);
        person2.put("job_title", "Back end developer");
        person2.put("salary",98000.5);
        person2.put("married", true);
        person2.put("hire_date", LocalDate.of(2023,2,1));

        System.out.println(person2.get("age"));

    }

}
