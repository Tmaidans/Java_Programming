package dailyClasses.day15_whileLoop;

public class RemoveDuplicates2 {

    public static void main(String[] args) {

        String str = "xyzxyzxyz";
        String str2="";

        for (int i = 0; i < str.length(); i++) {

            if (str2.contains(""+str.charAt(i))){
                continue;
            }
            str2+=str.charAt(i);

        }
        System.out.println(str2);



    }
}
