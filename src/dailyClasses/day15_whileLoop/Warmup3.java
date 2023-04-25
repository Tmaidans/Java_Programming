package dailyClasses.day15_whileLoop;

public class Warmup3 {

    public static void main(String[] args) {

        String str = "aafadfaefqetqgtqgbbbcccccccccccccccc";
        String str2="";
        int length = str.length();



        for (int i = 0; i <length; i++) {

            if (!str2.contains(""+str.charAt(i))){

                str2+=str.substring(i,i+1);
            }

             /*   String letter = "" + str.charAt(0);
                str2 += str.substring(0,1);
                str = str.replace(letter, "");
                length  = str.length()+1;

              */

           }

        System.out.println("str2 = " + str2);
        System.out.println("str = " + str);

        }



    }

