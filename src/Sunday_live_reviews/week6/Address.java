package Sunday_live_reviews.week6;

public class Address {

    public String street;
    public String city;
    public int zip;
    public String country;

    public void setInfo(String street, String city, int zip, String country) {
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.country = country;
    }

    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zip=" + zip +
                ", country='" + country + '\'' +
                '}';
    }
}
