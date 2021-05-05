package day41_arrayList;


import java.util.ArrayList;

public class CitiesList {

    public static void main(String[] args) {
        //declare arrayList alt/option + enter
        ArrayList<String> cities = new ArrayList<>();

        //add values or add cities to arrayList -> add methods
        cities.add("Washington DC"); //0
        cities.add("New York"); //1
        cities.add("Vienna");// 2
        cities.add("Adana");//3
        cities.add("LA");//4
        System.out.println(cities);
        // add Ashgabat to 1st index
        cities.add(0,"Ashgabat");
        //print all values in the same line
        System.out.println(cities);
        //print first and last cities
        System.out.println("first city = " + cities.get(0));
        System.out.println("last city = " + cities.get(5));
        //find last index using size()-1
        System.out.println("last city = " + cities.get(cities.size() - 1));
        //print count of items in arrayList
        System.out.println("count of items = " + cities.size());

        int size = cities.size();
        System.out.println("There are " + size + " cities in the list.");

        //for loop and print values in same line
        for (int i = 0; i < size; i++) {
            System.out.print(cities.get(i) + " ");
        }

        //for each loop

        for(String city : cities) {
            System.out.print(city = " ");
        }
        System.out.println();

        //delete an item from arrayList
        //1) remove using index. remove value at index 3
        cities.remove(3);
        //2) remove using object/value
        cities.remove("New York");
        System.out.println("after remove = " + cities);

        //remove all values from list
        cities.clear();

        //make sure it's clear
        //1)print it out
        System.out.println(cities);

        //2)using isEmpty
        if(cities.isEmpty()) {
            System.out.println("List is empty");
        }

        //3) check size
        if(cities.size() == 0) {
            System.out.println("list is empty");
        }

    }
}
