package officeHours.officeHoursWeek12Tasks.candy;

public class CandyFactory {

    public static void main(String[] args) {

        HersheyBar hershey = new HersheyBar("Disney",300,true);

        System.out.println(hershey);
        System.out.println(HersheyBar.largestConsumer);
        System.out.println(HersheyBar.totalCandy);


    }

}
