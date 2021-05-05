package day41_arrayList;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        //cars list
        List<String> myCars = new ArrayList<>();
        myCars.add("toyota");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("moscvich");
        myCars.add("tesla");
        myCars.add(0, "jeep");
        myCars.add(1, "lada");
        myCars.add(2, "yugo");

        //jeep, lada, yugo, toyota, mazda, moscvich, tesla

        System.out.println(myCars.toString());
        String allCarsin1St = myCars.toString();
        System.out.println("allCarsin1St = " + allCarsin1St);

        //change index 0 to Lamorghini
        myCars.set(0, "lamborghini");
        System.out.println("after set = " + myCars.toString());

        //change 4 to Honda



        //find the index number of "ford"

        System.out.println("index of ford = " + myCars.indexOf("ford"));
        int moscvichIndex = myCars.lastIndexOf("moscvich");
        System.out.println("moscvichIndex = " + moscvichIndex);

        //change moscvich to subaru

        myCars.set(myCars.lastIndexOf("ford"), "subaru");
        System.out.println("after change moscvich to subaru = " + myCars);

        //lada -> bugatti
        // if myCars contains "lada" find index value of lada and set it to bugatti

        if(myCars.contains("lada")) {
            myCars.set(myCars.indexOf("lada"), "bugatti");
            System.out.println("after set bugatti = " + myCars);
        } else{
            System.out.println("Lada is not there");
        }


        for (int i = 0; i < myCars.size(); i++) {
            if(myCars.get(i).contains("lamborghini")) {
                myCars.set(myCars.indexOf("lamborghini"), "prius");
            } else if(myCars.get(i).contains("toyota")) {
                myCars.set(myCars.indexOf("toyota"), "lexus");
            } else if(myCars.get(i).contains("trabant")) {
                myCars.set(myCars.indexOf("trabant"), "audi");
            }

        }

        System.out.println("after loop = " + myCars);

    }
}
