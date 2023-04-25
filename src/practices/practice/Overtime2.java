package practices.practice;

 /*
    Overtime [if else, operators, variables]
	Declare and assign the following variables
		hourly rate & number of hours worked
	Calculate your total net pay for the week. Also consider if any overtime should be paid. Overtime will be 1.5 times
	 the normal rate and should be paid for every hour over 40.
	(if you worked 43 hours total, you will get 40 hours normal pay and 3 hours overtime pay)
	Output different messages based on overtime
		if normal hours were worked (40 hours or less):
			You worked $hours hours, so your total net pay is: $netPay
		if you worked overtime (more than 40 hours):
			Wow you worked $hours hours so you will get $overtime_hours of overtime. Your net pay is $netPay
     */

public class Overtime2 {

    public static void main(String[] args) {

        double rate = 50.0;
        int totalHours = 50;


        double netPay = rate*totalHours;
        int overtime = totalHours-40;

        if (totalHours <= 40){
            System.out.println("You worked "+ totalHours + "hours, so your total pay is : $" + netPay);
        }else{
            netPay+=overtime*1.5*rate;
            System.out.println("Wow you worked " + totalHours + "hours so you will get " + overtime + "hours of overtime. Your pay is $" +netPay);
        }


    }

}
