package dailyClasses.day31_inheritance.animal_methodOverriding;

public class Lion extends Animal {

    private boolean isAfricanLion;

    public Lion(String name, String breed, char gender, int age, String size, String color, boolean isAfricanLion) {
        super(name, breed, gender, age, size, color);
        setAfricanLion(isAfricanLion);
    }

    public boolean isAfricanLion() {
        return isAfricanLion;
    }

    public void setAfricanLion(boolean africanLion) {
        isAfricanLion = africanLion;
    }

    @Override
    public void eat() {
        System.out.println("Lion " + getName() + " is eating Lion food");
    }

    @Override
    public void sleep() {
        System.out.println("Lion " + getName() + "sleeps 5 hours in a day");
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", African Lion='" + isAfricanLion + '\'' +
                '}';
    }
}




