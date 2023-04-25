package officeHours.officeHoursWeek09Tasks;

/*

T3StarWarsFactions [ArrayList, String, Loop]

    Create a program that defines an ArrayList with names. Go through the names and separate them into separate ArrayLists based on the faction they belong to. Print all the factions at the end

        The factions can be determined by key titles in the names
        ignore case sensitivity

        titles - & - related factions

        jedi - jedi order
        imperial, trooper, or officer - galactic empire
        rebel, or alliance - rebel alliance

    Sample data: Add more data if you want

        "Jedi Yoda", "officer Versio", "officer Brunson", "Trooper Needa", "Jedi Windu", "Jedi Skywalker", "Princess Leia Rebel", "Rebel Sabine", "Rey Jedi", "Rook Alliance", "imperial Terex"

 */


import java.util.ArrayList;
import java.util.Arrays;

public class T3StarWarsFactions {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Jedi Yoda", "officer Versio", "officer Brunson",
                "Trooper Needa", "Jedi Windu", "Jedi Skywalker", "Princess Leia Rebel", "Rebel Sabine", "Rey Jedi",
                "Rook Alliance", "imperial Terex"));

        ArrayList<String> jediOrder = new ArrayList<>();
        ArrayList<String> galacticEmpire = new ArrayList<>();
        ArrayList<String> rebelAlliance = new ArrayList<>();

        for (String each : list) {

            each=each.toLowerCase();

            if(each.contains("jedi")){
                jediOrder.add(utilities.StringUtility.capitalize(each.replace("jedi","").trim()));

            }else if (each.contains("rebel")||each.toLowerCase().contains("alliance")){
                rebelAlliance.add(utilities.StringUtility.capitalize(each.replace("rebel","").replace("alliance","").trim()));

            }else{
                galacticEmpire.add(each);
            }

        }

        System.out.println("rebelAlliance = " + rebelAlliance);
        System.out.println("galacticEmpire = " + galacticEmpire);
        System.out.println("jediOrder = " + jediOrder);

    }

}
