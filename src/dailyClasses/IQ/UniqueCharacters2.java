package dailyClasses.IQ;

public class UniqueCharacters2 {

    public static void main(String[] args) {

        String str="timmaidansssttt";
        String output="";


        for (int i = 0; i < str.length(); i++) {

            int counter=0;

             for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i)==str.charAt(j)){
                    counter+=1;
                }
            }

            if (counter==1){
                output+=str.charAt(i);
            }

        }
        System.out.println(output);

    }


}
