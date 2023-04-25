package dailyClasses.day20_forEach.Practice;

/*

Write a program that can display the unique elements of an array

			MUST use for each loops

 */


public class UniqueElements {

    public static void main(String[] args) {

int [] arr1 = {1,2,3,4,5,5,7,1,24,24,55,1};
String unique = "";

        for (int each : arr1) {

        int count =0;

            for (int i = 0; i <arr1.length ; i++) {
                if(each==arr1[i]){
                    count++;
                }
            }

            if (count==1){
                unique+=each+" ";
            }

        }

        System.out.println("unique = " + unique);


    }

}
