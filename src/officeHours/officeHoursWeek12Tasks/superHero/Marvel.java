package officeHours.officeHoursWeek12Tasks.superHero;

import java.util.ArrayList;

public class Marvel extends SuperHero{

    public Marvel(String heroName, String realName, ArrayList<String> powers) {
        super(heroName, realName,powers);
    }

    void callAvengers(){
        System.out.println("Calling all avengers");
    }

    @Override
    void protect() {
        System.out.println(heroName + "protecting ny any means necessary");
    }
}
