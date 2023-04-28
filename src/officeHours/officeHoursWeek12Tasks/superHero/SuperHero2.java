package officeHours.officeHoursWeek12Tasks.superHero;

import java.util.ArrayList;

public class SuperHero2 {

    private String superHeroName;
    private String realName;
    private String universe;
    private ArrayList<String> powers;

    public SuperHero2(String superHeroName, String realName, ArrayList<String> powers) {
        this.superHeroName = superHeroName;
        this.realName = realName;
        this.universe = getClass().getSimpleName();
        this.powers = new ArrayList<>(powers);
    }

    public void protect(){
        System.out.println(superHeroName + " protecting ");
    }

    public String toString(){
        return superHeroName + " from " + universe + "They have these powers:\n" + powers;
    }

    public ArrayList<String> getPowers() {
        return powers;
    }

    public void setPowers(ArrayList<String> powers) {
        this.powers = powers;
    }

}
