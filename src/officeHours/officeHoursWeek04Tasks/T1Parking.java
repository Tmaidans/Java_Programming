package officeHours.officeHoursWeek04Tasks;

/*
T1Parking [ternary, relational]

	create a program that will define a time variable. Use a 24 hour format. Based on the given time determine the cost of parking in the city

		If the time is between 6-12:
			fee: 7.50

		if the time is between 13 - 23 or 0 - 5
			fee is 15
 */

public class T1Parking {

    public static void main(String[] args) {

        int time = 12;
        double fee;

            fee = (time >=6 && time <=12)? 7.50 : 15;

        System.out.println(fee);



    }
}
