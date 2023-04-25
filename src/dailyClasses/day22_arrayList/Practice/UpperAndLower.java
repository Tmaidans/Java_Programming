package dailyClasses.day22_arrayList.Practice;

public class UpperAndLower {

    public static void main(String[] args) {

        String str = "JAVA java";

        Boolean upperAndLower = true;

        int upper = 0;
        int lower = 0;

            str=str.replace(" ","");

        for (int i = 0; i < str.length(); i++) {

            if (Character.isUpperCase(str.charAt(i))){
                upper++;
            }else{
                lower++;
            }
        }

        if (upper!=lower){
            upperAndLower=false;
        }

        System.out.println(upperAndLower);

    }

}
