package officeHours.officeHoursWeek06Tasks;

public class T2SwapFirstLast {

    public static void main(String[] args) {


        System.out.println(swap("Tim maidans"));

    }

    public static String swap (String str){

        int length = str.length();



        return str.substring(length-1)+str.substring(1,length-1)+ str.substring(0,1);
    }

}
