package practices.practice;

public class confusingIncrementOperators {

    public static void main(String[] args) {

        int x=4,
                y = x--;

        System.out.println(x); //x already became 3 after y has been assigned. At this point y already happened

        System.out.println(y); // y = 4 because x changes value after y is assigned
            --y;               //y get decreased by 1 before the next print statement comes into effect. No difference between pre and post increment
        System.out.println("y = " + y);

    }

}
