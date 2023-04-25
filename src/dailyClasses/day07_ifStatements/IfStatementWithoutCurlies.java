package dailyClasses.day07_ifStatements;

public class IfStatementWithoutCurlies {

    public static void main(String[] args) {

        int age = 32;

        if(age >=21){
            System.out.println("Eligible");
        }else{
            System.out.println("not eligible");
        }

        System.out.println("-----------------------------------");

        if (age >=21) System.out.println("Eligible");
        else System.out.println("Not Eligible");

        System.out.println("-----------------------------------");

        int itemNumber = 1;

        if (itemNumber ==1){
            System.out.println("Eggs ");
            System.out.println("orange");

        }else if (itemNumber ==2){
            System.out.println("Milk");
            System.out.println("Onions");
        }else{
            System.out.println("apple");
            System.out.println("cherry");
        }

    }
}
