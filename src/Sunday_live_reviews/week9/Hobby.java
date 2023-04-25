package Sunday_live_reviews.week9;

public class Hobby {

    public String name;
    public double annualCost;
    public Boolean isOutdoors,requiresOthers;
    public String place;

    public Hobby(String name) {
        this.name = name;
    }

    public Hobby(String name, double annualCost) {
        this(name);
        this.annualCost = annualCost;
    }

    public Hobby(String name, double annualCost, boolean isOutdoors, boolean requiresOthers) {
        this(name,annualCost);
        this.isOutdoors = isOutdoors;
        this.requiresOthers = requiresOthers;
        if (isOutdoors){
            place = "outside";
        }else{
            place="inside";
        }
    }

    public void doIt(){

        System.out.println("Doing " + name + " " + place);
        //(isOutdoors ? " outsie" : "inside")
    }


    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", annualCost=" + annualCost +
                ", isOutdoors=" + isOutdoors +
                ", requiresOthers=" + requiresOthers +
                ", place='" + place + '\'' +
                '}';
    }
}
