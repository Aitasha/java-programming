package day47_constructors;

public class Address {
    private String street = "";
    private String city = "";
    private String state = "";
    private String zipCode = "";
    private String country = "USA";

    //constructor  - automatically called - no return type special method - same name as class name
    public Address() {
        System.out.println("Address constructor");
        street = "123 Unknown st";
        country = "Unknown";
        state = "Unknown";
        zipCode = "00000";
    }

    //second constructor, overloaded constructor -> provides shortcut to initialize variables
    public Address(String street, String city, String state, String zipCode) {
        setStreet(street);
    }






    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }



}
