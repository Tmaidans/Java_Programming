package dailyClasses.day28_encapsulation.PracticeTasks;

public class Credentials {

    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {


        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        if (!isStrongPassword(password)){
            System.err.println("Sorry password is not strong enough");
        }

        this.password = password;
    }



    public boolean isStrongPassword(String password){
       boolean isStrong = true;

       if (password.contains(" ")||password.length()<8){
           isStrong=false;
           return isStrong;
       }
       int letters = 0;
       int special = 0;
       int digit = 0;

      char[] passChar =   password.toCharArray();

        for (char each : passChar) {
            if(Character.isDigit(each)){
                digit+=1;
            }else if (Character.isLetter(each)){
                letters+=1;
            }else if (!Character.isLetter(each)&&!Character.isDigit(each)){
                special+=1;
            }
        }

        if(letters==0||special==0||digit==0){
            isStrong = false;
            return isStrong;
        }


        return isStrong;
    }


    @Override
    public String toString() {
        return "Credentials{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Credentials(String userName, String password) {
        this.userName = userName;
        setPassword(password);



    }
}
