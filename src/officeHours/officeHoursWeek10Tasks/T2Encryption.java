package officeHours.officeHoursWeek10Tasks;

public class T2Encryption {

    public String message;
    public int modify;
    public int factor;

    public T2Encryption(String message) {
        this.message = message;
    }

    public T2Encryption(String message, int modify, int factor) {
        this(message);
        this.modify = modify;
        this.factor = factor;
        encrypt();

    }


    public void encrypt() {

        String encryptedMessage = "";

        for (int i = 0; i < message.length(); i++) {

            encryptedMessage += (message.charAt(i) + modify) * factor + " ";

        }
        message = encryptedMessage.trim();

    }

    public static String decrypt(String message, int modifyNumber, int factorNumber) {

        String[] messageArr = message.split(" ");
        String decryptedMessage = "";
        for (String each : messageArr) {
            decryptedMessage += (char) (Integer.parseInt(each) / factorNumber - modifyNumber);

        }

        return decryptedMessage;
    }

    public static void main(String[] args) {

        T2Encryption test = new T2Encryption("james bond", 20, 2);
        System.out.println(test.message);

        System.out.println("----------------------------------------");

        System.out.println(T2Encryption.decrypt(test.message, 20, 2));

    }

}
