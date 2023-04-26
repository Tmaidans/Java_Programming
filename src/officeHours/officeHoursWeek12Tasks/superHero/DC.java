package officeHours.officeHoursWeek12Tasks.superHero;

import java.util.ArrayList;

public class DC extends SuperHero{

    String city;

    public DC(String heroName, String realName, ArrayList<String> powers, String city) {
        super(heroName, realName, "DC", powers);
        this.city = city;
    }

    @Override
    void protect() {
        System.out.println(heroName + " protecting with honor");
    }

    @Override
    public String toString() {
        return "SuperHero{" +
                "heroName='" + heroName + '\'' +
                ", realName='" + realName + '\'' +
                ", universe='" + universe + '\'' +
                ", powers=" + powers +
                ", city=" + city +
                '}';
    }
    }
}
