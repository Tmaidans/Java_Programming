package dailyClasses.day19_array.practice;

public class CommonElements {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        for (int i = 0; i < arr1.length; i++) {

            int firstNum = arr1[i];

            for (int j = 0; j < arr1.length; j++) {
                if(firstNum==arr2[j]){
                    System.out.print(firstNum+" ");;
                }
            }

        }



    }

}
