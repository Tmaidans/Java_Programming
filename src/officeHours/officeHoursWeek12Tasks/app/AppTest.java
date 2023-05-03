package officeHours.officeHoursWeek12Tasks.app;

public class AppTest {

    public static void main(String[] args) {

        Instagram insta = new Instagram(2);

        insta.postPicture();
        System.out.println(insta.name);

        Youtube you = new Youtube("Youtubs",3);

        you.watchVideo();
        System.out.println(you.version);

    }

}
