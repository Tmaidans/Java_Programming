package dailyClasses.day05_operators;

/*
1. Create a class called SalaryCalculator.java
			1.1declare the following variables:
					hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

			1.2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax
				Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52

			1.3 use print statement to print each of the above
					Ex:	   hourlyRate = $50
						   weeklyHours = 45
						   stateTaxRate = 6 (given as percentage, you need to convert to decimal)
						   federalTaxRate = 26 (given as percentage, you need to convert to decimal)

					    output:
					    	Gross pay is: $117000
					    	Federal tax is: $30420
				    		State tax is: $7020
				    		Total tax is: $37440
				    		Net income is: 79560
 */

public class SalaryCalculator {

    public static void main(String[] args) {

        int hourlyRAte = 55,
                weeklyHours = 45;

        double stateTaxRate = 6,
                federalTaxRate = 26;

        int salaryBeforeTax = hourlyRAte * weeklyHours * 52,
                stateTax = (int) salaryBeforeTax * 6 / 100,
                federalTax = (int) salaryBeforeTax * 26 / 100,
                totalTax = stateTax + federalTax,
                salaryAfterTax = salaryBeforeTax - stateTax - federalTax;

        System.out.println("Gross pay is: $" + salaryBeforeTax + "\n" +
                "Federal tax is: $" + federalTax + "\n" +
                "State tax is: $" + stateTax + "\n" +
                "Total tax is : $" + totalTax + "\n" +
                "Net income is: " +salaryAfterTax);


    }
}
