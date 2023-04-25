package Sunday_live_reviews.week11.access.a;

public class Computer {

    public String os;
    protected int memory;
    String brand;
    private boolean hasWiFiCard;
    public static String name = "tim";

    public static void testies (){
        System.out.println("Testies");
    }

    @Override
    public String toString() {
        return "Computer{" +
                "os='" + os + '\'' +
                ", memory=" + memory +
                ", brand='" + brand + '\'' +
                ", hasWiFiCard=" + hasWiFiCard +
                '}';
    }
}
