package dailyClasses.day18_garbageCollection.practice;

public class Contact {

    String name;
    long phoneNumber;
    String email;

    public void setInfo(String name, long phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void call (){
        System.out.println("Calling " + name + " now");
    }

    public void sendMessage (){
        System.out.println("Sending message to " + phoneNumber + " now");
    }

    public void sendEmail (){
        System.out.println("Sending email to " + email + " now");
    }
}
