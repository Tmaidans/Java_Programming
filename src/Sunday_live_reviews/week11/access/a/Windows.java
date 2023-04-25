package Sunday_live_reviews.week11.access.a;

public class Windows extends Computer {

    public static void main(String[] args) {

        Windows test = new Windows();

        System.out.println(test.brand);
        System.out.println(test.memory);
        System.out.println(test.os);
        //System.out.println(test.hasWiFiCard); private variable cannot be accessed
        System.out.println(test);

        System.out.println(Windows.name); //to access static variables and methods
        Windows.testies();
    }


}
