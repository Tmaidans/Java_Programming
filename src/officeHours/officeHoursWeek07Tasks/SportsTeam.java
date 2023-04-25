package officeHours.officeHoursWeek07Tasks;

/*

T5SportsTeam [object type]

    Create a class called SportsTeam
    declare these instance variables:
        name, number of players, coach, win/loss record, country, number of fans

    create a setInfo() method to initialize these variables

    create a method joinFanclub
        it is a void method with no parameters, but whenever it is run the number of fans increases by one

    create a toString() that shows the information in the following format:
        The $name sports team is based out of $country. A total of $player players are led by $coach and currently hold a $record record of wins and losses. They have $fans fans.

    use the ObjectTester class and create some SportsTeam objects

 */

public class SportsTeam {

    String teamName, coach, country;
    int playersNum, win, loss, fans;

    public void setInfo(String name, String coach, String country, int playersNum, int win, int loss, int fans) {
        this.teamName = name;
        this.coach = coach;
        this.country = country;
        this.playersNum = playersNum;
        this.win = win;
        this.loss = loss;
        this.fans = fans;
    }

    public void joinFanClub (){
        fans+=1;
    }

    public String record (){
        String record = win + "/" + loss;
        return record;
    }

    public String toString() {
        return "The " + teamName + " sports team is base out of " + country + ". " +
                "A total of " + playersNum + " players are led by " + coach + " and currently " +
                "hold a " + record() + " record of wins and losses. They have " + fans + " fans.";
    }
}


