package Sunday_live_reviews.week6;

public class TestObjects {

    public static void main(String[] args) {

        Item apples = new Item();
        apples.setInfo("Apple", 20, 1.35);
        System.out.println("apples = " + apples);


        Item javaBook = new Item();
        javaBook.setInfo("Java Book", 4, 150);
        System.out.println("javaBook = " + javaBook);

        System.out.println("-----------------------------------------");

        apples.sellItem(10);
        System.out.println(apples);

        System.out.println("-----------------------------------------");

        javaBook.sellItem(5);
        System.out.println(javaBook);

        System.out.println("-----------------------------------------");

        javaBook.sellItem(4);
        System.out.println(javaBook);
    }
}
