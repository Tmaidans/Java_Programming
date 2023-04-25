package officeHours.officeHoursWeek03Tasks;


/*

T5BuyHouse [variables, if statement, operators, logical & relational operators]

    Create a program that will define two variables: credit score and salary
    Use the given information to determine if you are eligible for a loan to buy a new house
    here are the criteria for eligibility:
        credit score of 720 or above and salary of 100,000 or above
        credit score of 740 or above and salary of 80,000 or above

    Output:
        if you are eligible because you meet one of the above conditions:
            Start packing because you are eligible for this loan!
        if you are not eligible:
            Sorry we cannot offer a loan to you at this given time

 */
public class T5BuyHouse {

    public static void main(String[] args) {

        double salary = 100_000;
        int creditScore = 740;

        String eligibility = "";

        boolean eligibility1 = salary >= 100000 && creditScore >= 720,
                eligibility2 = salary >= 80000 && creditScore >= 740;

        /*if (salary >= 100000 && creditScore >= 720) {
            eligibility = "Start packing because you are eligible for this loan!";
        } else if (salary >= 80000 && creditScore >= 740){
            eligibility = "Start packing because you are eligible for this loan!";
        }else{
            eligibility = "Sorry we cannot offer a loan to you at this given time";
        }
        System.out.println(eligibility);

         */

        if (eligibility1 || eligibility2) {
            eligibility = "Start packing because you are eligible for this loan!";
        }

        if (!eligibility1 && !eligibility1) {
            eligibility = "Sorry we cannot offer a loan to you at this given time";
        }
        System.out.println(eligibility);

    }
}
