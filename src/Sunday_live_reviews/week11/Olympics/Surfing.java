package Sunday_live_reviews.week11.Olympics;

public class Surfing extends OlympicSport {


    public Surfing(String name, int participants) {
        super(name, participants);
    }

    @Override
    public void compete() {
        System.out.println("Surfing the waves");
    }
}

