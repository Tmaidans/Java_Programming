package dailyClasses.day07_ifStatements.practices;

/*

3. Create a class called CrewAndPassenger, Given a number of people on the ship (int number), determine how many need to be crew members and how many can be passengers. Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */

public class CrewAndPassenger {

    public static void main(String[] args) {

        int numberOfPeople = 55;

        String answer;
        int crew,
                passengers;

        if (numberOfPeople == 50 || numberOfPeople == 75 || numberOfPeople == 100) {

            if (numberOfPeople == 50) {
                crew = 20;
                passengers = 30;
            } else if (numberOfPeople == 75) {
                crew = 25;
                passengers = 50;
            } else {
                crew = 30;
                passengers = 70;
            }

            System.out.println("Total:" + numberOfPeople + " ====> " + crew + " crew, " + passengers + " passengers");

        } else {
            System.err.println("Invalid Parameters");
        }

    }

}
