package day47_constructors;

public class AddressList {
    public static void main(String[] args) {
        Address cybertekAddress = new Address();//calling a constructor automatically
        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3300");
        cybertekAddress.setCity("McLean");
        cybertekAddress.setState("VA");
        cybertekAddress.setZipCode("22182");

        System.out.println("CybertekSchool address: " + cybertekAddress.toString());
        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3200");
        System.out.println("CybertekSchool address after update: " + cybertekAddress.toString());
        System.out.println("street info = " + cybertekAddress.getStreet());

        Address newAddress = new Address();
        newAddress.setStreet("7925 Jones Branch Dr Suite 3300");
        newAddress.setCity("McLean");
        newAddress.setState("VA");
        newAddress.setZipCode("22182");
        System.out.println(newAddress.toString());

        Address papaJhonPizza = new Address("8501 Tyco Rd St 1A", "Vienna", "VA", "22182");
        System.out.println("Papa Johns Pizza address = " + papaJhonPizza);

    }
}
