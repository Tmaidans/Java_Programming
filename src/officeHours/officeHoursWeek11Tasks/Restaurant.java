package officeHours.officeHoursWeek11Tasks;

public class Restaurant {

    public static void main(String[] args) {

        Entree newEntree = new Entree("Tim",2.99,'L');

        System.out.println(newEntree);

        System.out.println("---------------------------------------------");

        Taco newTaco = new Taco("Tim",1.99,'S',"Soft");

        System.out.println(newTaco);

        System.out.println("---------------------------------------------");

        Fish newFishDish = new Fish("Alek",2.99,'S',"Salmon");
        System.out.println(newFishDish);
    }

}
