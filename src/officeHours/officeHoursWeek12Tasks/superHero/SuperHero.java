package officeHours.officeHoursWeek12Tasks.superHero;

import java.util.ArrayList;
import java.util.Arrays;

public class SuperHero {

    String heroName;
    String realName;
    String universe;
    ArrayList<String> powers;

    public SuperHero(String heroName, String realName, String universe, String[] powers) {
        this.heroName = heroName;
        this.realName = realName;
        this.universe = universe;
        this.powers = new ArrayList<>();
    }

    void protect(){
        System.out.println(heroName + " protecting");
    }

    @Override
    public String toString() {
        return "SuperHero{" +
                "heroName='" + heroName + '\'' +
                ", realName='" + realName + '\'' +
                ", universe='" + universe + '\'' +
                ", powers=" + Arrays.toString(powers) +
                '}';
    }
}
