package Sunday_live_reviews.week11.Olympics;

public class OlympicSport {

    public String name;
    public int participants;

    public static int firstOlympics = 1986;

    public OlympicSport(String name, int participants) {
        this.name = name;
        this.participants = participants;

    }

    public void compete() {

    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", participants=" + participants +
                '}';
    }
}
