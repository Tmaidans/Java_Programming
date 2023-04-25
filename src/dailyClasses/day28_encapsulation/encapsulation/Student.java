package dailyClasses.day28_encapsulation.encapsulation;

public class Student {

    private String name;
    private int age;

    public int getAge() { //getter for age variable
        if (age == 0) {
            System.err.println("Age has not been set");
            System.exit(1);
        }
        return age;
    }

    public void setAge(int age) { // setter for age variable

        if (age < 1 || age > 100) { // if the age is invalid
            System.err.println("Invalid Age : " + age);
            //  return; //exits the current method
            System.exit(1); //entire program gets terminated
        }
        this.age = age;
    }

    public String getName() {

        if (name == null) {
            System.err.println("Name has not been set");
            System.exit(1);
        }

        return name;
    }

    public void setName(String name) {

        boolean hasDigit = false;
        // name.replace(" ","").toCharArray();
        for (char each : name.toCharArray()) {
            if (Character.isDigit(each)) {
                hasDigit = true;
            }
        }

        if (hasDigit) {
            System.err.println("Invalid Name");
            System.exit(1);
        }

        this.name = name;
    }


}
