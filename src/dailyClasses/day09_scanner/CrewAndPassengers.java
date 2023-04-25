package dailyClasses.day09_scanner;

public class CrewAndPassengers {

    public static void main(String[] args) {

        int passenger = 50;

        String breakdown;

        switch (passenger) {

            case 50:
                breakdown = "20 crew, 30 passengers";
                break;

            case 75:
                breakdown = "25 crew, 50 passengers";
                break;

            case 100:
                breakdown = "30 crew, 70 passengers";
                break;

            default:
                breakdown = "Invalid ammount";
        }

        System.out.println(breakdown);


    }

}
