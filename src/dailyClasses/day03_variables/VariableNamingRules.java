package dailyClasses.day03_variables;

/*
variable naming rules:
		1. readable, understandable, and meaningful
		2. must be UNIQUE
		3. camel case
		4. can not have special characters other than _ and $
		5. can not start with digits
		6. can not be java reserved words
 */
public class VariableNamingRules {

    public static void main(String[] srgs) {

        // age of the student is 28
        // salary of the person is 10000

        int age = 28;
        int salary = 10_000;


        // int age = 32; // Variable name must be unique

        int phoneNumber = 123456789; // camel case

        double salary_before_tax = 1123344.5;

        double salaryAfterTax$ = 1230000;

        System.out.println("----------------------------------------------");

        int number1 = 10;
        int numberTwo = 20;
        int number3 = 30;

        //double abstract = 5.5; // variable names cannot be Java reserved words
        //double final = 85.5;

        System.out.println("----------------------------------------------");

        //gender is male
        String gender = "Male";

        String fullName = "Cydeo School";

        System.out.println(gender);
        System.out.println(fullName);


    }

}
