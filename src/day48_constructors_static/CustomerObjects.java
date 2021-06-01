package day48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer cs1 = new Customer();
        System.out.println(cs1); //print with default values that are set in no-args constructor

        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println(cs1);

        Customer cs2 = new Customer("Mike", 2); //create object and assign values in same statement
        Customer cs3 = new Customer("John Ward III", 4873);

        System.out.println(cs2);
        System.out.println(cs3);

        //array of Customer objects - array is fixed size
        Customer[] todaysCustomers = {cs1, cs2, cs3, new Customer("Bashir", 449)};

        //arrayList of Customer objects
        List<Customer> customersList = new ArrayList<>();
        customersList.add(cs1);
        customersList.add(cs2);
        customersList.add(cs3);
        customersList.add(new Customer("Bashir", 449));
        customersList.add(new Customer("Suleyman", 9763));
        customersList.add(new Customer("Ayta", 777));

        //Print info of first customer object in array and arrayList
        System.out.println(todaysCustomers[0].toString());
        System.out.println(customersList.get(0));

        System.out.println(customersList); //print toString() info of all Customer objects

        System.out.println("----------FOR LOOP-----------");
        for (int i = 0; i < customersList.size(); i++) {
            System.out.println(customersList.get(i));
        }

        System.out.println("----------FOR EACH LOOP-----------");
        for(Customer customer : customersList){
            System.out.println(customer);
        }

        //print only names of Customers in the list
        System.out.println("---- NAMES OF CUSTOMERS ----");
        customersList.forEach(each -> System.out.println(each.getName())); //lambda expression

        for (Customer eachCustomer : customersList) {
            System.out.println(eachCustomer.getName());
        }




    }
}
