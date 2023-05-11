package dailyClasses.day38_exceptions;

public class TestPersonObject {

    public static void main(String[] args) {


        Person person1 = new Person("Tim", 22, 'M');

        try {
            person1.setAge(-21);
        }catch (RuntimeException e){

        }

        System.out.println(person1);



    }

}
