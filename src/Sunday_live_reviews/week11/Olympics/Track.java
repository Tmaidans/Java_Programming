package Sunday_live_reviews.week11.Olympics;

public class Track extends OlympicSport {

    public Track(String name, int participants) {
        super(name, participants);
    }

    @Override
    public void compete() {
        System.out.println("Track for running, jumping, throwing");
    }
}
